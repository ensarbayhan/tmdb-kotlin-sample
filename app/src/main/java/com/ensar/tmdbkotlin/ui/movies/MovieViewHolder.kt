package com.ensar.tmdbkotlin.ui.movies

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ensar.tmdbkotlin.R
import com.ensar.tmdbkotlin.databinding.ItemMovieBinding
import com.ensar.tmdbkotlin.db.entities.Genre
import com.ensar.tmdbkotlin.db.entities.Movie

class MovieViewHolder(private val itemBinding: ItemMovieBinding)
    : RecyclerView.ViewHolder(itemBinding.root) {

    companion object {
        fun create(parent: ViewGroup): MovieViewHolder {
            val binding = DataBindingUtil.inflate<ItemMovieBinding>(
                    LayoutInflater.from(parent.context),
                    R.layout.item_movie, parent, false)
            return MovieViewHolder(binding)
        }
    }

    fun bind(item: Movie, genres: List<Genre>?, listener: MoviesAdapter.OnClickListener) {
        itemBinding.item = item
        itemBinding.movieYear.text = item.releaseDate?.split("-")?.get(0)
        itemBinding.listener = listener
        itemBinding.executePendingBindings()
        var genreText = ""
        if (genres != null) {
            item.genreIds.forEachIndexed { index, genreId ->
                genreText += genres.find {
                    it.id == genreId
                }?.name
                if (index != item.genreIds.size - 1) {
                    genreText += ", "
                }

            }
        }
        itemBinding.movieGenres.text = genreText
    }
}