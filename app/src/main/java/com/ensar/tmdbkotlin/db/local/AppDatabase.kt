package com.ensar.tmdbkotlin.db.local

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import com.ensar.tmdbkotlin.db.GenreTypeConverters
import com.ensar.tmdbkotlin.db.entities.Genre
import com.ensar.tmdbkotlin.db.entities.Movie
import com.ensar.tmdbkotlin.db.local.dao.GenreDao
import com.ensar.tmdbkotlin.db.local.dao.MovieDao

@Database(entities = [(Movie::class), (Genre::class)], version = 1)
@TypeConverters(GenreTypeConverters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao
    abstract fun genreDao(): GenreDao
}