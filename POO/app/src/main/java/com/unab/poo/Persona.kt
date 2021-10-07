package com.unab.poo

open class Persona(nombre:String, edad:Int) {
    //cualquier clase tienen en comun una clase any

    open fun trabajar(){
        println("Esta persona esta trabajando")
    }

    open fun voyATrabajar(){
        println("Se dirige a trabajar")
    }
}