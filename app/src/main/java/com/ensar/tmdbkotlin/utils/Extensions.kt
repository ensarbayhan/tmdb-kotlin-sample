package com.ensar.tmdbkotlin.utils

import android.app.Activity
import android.databinding.BindingAdapter
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso

@BindingAdapter("android:src")
fun ImageView.setImageUrl(url: String) {
    Picasso.get()
            .load(url)
            .into(this)
}

fun View.hide() {
    visibility = View.GONE
}

fun View.show() {
    visibility = View.VISIBLE
}

fun Activity.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) =
        Toast.makeText(this, message, duration).show()