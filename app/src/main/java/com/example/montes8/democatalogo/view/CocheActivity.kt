package com.example.montes8.democatalogo.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.montes8.democatalogo.R
import kotlinx.android.synthetic.main.activity_coche.*

class CocheActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coche)
        //recibiemos los valores que nos manda desde el activity y lo renderisamos
        val bundle:Bundle=intent.extras
        val imagen=bundle.getInt("imagen")
        val titulo=bundle.getString("titulo")
        val descripcion=bundle.getString("descripcion")
        val precio=bundle.getString("precio")
        //los rellenamos otra ves
        image_view2.setImageResource(imagen)
        text_titulo2.text=titulo
        text_descripcion2.text=descripcion
        text_precio2.text=precio.toString()
    }
}
