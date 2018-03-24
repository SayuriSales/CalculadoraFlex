package com.sales.sayuri.calculadoraflex

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {

    val tempoDoSplash = 2500L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        carregar()
    }

    fun carregar() {
        Handler() .postDelayed({
            startActivity(Intent(this,FormularioActivity::class.java))
            finish()
        }, tempoDoSplash)
    }
}
