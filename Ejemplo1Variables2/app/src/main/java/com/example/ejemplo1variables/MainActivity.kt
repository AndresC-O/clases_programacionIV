package com.example.ejemplo1variables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //variablesyconstantes()
        tiposDeDatos();
    }

    /*Esto es un comentario
    * con muchas lineas*/
    private fun variablesyconstantes(){
        //Variables
        var myPrimeraVariable = "Hola estudiantes de Ingenieria";
        println(myPrimeraVariable);
        myPrimeraVariable = "aqui estamos cambiando la cadena de caracteres que tiene la variable"

        var mySegundaVariable  = myPrimeraVariable
        println(mySegundaVariable)

        //Constantes
        val myPrimeraConstante = "Esto es una constante"
        println(myPrimeraConstante)
        //Una constante no se puede modificar,
        //val myPrimeraConstante = "Esto es otro valir que le estamos asignando a la constante";

        var myTerceraVariable: String = myPrimeraConstante;
        println(myPrimeraConstante)

        var numero = 1
        var mydouble = 2.1
        var myboolean = true
    }

    //Aqui crearemos hblaremos los tipos de datos
    private fun tiposDeDatos(){
        //String
        val myString = "Hola bienvenidos a la clase 1 (02/09/2021)"
        val myString2 = "El dia viernes 03 de septiembre hay clase presencial"
        val myString3 : String = myString+" "+myString2
        println(myString3)

        //Enteros(int,byte,long,chart
        val myInt = 1
        val myInt2: Int = 3
        val myInt3: Int = myInt + myInt2
        println(myInt3)

        //Decimales(Double, Float)
        val myFloat: Float = 1.7F
        val myfloat = 1.7F
        val mydouble = 1.3
        val mydouble2 = 1.4
        val mydouble3 = 1
        val mysumadouble = mydouble + mydouble2 + mydouble3
        println("SumaDouble: " + mysumadouble)

        //boolean (bool)
        val myBoolean : Boolean = true
        val myBoolean2= false
        println(myBoolean == myBoolean2)
        println(myBoolean && myBoolean2)
    }
}