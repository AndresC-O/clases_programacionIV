package com.unab.setyget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        empleado()
    }

    fun empleado(){

        var e1 = Empleado()
        e1.edad = 19
        e1.nombre = "Andresito guapo"
        println(e1.edad)
        println(e1.nombre)
    }
}