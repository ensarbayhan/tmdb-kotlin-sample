package com.ensar.tmdbkotlin.ui.main

import com.ensar.tmdbkotlin.db.MovieRepository
import java.util.concurrent.TimeUnit
import javax.inject.Inject

/**
 * Created by Ensar Bayhan on 9/18/2018.
 */

class MainRepository @Inject constructor(private val movieRepository: MovieRepository) {

    fun getMovie() = movieRepository.getMovie(550)
            .debounce(400, TimeUnit.MILLISECONDS)
}