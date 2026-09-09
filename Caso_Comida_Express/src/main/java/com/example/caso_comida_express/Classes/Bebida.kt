package com.example.caso_comida_express.Classes

class Bebida(
    nombre: String,
    precioBase: Double,
    val es_alcoholica: Boolean
): Producto(nombre, precioBase){
    override fun calcularpreciofinal(): Double{
        //recargo fijo de $800 si esAlcoholica es true.
        if (es_alcoholica) {
            return 800.0
        }else{
            return 0.0
        }
    }
}