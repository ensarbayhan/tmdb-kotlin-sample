package com.ensar.tmdbkotlin.ui.movies

import android.databinding.DataBindingUtil
import android.support.v7.recyclerview.extensions.ListAdapter
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ensar.tmdbkotlin.R
import com.ensar.tmdbkotlin.databinding.ItemMovieBinding
import com.ensar.tmdbkotlin.db.entities.Movie
import com.ensar.tmdbkotlin.utils.DefaultDiffUtil

class MoviesAdapter(private val listener: OnClickListener) :
        ListAdapter<Movie, MoviesAdapter.MoviesViewHolder>(DefaultDiffUtil<Movie>()) {

    interface OnClickListener {
        fun onItemClicked(view: View, item: Movie)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val binding = DataBindingUtil.inflate<ItemMovieBinding>(
                LayoutInflater.from(parent.context),
                R.layout.item_movie, parent, false)
        return MoviesViewHolder(binding, listener)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class MoviesViewHolder(private val itemBinding: ItemMovieBinding,
                           private val listener: OnClickListener) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(item: Movie) {
            itemBinding.item = item
            itemBinding.listener = listener
            itemBinding.executePendingBindings()
        }
    }

}
