package com.ensar.tmdbkotlin.ui.main

import com.ensar.tmdbkotlin.R
import com.ensar.tmdbkotlin.core.BaseActivity
import com.ensar.tmdbkotlin.databinding.ActivityMainBinding

class MainActivity : BaseActivity<MainActivityViewModel, ActivityMainBinding>(MainActivityViewModel::class.java) {
    override fun initViewModel(viewModel: MainActivityViewModel) {
        binding.viewModel = viewModel
    }

    override fun getLayoutRes() = R.layout.activity_main
}
