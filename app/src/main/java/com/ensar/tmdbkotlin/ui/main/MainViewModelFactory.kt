package com.ensar.tmdbkotlin.ui.main

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import javax.inject.Inject

/**
 * Created by Ensar Bayhan on 9/18/2018.
 */

class MainViewModelFactory @Inject constructor(val repository: MainRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}