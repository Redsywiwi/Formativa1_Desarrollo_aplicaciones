package com.example.resilib

open class Entrada(
    protected val id: Int,
    protected val precio: Int,
    protected val asistente: String,
    protected val fecha_lugar: String
){
    open fun mostrar_Detalle(){
        println("$id $precio")
        println("asistente: $asistente")
        println("fecha y lugar: $fecha_lugar")
    }

}

var ingresos : Int = 0;
var ListaEntradas= mutableListOf<Entrada>()
fun main() {
    val c1 = Entrada_VIP(1,30000,"resi","mi casa",true,true)
    ListaEntradas.add(c1)
    println(ListaEntradas[0].nombre)

    val c2 = Empleado()
    ListaEntradas.add(c2)

    ListaEntradas[0].presentarse()
}
