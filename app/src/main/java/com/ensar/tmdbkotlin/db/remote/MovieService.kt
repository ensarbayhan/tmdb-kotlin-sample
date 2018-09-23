package com.ensar.tmdbkotlin.db.remote

import com.ensar.tmdbkotlin.db.entities.Movie
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by Ensar Bayhan on 8/15/2018.
 */

interface MovieService {

    @GET("movie/{id}")
    fun getMovie(@Path("id") id: Long): Observable<Movie>

    @GET("movie/popular")
    fun getMovies(): Observable<List<Movie>>
}