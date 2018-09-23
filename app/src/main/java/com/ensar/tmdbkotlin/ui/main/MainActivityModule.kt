package com.ensar.tmdbkotlin.ui.main

import dagger.Module
import dagger.Provides

/**
 * Created by Ensar Bayhan on 9/18/2018.
 */

@Module
class MainActivityModule {

    @Provides
    fun provideViewModelFactory() = MainViewModelFactory()
}