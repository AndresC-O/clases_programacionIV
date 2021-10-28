package com.andres.otraappconvista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    private lateinit var et_PrimerValor:EditText
    private lateinit var et_SegundoValor:EditText
    private lateinit var rb_Sumar:RadioButton
    private lateinit var rb_Restar:RadioButton
    private lateinit var rb_Multiplicar:RadioButton
    private lateinit var rg_radioGroup:RadioGroup
    private lateinit var rb_Dividir:RadioButton
    private lateinit var tvw_Resultado:TextView
    private lateinit var chbx_Sumar:CheckBox
    private lateinit var chbx_Restar:CheckBox
    private lateinit var chbx_Multiplicar:CheckBox
    private lateinit var chbx_Dividir:CheckBox
    private  lateinit var spinner:Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et_PrimerValor = findViewById(R.id.et_primervalor)
        et_SegundoValor = findViewById(R.id.et_segundovalor)
        rb_Sumar = findViewById(R.id.rb_Sumar)
        rb_Restar = findViewById(R.id.rb_Restar)
        rb_Multiplicar = findViewById(R.id.rb_Multiplicar)
        rb_Dividir = findViewById(R.id.rb_Dividir)
        tvw_Resultado = findViewById(R.id.tvw_Resultado)
        rg_radioGroup = findViewById(R.id.radioGroup)
        chbx_Sumar = findViewById(R.id.chbx_sumar)
        chbx_Restar = findViewById(R.id.chbx_restar)
        chbx_Multiplicar = findViewById(R.id.chbx_multiplicar)
        chbx_Dividir = findViewById(R.id.chbx_dividir)
        spinner = findViewById(R.id.spinner_ops)

        val opciones = arrayOf("Sumar", "Restar", "Multiplicar", "Dividir")
        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, opciones)
        spinner.adapter = adaptador
    }

    fun Calcular(Vista:View){

        var primerValor = et_PrimerValor.text.toString()
        var segundoValor = et_SegundoValor.text.toString()

        var primerValor_con = Integer.parseInt(primerValor)
        var segundoValor_con = Integer.parseInt(segundoValor)

        fun sumar(){
            var suma = primerValor_con + segundoValor_con
            /*resultado = suma.toString()
            tvw_Resultado.setText(resultado)*/
            tvw_Resultado?.text = suma.toString()
        }
        fun restar(){
            var resta = primerValor_con - segundoValor_con
            tvw_Resultado?.text = resta.toString()
        }
        fun multiplicar(){
            var multiplicar = primerValor_con * segundoValor_con
            tvw_Resultado?.text = multiplicar.toString()
        }
        fun dividir(){
            var dividir = primerValor_con / segundoValor_con
            tvw_Resultado?.text = dividir.toString()
        }

        if(primerValor.isEmpty() || segundoValor.isEmpty()){
            Toast.makeText(this,"No se permiten campos vacios", Toast.LENGTH_LONG).show()
        }else{
            if(rb_Sumar.isChecked){
                sumar()
            }
            else if(rb_Restar.isChecked){
                restar()
            }
            else if(rb_Multiplicar.isChecked){
                multiplicar()
            }
            else if(rb_Dividir.isChecked){
                if(primerValor_con !=0 && segundoValor_con != 0){
                    dividir()
                }
                else{
                    Toast.makeText(this,"No se permiten valores iguales a 0", Toast.LENGTH_LONG).show()
                }
            }
            else if(rg_radioGroup.checkedRadioButtonId == -1){
                Toast.makeText(this,"No ha seleccionado una opcion", Toast.LENGTH_LONG).show()
            }
        }

        //Checkbox
        var resultado = ""
        if(chbx_Sumar.isChecked == true){
            val suma = primerValor_con + segundoValor_con
            resultado = "La suma es: " + suma + " / "
        }
        else if(chbx_Restar.isChecked == true){
            val restar = primerValor_con - segundoValor_con
            resultado = "La resta es: " + restar + " / "
        }
        else if(chbx_Multiplicar.isChecked == true){
            val multiplicar = primerValor_con * segundoValor_con
            resultado = "La multipllicacion es: " + multiplicar + " / "
        }
        else if(chbx_Dividir.isChecked == true){
            try {
                val dividir = primerValor_con / segundoValor_con
                resultado = "La division es: " + dividir + " / "
            }catch (e:Exception){
                Toast.makeText(this,"No se puede dividir entre 0", Toast.LENGTH_LONG).show()
            }finally {
                Toast.makeText(this, "Se ejecuto la operacion", Toast.LENGTH_LONG).show()
            }
        }

        tvw_Resultado.setText(resultado)

        //Sppiner
        val seleccion = spinner.selectedItem.toString()
        if(seleccion.equals("Sumar")){
            sumar()
        }
        else if(seleccion.equals("Restar")){
            restar()
        }
        else if(seleccion.equals("Multiplicar")){
            multiplicar()
        }
        else if(seleccion.equals("Dividir")){
            dividir()
        }
    }
}