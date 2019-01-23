package com.ensar.tmdbkotlin.ui.movies

import com.ensar.tmdbkotlin.db.GenreRepository
import com.ensar.tmdbkotlin.db.MovieRepository
import com.ensar.tmdbkotlin.db.entities.Genre
import com.ensar.tmdbkotlin.db.entities.Movie
import io.reactivex.Observable
import java.util.concurrent.TimeUnit

/**
 * Created by Ensar Bayhan on 9/18/2018.
 */

class MoviesRepository(private val movieRepository: MovieRepository,
                       private val genreRepository: GenreRepository) {

    fun getMovies(): Observable<List<Movie>> = movieRepository.getMovies()
            .debounce(400, TimeUnit.MILLISECONDS)

    fun getGenres(): Observable<List<Genre>> = genreRepository.getGenres()
            .debounce(400, TimeUnit.MILLISECONDS)
}