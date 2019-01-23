package com.ensar.tmdbkotlin.db.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ensar.tmdbkotlin.db.entities.Movie
import io.reactivex.Single

/**
 * Created by Ensar Bayhan on 8/15/2018.
 */

@Dao
interface MovieDao {

    @Query("SELECT * FROM Movie ORDER BY orderId")
    fun getMovies(): Single<List<Movie>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovies(example: List<Movie>)
}