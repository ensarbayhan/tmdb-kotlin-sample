package com.ensar.tmdbkotlin.ui.movies

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.ensar.tmdbkotlin.db.entities.Genre
import com.ensar.tmdbkotlin.db.entities.Movie
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

/**
 * Created by Ensar Bayhan on 8/16/2018.
 */

class MoviesViewModel(private val repository: MoviesRepository) : ViewModel() {

    private var disposable = CompositeDisposable()

    val moviesLiveData = MutableLiveData<List<Movie>>()
    val genresLiveData = MutableLiveData<List<Genre>>()

    init {
        getMovies()
        getGenres()
    }

    private fun getMovies() {
        disposable.add(repository.getMovies()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    moviesLiveData.postValue(it)
                })
    }

    private fun getGenres() {
        disposable.add(repository.getGenres()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    genresLiveData.postValue(it)
                })
    }

    override fun onCleared() {
        disposable.dispose()
    }
}