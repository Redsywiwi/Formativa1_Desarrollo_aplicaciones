package com.example.caso_comida_express.Main
import com.example.caso_comida_express.Classes.Bebida
import com.example.caso_comida_express.Classes.Cliente
import com.example.caso_comida_express.Classes.Plato
import com.example.caso_comida_express.Classes.Producto
import java.time.LocalTime

var ListaClientes= mutableListOf<Cliente>()
var ListaProductos= mutableListOf<Producto>()
var total = 0
var envio = 5000


fun main() {
    val c1 = Cliente("Camila Rojas", "Av. Siempre Viva 742, Santiago", true)
    ListaClientes.add(c1)

    val f1 = Bebida("Pisco Sour", 3200.0, true)
    val f2 = Bebida("Mote con Huesillo", 1500.0, false)
    val f3 = Plato("Pastel de Choclo", 6500.0, "Grande")
    val f4 = Plato("Empanada de Pino", 1800.0, "Chica")
    val f5 = Plato("Ceviche", -2000.0, "chica")

    listOf(f1,f2,f3,f4,f5).also {
        ListaProductos.addAll(it)
    }


    println(ListaProductos.filterIsInstance<Bebida>().filter{it.es_alcoholica}.map{it.nombre}.also {
        println("Cantidad de productos que pasaron el filtro: ${it.size}")
    })
    println("El precio de todos los productos es ${ListaProductos.sumOf{it.precioBase}} (sin tarifas extras)")


    //Me perdi
    total+=recargoNocturno()
    envio=cliente_frecuente()
    println("Tarifa Nocturna: $total")
    println("Costo del envio: $envio (Sin descuentos aplicados)")

    println("===============")
    ListaProductos[2].let{
        println(it.nombre)
        it.calcularpreciofinal()
        println(it.precioBase)
    }
}

fun recargoNocturno(): Int {
    LocalTime.now().run {
        if (hour <= 5 || hour >= 22) {
            return 1000
        }else{
            return 0
        }
    }

}

fun cliente_frecuente(): Int{
    return  with(ListaClientes[0]) {
        if (total >= 15000 && clienteFrecuente) {
            return 0
        } else {
            return envio
        }
    }
}


    //no supe si se debia hacer asi tipo comparando el tiempo en real-time o con una variable simple :C
    //es que uuuuu
    //sé que se puede tomar como el tiempo del dispositivo y colocarlo como variable,
    //pero no tengo idea si debo hacer eso o no xddddd
    //me voy por lo del local hour noma, ahi después reteme si es que había que hacerlo de la otra manera



