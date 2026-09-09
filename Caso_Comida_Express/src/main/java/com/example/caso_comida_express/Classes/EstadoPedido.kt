package com.example.caso_comida_express.Classes

sealed class EstadoPedido{
    object Preparando : EstadoPedido()
    data class EnCamino(val repartidor: String) : EstadoPedido()
    object Entregado : EstadoPedido()
    data class Cancelado(val motivo: String) : EstadoPedido()

}
fun mostrarEstado(estado: EstadoPedido) {
    when (estado) {
        EstadoPedido.Preparando->{
            println("El pedido se esta preparando.")
        }
        is EstadoPedido.EnCamino->{
            println("El pedido va en camino con el repartidor ${estado.repartidor}.")
        }
        EstadoPedido.Entregado -> {
            println("El pedido fue entregado.")
        }
        is EstadoPedido.Cancelado -> {
            println("El pedido fue cancelado. Motivo: ${estado.motivo}")
        }
    }
}