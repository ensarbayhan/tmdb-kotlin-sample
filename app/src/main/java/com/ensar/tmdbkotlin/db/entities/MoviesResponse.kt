package com.ensar.tmdbkotlin.db.entities

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MoviesResponse(
        @SerializedName("results")
        @Expose
        var movies: List<Movie>)