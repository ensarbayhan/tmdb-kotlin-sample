package com.ensar.tmdbkotlin.ui.main

import android.app.Application
import com.ensar.tmdbkotlin.db.local.AppDatabase
import com.ensar.tmdbkotlin.R
import com.ensar.tmdbkotlin.App
import com.ensar.tmdbkotlin.core.BaseViewModel
import com.ensar.tmdbkotlin.db.remote.MovieService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MainActivityViewModel(app: Application) : BaseViewModel(app) {
    // private var examples: LiveData<List<Example>>? = null

    @Inject
    lateinit var db: AppDatabase

    @Inject
    lateinit var movieService: MovieService

    var movieData = "Yükleniyor.."

    init {
        (app as? App)?.component?.inject(this)
        movieService.getMovie(550)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe( {
                    movie ->
                    movieData = movie.title
                })
    }

    fun getAppName() = getApplication<Application>().resources.getString(R.string.app_name)


    /* Example Usage Of LiveData
    fun getExamples(): LiveData<List<Example>> {
        if (examples == null) {
            examples = MutableLiveData<List<Note>>()
            loadExamples()
        }

        return examples!!;
    }

    private fun loadExamples() {
        examples = db.exampleDao().getExamples()
    }
    */

}