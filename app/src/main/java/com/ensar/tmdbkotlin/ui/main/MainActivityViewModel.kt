package com.ensar.tmdbkotlin.ui.main

import android.app.Application
import android.arch.lifecycle.MutableLiveData
import com.ensar.tmdbkotlin.App
import com.ensar.tmdbkotlin.R
import com.ensar.tmdbkotlin.core.BaseViewModel
import com.ensar.tmdbkotlin.db.entities.Movie
import com.ensar.tmdbkotlin.db.local.AppDatabase
import com.ensar.tmdbkotlin.db.remote.MovieService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


class MainActivityViewModel(app: Application) : BaseViewModel(app) {

    private val disposable = CompositeDisposable()

    private var movie = MutableLiveData<Movie>()

    @Inject
    lateinit var db: AppDatabase

    @Inject
    lateinit var movieService: MovieService

    var movieData = "Yükleniyor.."

    init {
        (app as? App)?.component?.inject(this)
        showMovie(550)
    }

    fun getAppName() = getApplication<Application>().resources.getString(R.string.app_name)

    private fun showMovie(id: Int) {
        disposable.addAll(movieService.getMovie(id)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableObserver<Movie>() {
                    override fun onComplete() {

                    }

                    override fun onNext(movie: Movie) {
                        movieData = movie.title
                    }

                    override fun onError(e: Throwable) {

                    }
                }))
    }

    override fun onCleared() {
        disposable.clear()
    }
}