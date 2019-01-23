package com.ensar.tmdbkotlin.ui.movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.ensar.tmdbkotlin.R
import com.ensar.tmdbkotlin.db.entities.Movie
import com.ensar.tmdbkotlin.utils.toast
import kotlinx.android.synthetic.main.fragment_movies.*
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * Created by Ensar Bayhan on 8/16/2018.
 */
class MoviesFragment : Fragment(), MoviesAdapter.OnClickListener {

    private val viewModel by viewModel<MoviesViewModel>()
    private val adapter = MoviesAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.moviesLiveData.observe(this, Observer {
            adapter.submitList(it)
            adapter.notifyDataSetChanged()
            movies_swipe_refresh_layout.isRefreshing = false
        })

        viewModel.genresLiveData.observe(this, Observer {
            adapter.genres = it
            adapter.notifyDataSetChanged()
        })
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_movies, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        movies_recycler_view.adapter = adapter
        movies_recycler_view.addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.HORIZONTAL))

        movies_swipe_refresh_layout.setOnRefreshListener {
            viewModel.refreshData()
        }
    }

    override fun onItemClicked(view: View, item: Movie) {
        toast(item.title + " clicked")
    }
}
