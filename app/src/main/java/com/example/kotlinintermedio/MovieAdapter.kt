package com.example.kotlinintermedio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MovieAdapter(val movie:List<Movie>):RecyclerView.Adapter<MovieAdapter.ViewHolder>() {
    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        private val imagen = view.findViewById<ImageView>(R.id.imagen)
        private val text = view.findViewById<TextView>(R.id.text)

        fun bind(movie:Movie){
            text.text = movie.title
            Glide.with(imagen.context).load(movie.cover).into(imagen)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewmovie,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movies = movie[position]
        holder.bind(movies)

    }

    override fun getItemCount(): Int = movie.size
}