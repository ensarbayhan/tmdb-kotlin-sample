package com.ensar.tmdbkotlin.db

import com.ensar.tmdbkotlin.db.entities.Genre
import com.ensar.tmdbkotlin.db.local.AppDatabase
import com.ensar.tmdbkotlin.db.remote.AppService
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import timber.log.Timber

class GenreRepository(private val remote: AppService, private val local: AppDatabase) {

    fun getGenres(): Observable<List<Genre>> {
        return Observable.concatArray(
                getGenresFromDb(),
                getGenresFromApi().materialize()
                        .filter { !it.isOnError }
                        .dematerialize<List<Genre>>()
        )
    }

    private fun getGenresFromDb(): Observable<List<Genre>> {
        return local.genreDao().getGenres()
                .toObservable()
                .doOnNext {
                    Timber.d("Dispatching ${it.size} from DB...")
                }.doOnError {
                    Timber.d("Error!!!!%s", it.message)
                }
    }

    private fun getGenresFromApi(): Observable<List<Genre>> {
        return remote.getGenres()
                .map { it.genres }
                .doOnNext {
                    Timber.d("Dispatching ${it.size} from API...")
                    storeGenresInDb(it)
                }.doOnError {
                    Timber.d("Error!!!!%s", it.message)
                }
    }

    private fun storeGenresInDb(genres: List<Genre>) {
        Observable.fromCallable { local.genreDao().insertGenres(genres) }
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe {
                    Timber.d("Inserted ${genres.size} users from API in DB...")
                }
    }
}