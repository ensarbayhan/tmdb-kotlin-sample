package com.ensar.tmdbkotlin

import android.app.Application
import com.ensar.tmdbkotlin.di.KoinDSL
import org.koin.android.ext.android.startKoin
import timber.log.Timber

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        // Koin
        startKoin(this, listOf(KoinDSL.networkModule, KoinDSL.movieRepositoryModule, KoinDSL.viewModelModule))

        // Timber
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}
