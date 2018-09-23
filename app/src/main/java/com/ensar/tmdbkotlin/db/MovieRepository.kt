package com.ensar.tmdbkotlin.db

import com.ensar.tmdbkotlin.db.entities.Movie
import com.ensar.tmdbkotlin.db.local.AppDatabase
import com.ensar.tmdbkotlin.db.remote.MovieService
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import timber.log.Timber
import javax.inject.Inject

/**
 * Created by Ensar Bayhan on 9/18/2018.
 */
class MovieRepository @Inject constructor(private val remote: MovieService, private val local: AppDatabase) {
    fun getMovie(id: Long): Observable<Movie> {
        return Observable.concatArray(
//                getMovieFromDb(id),
                getMovieFromApi(id))
    }

    private fun getMovieFromDb(id: Long): Observable<Movie> {
        return local.movieDao().getMovie(id)
                .toObservable()
                .doOnNext {
                    Timber.d("Dispatching ${it.title} from DB...")
                }
    }

    private fun getMovieFromApi(id: Long): Observable<Movie> {
        return remote.getMovie(id)
                .doOnNext {
                    Timber.d("Dispatching ${it.title} from API...")
                    storeMovieInDb(it)
                }
    }

    private fun storeMovieInDb(movie: Movie) {
        Observable.fromCallable { local.movieDao().insertMovie(movie) }
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe {
                    Timber.d("Inserted ${movie.title} users from API in DB...")
                }

    }
}