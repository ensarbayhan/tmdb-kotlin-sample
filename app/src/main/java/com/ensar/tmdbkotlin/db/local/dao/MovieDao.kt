package com.ensar.tmdbkotlin.db.local.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.ensar.tmdbkotlin.db.entities.Movie
import io.reactivex.Single

/**
 * Created by Ensar Bayhan on 8/15/2018.
 */

@Dao
interface MovieDao {

    @Query("SELECT * FROM Movie")
    fun getMovies(): Single<List<Movie>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovies(example: List<Movie>)
}