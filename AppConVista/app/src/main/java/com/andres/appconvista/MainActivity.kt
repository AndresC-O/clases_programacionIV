package com.andres.appconvista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var etFullName:EditText
    private lateinit var pwPassword:EditText
    private lateinit var etPrimerDigito:EditText
    private lateinit var etSegundoDigito:EditText
    private var tvwResultado:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etFullName = findViewById(R.id.et_FullName)
        pwPassword = findViewById(R.id.pw_Password)
        etPrimerDigito = findViewById(R.id.et_PrimerDigito)
        etSegundoDigito = findViewById(R.id.et_SegundoDigito)
        tvwResultado =  findViewById(R.id.tvw_ResultadoFinal)
    }

    fun Registro(Vista:View){
        var fullname = etFullName.text.toString()
        var password = pwPassword.text.toString()

        if(fullname.isEmpty()){
            Toast.makeText(this,"Debes ingresar un nombre",Toast.LENGTH_LONG).show()
        }
        if(password.isEmpty()){
            Toast.makeText(this,"Debes ingresar una contraseña",Toast.LENGTH_LONG).show()
        }
        if(!fullname.isEmpty()&&!password.isEmpty()){
            Toast.makeText(this,"Procesando el registro...",Toast.LENGTH_LONG).show()
        }
    }

    fun Calcular(Vista: View){
        val valor1 = etPrimerDigito.text.toString()
        val valor2 = etSegundoDigito.text.toString()

        val num1:Int = Integer.parseInt(valor1)
        val num2:Int = Integer.parseInt(valor2)

        var suma = num1+num2
        var resultado:String = suma.toString()


        tvwResultado?.setText(resultado)


    }
}