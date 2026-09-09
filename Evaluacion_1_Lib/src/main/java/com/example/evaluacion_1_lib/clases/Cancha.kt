package com.example.evaluacion_1_lib.clases

open class Cancha(
    val nombre: String,
    var valorHora: Double,
){
    open fun calcularCostoReservas(horas: Int): Double{
        return horas.toDouble()
    }
}