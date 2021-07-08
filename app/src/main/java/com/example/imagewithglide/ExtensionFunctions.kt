package com.example.imagewithglide

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.GlideBuilder

fun ImageView.loadWithGlide(url:String){
    Glide.with(context).load(url).into(this)
}