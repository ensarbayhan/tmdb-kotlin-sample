package com.ensar.tmdbkotlin.ui.movielist

import android.app.Application
import com.ensar.tmdbkotlin.App
import com.ensar.tmdbkotlin.core.BaseViewModel
import com.ensar.tmdbkotlin.db.local.AppDatabase
import javax.inject.Inject

/**
 * Created by Ensar Bayhan on 8/16/2018.
 */

class MovieListViewModel(app: Application) : BaseViewModel(app) {

    @Inject
    lateinit var db: AppDatabase

    init {
        (app as? App)?.component?.inject(this)
    }
}