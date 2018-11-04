package com.ensar.tmdbkotlin.ui.movies

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.ensar.tmdbkotlin.db.entities.Genre
import com.ensar.tmdbkotlin.db.entities.Movie
import com.ensar.tmdbkotlin.utils.DefaultDiffUtil

class MoviesAdapter(private val listener: OnClickListener) :
        ListAdapter<Movie, MovieViewHolder>(DefaultDiffUtil<Movie>()) {

    var genres: List<Genre>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(getItem(position), genres, listener)
    }

    interface OnClickListener {
        fun onItemClicked(view: View, item: Movie)
    }
}
