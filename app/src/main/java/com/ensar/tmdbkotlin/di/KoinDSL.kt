package com.ensar.tmdbkotlin.di

import com.ensar.tmdbkotlin.db.GenreRepository
import com.ensar.tmdbkotlin.db.MovieRepository
import com.ensar.tmdbkotlin.ui.movies.MoviesRepository
import com.ensar.tmdbkotlin.ui.movies.MoviesViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

/**
 * Created by ebayhan on 22.01.2019.
 */
object KoinDSL {
    val viewModelModule = module {
        viewModel { MoviesViewModel(get()) }
    }

    val movieRepositoryModule = module {
        single { MoviesRepository(movieRepository = get(), genreRepository = get()) }
        single { MovieRepository(remote = get(), local = get()) }
        single { GenreRepository(remote = get(), local = get()) }
    }

    val networkModule = module {
        single { NetworkModule.getRemote() }
        single { NetworkModule.getLocal(androidContext()) }
    }
}