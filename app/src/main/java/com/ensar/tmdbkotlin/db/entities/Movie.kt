package com.ensar.tmdbkotlin.db.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Ensar Bayhan on 8/15/2018.
 */

@Entity()
class Movie {

    @PrimaryKey
    @SerializedName("id")
    @Expose
    var id: Int = 0

    @SerializedName("title")
    @Expose
    var title: String = ""

    @SerializedName("backdrop_path")
    @Expose
    var backdrop_path: String = ""

    @SerializedName("poster_path")
    @Expose
    var poster_path: String = ""
}