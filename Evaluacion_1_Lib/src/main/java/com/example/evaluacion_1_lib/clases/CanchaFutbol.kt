package com.example.evaluacion_1_lib.clases


class CanchaFutbol(
    nombre: String,
    valorHora: Double,
    val cantidadJugadores:Int
): Cancha(nombre,valorHora){
    override fun calcularCostoReservas(horas: Int): Double{
        //añade un recargo fijo de 15% si hay +10 jugadores
        if (cantidadJugadores > 10){
            return valorHora*1.15 //creo
        } else {
            return valorHora
        }

    }
}