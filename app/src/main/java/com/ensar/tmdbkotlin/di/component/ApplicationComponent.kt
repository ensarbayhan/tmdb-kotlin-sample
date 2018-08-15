package com.ensar.tmdbkotlin.di.component

import android.content.Context
import android.content.SharedPreferences
import com.ensar.tmdbkotlin.App
import com.ensar.tmdbkotlin.db.remote.MovieService
import com.ensar.tmdbkotlin.di.module.ApplicationModule
import com.ensar.tmdbkotlin.di.module.DatabaseModule
import com.ensar.tmdbkotlin.ui.main.MainActivityViewModel

import com.ensar.tmdbkotlin.di.module.NetModule

import dagger.Component
import javax.inject.Singleton


@Singleton

@Component(modules = [(ApplicationModule::class), (NetModule::class), (DatabaseModule::class)])
interface ApplicationComponent {
    fun app(): App

    fun context(): Context

    fun preferences(): SharedPreferences

    fun inject(mainActivityViewModel: MainActivityViewModel)

    fun service(service: MovieService)
}
