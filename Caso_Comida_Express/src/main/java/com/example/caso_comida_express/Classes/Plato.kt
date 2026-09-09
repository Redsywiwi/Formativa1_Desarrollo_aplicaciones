package com.example.caso_comida_express.Classes

class Plato(
    nombre: String,
    precioBase: Double,
    val tamanoporcion: String
): Producto(nombre, precioBase){
    override fun calcularpreciofinal(): Double{
        //recargo de 25% si tamano_Porcion es "Grande".
        if (tamanoporcion.lowercase() == "grande")
            precioBase+= precioBase * 0.25
            return precioBase
    }
}