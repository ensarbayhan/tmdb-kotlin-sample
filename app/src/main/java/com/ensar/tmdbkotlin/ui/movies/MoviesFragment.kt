package com.ensar.tmdbkotlin.ui.movies

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.ensar.tmdbkotlin.R
import com.ensar.tmdbkotlin.db.entities.Movie
import com.ensar.tmdbkotlin.utils.toast
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_movies.*
import javax.inject.Inject

/**
 * Created by Ensar Bayhan on 8/16/2018.
 */

class MoviesFragment : Fragment(), MoviesAdapter.OnClickListener {

    private lateinit var viewModel: MoviesViewModel
    private lateinit var adapter: MoviesAdapter

    @Inject
    lateinit var viewModelFactory: MoviesViewModelFactory

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        AndroidSupportInjection.inject(this)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MoviesViewModel::class.java)
        adapter = MoviesAdapter(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_movies, container, false)
        viewModel.moviesLiveData.observe(this, Observer {
            adapter.submitList(it)
            adapter.notifyDataSetChanged()
        })
        viewModel.genresLiveData.observe(this, Observer {
            adapter.genres = it
            adapter.notifyDataSetChanged()
        })
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        movies_recycler_view.adapter = adapter
        movies_recycler_view.addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.HORIZONTAL))
    }

    override fun onItemClicked(view: View, item: Movie) {
        toast(item.title + " clicked")
    }
}
