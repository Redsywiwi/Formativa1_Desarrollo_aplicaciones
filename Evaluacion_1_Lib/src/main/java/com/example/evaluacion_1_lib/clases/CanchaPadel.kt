package com.example.evaluacion_1_lib.clases

class CanchaPadel(
    nombre:String,
    valorHora: Double,
    val techada: Boolean
): Cancha(nombre, valorHora) {
    override fun calcularCostoReservas(horas: Int): Double {

        if (techada){
            valorHora+3000
            return valorHora
        } else {
            return valorHora
        }
    }
}
