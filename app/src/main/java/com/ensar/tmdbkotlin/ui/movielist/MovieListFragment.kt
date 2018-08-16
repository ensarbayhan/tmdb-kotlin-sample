package com.ensar.tmdbkotlin.ui.movielist

import com.ensar.tmdbkotlin.R
import com.ensar.tmdbkotlin.core.BaseFragment
import com.ensar.tmdbkotlin.databinding.FragmentMovieListBinding

/**
 * Created by Ensar Bayhan on 8/16/2018.
 */

class MovieListFragment : BaseFragment<MovieListViewModel, FragmentMovieListBinding>(MovieListViewModel::class.java) {
    override fun initViewModel(viewModel: MovieListViewModel) {
        binding.viewModel = viewModel
    }

    override fun getLayoutRes() = R.layout.fragment_movie_list
}
