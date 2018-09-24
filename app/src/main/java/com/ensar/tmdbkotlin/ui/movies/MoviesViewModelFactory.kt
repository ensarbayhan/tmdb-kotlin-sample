package com.ensar.tmdbkotlin.ui.movies

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import javax.inject.Inject

/**
 * Created by Ensar Bayhan on 9/18/2018.
 */

class MoviesViewModelFactory @Inject constructor(private val repository: MoviesRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MoviesViewModel(repository) as T
    }
}