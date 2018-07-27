package com.example.montes8.democatalogo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import kotlinx.android.synthetic.main.activity_articulos.*

class ArticulosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_articulos)
        cambiarFragmento(AutosFragment())

        button_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_autos -> {
                    cambiarFragmento(AutosFragment())
                }
                R.id.navigation_ropa -> {
                    cambiarFragmento(RopaFragment())
                }
                R.id.navigation_articulos -> {
                    cambiarFragmento(ArticulosFragment())
                }
            }
            return@setOnNavigationItemSelectedListener true
        }
    }

    fun cambiarFragmento(fragment: Fragment?){
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.content_frame,fragment)
                .commit()

    }


}
