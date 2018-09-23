package com.ensar.tmdbkotlin.db.local.dao

import android.arch.persistence.room.*
import com.ensar.tmdbkotlin.db.entities.Movie
import io.reactivex.Single

/**
 * Created by Ensar Bayhan on 8/15/2018.
 */

@Dao
interface MovieDao {

    @Query("SELECT * FROM Movie")
    fun getMovies(): Single<List<Movie>>

    @Query("SELECT * FROM Movie where id = :id")
    fun getMovie(id: Long): Single<Movie>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovie(example: Movie)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovies(example: List<Movie>)

    @Update
    fun updateMovie(example: Movie)

    @Delete
    fun deleteMovie(example: Movie)

    @Query("Select count(*) from Movie")
    fun getMoviesCount(): Int

}