package com.ensar.tmdbkotlin.db.local.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.ensar.tmdbkotlin.db.entities.Genre
import io.reactivex.Single

@Dao
interface GenreDao {

    @Query("SELECT * FROM Genre")
    fun getGenres(): Single<List<Genre>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertGenres(example: List<Genre>)
}