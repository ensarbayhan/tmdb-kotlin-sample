package com.ensar.tmdbkotlin.ui.movies

import com.ensar.tmdbkotlin.db.MovieRepository
import com.ensar.tmdbkotlin.db.entities.Movie
import io.reactivex.Observable
import java.util.concurrent.TimeUnit
import javax.inject.Inject

/**
 * Created by Ensar Bayhan on 9/18/2018.
 */

class MoviesRepository @Inject constructor(private val movieRepository: MovieRepository) {

    fun getMovies(): Observable<List<Movie>> = movieRepository.getMovies()
            .debounce(400, TimeUnit.MILLISECONDS)
}