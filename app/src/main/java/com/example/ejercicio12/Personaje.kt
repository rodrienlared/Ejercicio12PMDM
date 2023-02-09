package com.example.ejercicio12

class Personaje() {
    val LIMITE_MOCHILA = 100

    var mochila = arrayListOf<ObjetoJuego>()
    var fuerza: Int = 0
    var defensa: Int = 0
    var monedero: Int = 0
        get() = field

    // Crea un constructor
    constructor(fuerza: Int, defensa: Int, monedero: Int): this(){
        this.fuerza = generateFuerza()
        this.defensa = generateDefensa()
        this.mochila = mochila.toCollection(arrayListOf())
        this.monedero = 0
    }

    fun generateFuerza(): Int{
        return (10..15).random()
    }

    fun generateDefensa(): Int{
        return (1..5).random()
    }

    fun getTamanoTotal(): Int{
        var tamanoTotal = 0
        mochila.forEach {
            tamanoTotal += it.getPeso()
        }
        return tamanoTotal
    }

    fun getValorTotal(): Int{
        var valorTotal = 0
        mochila.forEach {
            valorTotal += it.getValor()
        }
        return valorTotal
    }

    fun canIStore(objeto: ObjetoJuego): Boolean{
        val tamanoTotal = getTamanoTotal()

        val espacioLibre = LIMITE_MOCHILA - tamanoTotal
        return espacioLibre >= objeto.getPeso()
    }
}