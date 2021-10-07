package com.unab.poo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        claseHerencia()
    }

    private fun claseHerencia(){
        val cocinero = Cocinero("Andres", 20, "Italiana")
        cocinero.trabajar()
        cocinero.voyATrabajar()
        cocinero.estiloDeCocina()

        val carpintero = Carpintero("Alfonso", 25)
        carpintero.trabajar()

    }
}