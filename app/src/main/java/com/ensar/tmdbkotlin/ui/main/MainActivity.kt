package com.ensar.tmdbkotlin.ui.main

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.ensar.tmdbkotlin.R
import com.ensar.tmdbkotlin.ui.movies.MoviesFragment
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: MainViewModelFactory

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)
        startMoviesFragment()
    }

    fun startMoviesFragment() {
        val fragment = MoviesFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.commit()

    }
}