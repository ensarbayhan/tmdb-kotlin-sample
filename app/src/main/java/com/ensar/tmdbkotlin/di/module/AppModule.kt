package com.ensar.tmdbkotlin.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Ensar Bayhan on 9/18/2018.
 */

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideContext(application: Application): Context = application

}