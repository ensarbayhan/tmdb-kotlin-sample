package com.ensar.tmdbkotlin.domain

import com.ensar.tmdbkotlin.db.entities.Movie
import io.reactivex.Flowable
import io.reactivex.Single


/**
 * Created by Ensar Bayhan on 8/16/2018.
 */

class GetMovieUseCase(val movieRepository: MovieRepository) {

    fun getMovies() : Flowable<List<Movie>> {
        return  movieRepository.getMovies()
    }

    fun getMovie(id : Int) : Single<Movie> {
        return  movieRepository.getMovie(id)
    }
}