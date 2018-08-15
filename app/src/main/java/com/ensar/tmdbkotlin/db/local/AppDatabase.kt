package com.ensar.tmdbkotlin.db.local

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.ensar.tmdbkotlin.db.local.dao.MovieDao
import com.ensar.tmdbkotlin.db.entities.Movie

@Database(entities = [(Movie::class)], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao
}