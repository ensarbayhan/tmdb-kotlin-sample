package com.ensar.tmdbkotlin.db.entities

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class GenresResponse(
        @SerializedName("genres")
        @Expose
        var genres: List<Genre>)