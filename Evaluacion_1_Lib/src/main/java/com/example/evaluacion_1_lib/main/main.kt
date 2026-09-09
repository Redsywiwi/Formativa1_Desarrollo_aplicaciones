package com.example.evaluacion_1_lib.main
import com.example.evaluacion_1_lib.clases.Cliente
import com.example.evaluacion_1_lib.clases.CanchaPadel
import com.example.evaluacion_1_lib.clases.CanchaFutbol
import com.example.evaluacion_1_lib.clases.Cancha
import java.time.LocalTime


val ListaClientes= mutableListOf<Cliente>()
val ListaCanchas= mutableListOf<Cancha>()
val horas= 0
fun main(){
    val c1 = Cliente("resi",true)
    val cancha1 = CanchaFutbol("Cancha Futbol",18000.0,14)
    val cancha2 = CanchaFutbol("Cancha Futbol",12000.0,10)
    val cancha3 = CanchaPadel("",15000.0,true)
    val cancha4 = CanchaPadel("",9000.0, false)
    val cancha5 = CanchaFutbol("",-5000.0, 10)
    listOf(cancha1,cancha2,cancha3,cancha4,cancha5).also {
        ListaCanchas.addAll(it)
    }

    ListaClientes.add(c1)
    println(ListaClientes[0])
    descuento()
}



fun descuento(): Double{
    return  with(com.example.evaluacion_1_lib.main.ListaClientes[0]) {
        if (horas >= 3 && esSocio) {
            ListaCanchas[0].valorHora*=0.8
            return ListaCanchas[0].valorHora.also {
                if (LocalTime.now().hour >= 19 && LocalTime.now().hour <22){
                    ListaCanchas[0].valorHora+=2000
                }
            }
        } else
            return horas.toDouble()
    }
}