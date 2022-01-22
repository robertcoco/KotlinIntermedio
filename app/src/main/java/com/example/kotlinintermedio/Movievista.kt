package com.example.kotlinintermedio

import android.content.Context
import android.graphics.Movie
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import com.bumptech.glide.Glide

class Movievista @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {
    private val imagen:MeasureRatio
    private val text:TextView
    init  {
        val view = LayoutInflater.from(context).inflate(R.layout.viewmovie,this,true)
        imagen = view.findViewById(R.id.imagen)
        text = view.findViewById(R.id.text)
        orientation = LinearLayout.VERTICAL
        val ratio = 1
        fun widthOfText(){
                text.width = (imagen.width*ratio)
        }
        widthOfText()
    }
    fun setMovie(movie:com.example.kotlinintermedio.Movie){
        text.text = movie.title
        Glide.with(context).load(movie.cover).into(imagen)
    }
}