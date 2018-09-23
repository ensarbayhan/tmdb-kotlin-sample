package com.ensar.tmdbkotlin.di

import com.ensar.tmdbkotlin.ui.main.MainActivity
import com.ensar.tmdbkotlin.ui.main.MainActivityModule
import com.ensar.tmdbkotlin.ui.movies.MoviesFragment
import com.ensar.tmdbkotlin.ui.movies.MoviesFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Ensar Bayhan on 9/18/2018.
 */

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [MoviesFragmentModule::class])
    abstract fun bindMoviesFragment(): MoviesFragment

}