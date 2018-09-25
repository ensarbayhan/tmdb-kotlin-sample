package com.ensar.tmdbkotlin.db.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Ensar Bayhan on 8/15/2018.
 */

@Entity()
data class Movie(
        @PrimaryKey
        @SerializedName("id")
        @Expose
        var id: Int?,

        @SerializedName("title")
        @Expose
        var title: String?,

        @SerializedName("vote_average")
        @Expose
        var voteAverage: String?,

        @SerializedName("backdrop_path")
        @Expose
        var backdropPath: String?,

        @SerializedName("release_date")
        @Expose
        var releaseDate: String?,

        @SerializedName("overview")
        @Expose
        var overview: String?,

        @SerializedName("poster_path")
        @Expose
        var posterPath: String?)