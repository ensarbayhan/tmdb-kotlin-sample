package com.ensar.tmdbkotlin.domain

import com.ensar.tmdbkotlin.db.entities.Movie
import io.reactivex.Flowable
import io.reactivex.Single

/**
 * Created by Ensar Bayhan on 8/16/2018.
 */

interface MovieRepository {
    fun getMovie(id : Int) : Single<Movie>
    fun getMovies() : Flowable<List<Movie>>
}