package com.example.montes8.democatalogo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var animationButton: Animation? = null
    var animation: Animation? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animationButton = AnimationUtils.loadAnimation(this, R.anim.animacion_botton)
        animation = AnimationUtils.loadAnimation(this, R.anim.animacion)

        sub.animation = animationButton
        bellow.animation = animation

        llamarSplash()

    }

    fun llamarSplash (){
        val background = object : Thread() {
            override fun run() {
                try {
                    Thread.sleep((3*1000).toLong())


                        val i = Intent(baseContext, HomeActivity::class.java)
                        startActivity(i)


                    finish()
                } catch (e: Exception) {
                    e.printStackTrace()
                }

            }
        }
        background.start()
    }
}
