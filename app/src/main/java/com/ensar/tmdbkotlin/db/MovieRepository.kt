package com.ensar.tmdbkotlin.db

import com.ensar.tmdbkotlin.db.entities.Movie
import com.ensar.tmdbkotlin.db.local.AppDatabase
import com.ensar.tmdbkotlin.db.remote.AppService
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import timber.log.Timber

/**
 * Created by Ensar Bayhan on 9/18/2018.
 */
class MovieRepository(private val remote: AppService, private val local: AppDatabase) {
    fun getMovies(): Observable<List<Movie>> {
        return Observable.concatArray(
                getMoviesFromDb(),
                getMoviesFromApi().materialize()
                        .filter { !it.isOnError }
                        .dematerialize<List<Movie>>()
        )
    }

    private fun getMoviesFromDb(): Observable<List<Movie>> {
        return local.movieDao().getMovies()
                .toObservable()
                .doOnNext {
                    Timber.d("Dispatching ${it.size} from DB...")
                }.doOnError {
                    Timber.d("Error!!!!${it.message}")
                }
    }

    private fun getMoviesFromApi(): Observable<List<Movie>> {
        return remote.getMovies()
                .map { it.movies }
                .doOnNext {
                    Timber.d("Dispatching ${it.size} from API...")
                    storeMoviesInDb(it)
                }.doOnError {
                    Timber.d("Error!!!! ${it.message}")
                }
    }

    private fun storeMoviesInDb(movies: List<Movie>) {
        movies.forEachIndexed { index, movie -> movie.orderId = index }
        Observable.fromCallable { local.movieDao().insertMovies(movies) }
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe {
                    Timber.d("Inserted ${movies.size} users from API in DB...")
                }
    }
}