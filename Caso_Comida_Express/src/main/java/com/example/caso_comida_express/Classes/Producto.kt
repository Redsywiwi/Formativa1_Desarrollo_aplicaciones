package com.example.caso_comida_express.Classes

open class Producto(
    val nombre: String,
    var precioBase: Double
){
    open fun calcularpreciofinal(): Double {
        return 0.0
    }
}