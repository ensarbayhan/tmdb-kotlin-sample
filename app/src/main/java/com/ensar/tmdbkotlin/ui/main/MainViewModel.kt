package com.ensar.tmdbkotlin.ui.main

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.ensar.tmdbkotlin.db.entities.Movie
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers


class MainViewModel(private val repository: MainRepository) : ViewModel() {

    private var disposable = CompositeDisposable()

    val movieLiveData = MutableLiveData<Movie>()

    init {
        getMovie()
    }

    private fun getMovie() {
        disposable.add(repository.getMovie()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    movieLiveData.postValue(it)
                })
    }

    override fun onCleared() {
        disposable.dispose()
    }
}