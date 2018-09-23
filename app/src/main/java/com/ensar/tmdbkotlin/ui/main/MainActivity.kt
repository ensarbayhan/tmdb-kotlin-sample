package com.ensar.tmdbkotlin.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import com.ensar.tmdbkotlin.R
import com.ensar.tmdbkotlin.databinding.ActivityMainBinding
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: MainViewModelFactory

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)
        binding.setLifecycleOwner(this)
        binding.viewModel = viewModel
    }

}
