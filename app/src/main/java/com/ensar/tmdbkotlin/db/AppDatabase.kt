package com.ensar.tmdbkotlin.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.ensar.tmdbkotlin.db.dao.ExampleDao
import com.ensar.tmdbkotlin.db.entities.Example

@Database(entities = arrayOf(Example::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun exampleDao(): ExampleDao
}