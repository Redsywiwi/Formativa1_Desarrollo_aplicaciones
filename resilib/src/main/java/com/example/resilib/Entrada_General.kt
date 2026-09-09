package com.example.resilib

class Entrada_General(
    id: Int,
    precio: Int,
    asistente: String,
    fecha_lugar: String,
    private val acceso_bar: Boolean,
):Entrada(id,precio,asistente,fecha_lugar){
    override fun mostrar_Detalle(){
        println("$id $precio")
        println("asistente: $asistente")
        println("fecha y lugar: $fecha_lugar")
        println("Acceso a sala vip: $acceso_bar")
    }
}