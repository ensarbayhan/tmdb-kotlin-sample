package com.ensar.tmdbkotlin.db.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity()
data class Genre(
        @PrimaryKey
        @SerializedName("id")
        @Expose
        var id: Int?,

        @SerializedName("name")
        @Expose
        var name: String?)