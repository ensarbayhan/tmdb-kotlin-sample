package com.ensar.tmdbkotlin.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ensar.tmdbkotlin.R
import com.ensar.tmdbkotlin.ui.movies.MoviesFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startMoviesFragment()
    }

    private fun startMoviesFragment() {
        val fragment = MoviesFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.commit()
    }
}