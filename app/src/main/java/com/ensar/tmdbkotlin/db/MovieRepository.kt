package com.ensar.tmdbkotlin.db

import com.ensar.tmdbkotlin.db.entities.Movie
import com.ensar.tmdbkotlin.db.local.AppDatabase
import com.ensar.tmdbkotlin.db.remote.AppService
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import timber.log.Timber
import javax.inject.Inject

/**
 * Created by Ensar Bayhan on 9/18/2018.
 */
class MovieRepository @Inject constructor(private val remote: AppService, private val local: AppDatabase) {
    fun getMovies(): Observable<List<Movie>> {
        return Observable.concatArray(
                getMoviesFromDb(),
                getMoviesFromApi()
        )
    }

    private fun getMoviesFromDb(): Observable<List<Movie>> {
        return local.movieDao().getMovies()
                .toObservable()
                .doOnNext {
                    Timber.d("Dispatching ${it.size} from DB...")
                }.doOnError {
                    Timber.d("Error!!!!%s", it.message)
                }
    }

    private fun getMoviesFromApi(): Observable<List<Movie>> {
        return remote.getMovies()
                .map { it.movies }
                .doOnNext {
                    Timber.d("Dispatching ${it.size} from API...")
                    storeMoviesInDb(it)
                }.doOnError {
                    Timber.d("Error!!!!%s", it.message)
                }
    }

    private fun storeMoviesInDb(movies: List<Movie>) {
        Observable.fromCallable { local.movieDao().insertMovies(movies) }
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe {
                    Timber.d("Inserted ${movies.size} users from API in DB...")
                }

    }
}