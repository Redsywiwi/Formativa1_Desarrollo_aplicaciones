package com.example.resilib

class Entrada_VIP(
    id: Int,
    precio: Int,
    asistente: String,
    fecha_lugar: String,
    private val sala_vip: Boolean,
    private val beneficios: Boolean
):Entrada(id,precio,asistente,fecha_lugar){
    override fun mostrar_Detalle(){
        println("$id $precio")
        println("asistente: $asistente")
        println("fecha y lugar: $fecha_lugar")
        println("Acceso a sala vip: $sala_vip")
        println("Caja de regalos: $beneficios")
    }
}

//Crea una interfaz Informable con un metodo informar(). Implementa esta interfaz tanto en Persona
//como en Empleado, pero redefiniendo el comportamiento del metodo en cada clase.
//Luego, utiliza una lista de objetos Informable y recorrela para demostrar cómo el metodo informar()
//se comporta de forma distinta según el tipo de objeto.