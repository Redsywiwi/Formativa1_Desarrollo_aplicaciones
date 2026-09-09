package com.example.caso_comida_express.Main
//aqui me pongo a testear mis cosas wijiji
import com.example.caso_comida_express.Classes.Cliente
import java.time.LocalTime


//no me gusta especificar que sea int a cada rato, ns como hacer que no pase
fun coso (): Int {
    var hora: Int
    hora= LocalTime.now().hour
    return hora
}
var listadeweas= mutableListOf<Cliente>()
fun main(){
    println("La hora es: ${coso()}H")
}
