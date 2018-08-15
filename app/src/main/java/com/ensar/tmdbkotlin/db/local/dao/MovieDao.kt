package com.ensar.tmdbkotlin.db.local.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*
import com.ensar.tmdbkotlin.db.entities.Movie

/**
 * Created by Ensar Bayhan on 8/15/2018.
 */

@Dao
interface MovieDao {

    @Query("SELECT * FROM Movie")
    fun getMovies(): LiveData<List<Movie>>

    @Query("SELECT * FROM Movie where id = :id")
    fun getMovie(id: Long): Movie

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovie(example: Movie)

    @Update
    fun updateMovie(example: Movie)

    @Delete
    fun deleteMovie(example: Movie)

    @Query("Select count(*) from Movie")
    fun getMoviesCount(): Int

}