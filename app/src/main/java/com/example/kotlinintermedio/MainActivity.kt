package com.example.kotlinintermedio

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.LinearLayout.*
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    val tag = "MainActivity"
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recycler = findViewById<RecyclerView>(R.id.recycler)
        val layoutmanager = GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false)
        recycler.layoutManager= layoutmanager

        recycler.adapter = MovieAdapter(listOf(
            Movie("Avengers","https://lumiere-a.akamaihd.net/v1/images/p_avengersendgame_19751_e14a0104.jpeg?region=0%2C0%2C540%2C810?lock=1"),
            Movie("Avance","https://i.ytimg.com/vi/q9EVIDLPP1A/maxresdefault.jpg?lock=1"),
            Movie("Avengers Primera","https://mx.web.img2.acsta.net/r_654_368/newsv7/21/06/03/21/43/1967497.jpg?lock=1"),
            Movie("Aladin","https://www.laguiadelvaron.com/wp-content/uploads/2019/07/portadas-pel%C3%ADculas-iguales-www.laguiadelvaron-15.jpg"),
            Movie("pelicula","https://img.allvipp.com/www-promipool-de/image/upload/c_crop,h_3029,w_1706,x_686,y_1286/c_fill,h_1600,w_900/q_auto:eco/f_jpg/paul_walker_rapidos_y_furiosos_9_3_210414_gpl0fuatwolock=1"),

        ))

        //val movie = findViewById<Movievista>(R.id.movie1)
        //movie.setMovie(Movie("Avengers","https://lumiere-a.akamaihd.net/v1/images/p_avengersendgame_19751_e14a0104.jpeg?region=0%2C0%2C540%2C810"))

    }
}
