/*
 * @authors
 * Riki Abdilah
 */
package view

import model.*

fun main() {

    // Bentuk Piramida
    val piramida1 = Piramida(jumlah = 8)
    piramida1.membuatPola()
    println(piramida1.getPola())

    // Bentuk Piramida Terbalik
    val piramidaTerbalik1 = PiramidaTerbalik(jumlah = 8)
    piramidaTerbalik1.membuatPola()
    println(piramidaTerbalik1.getPola())

    // Bentuk Belah Ketupat
    val belahKetupat1 = BelahKetupat(jumlah = 8)
    belahKetupat1.membuatPola()
    println(belahKetupat1.getPola())

    // Bentuk X
    val x1 = X(jumlah = 15)
    x1.membuatPola()
    println(x1.getPola())

    // Bentuk Segitiga Siku-Siku
    val segitigaSiku1 = SegitigaSiku(jumlah = 8)
    segitigaSiku1.membuatPola()
    println(segitigaSiku1.getPola())

    // Bentuk Plus Bintang
    val plusbintang1 = PlusBintang(jumlah = 8)
    plusbintang1.membuatPola()
    println(plusbintang1.getPola())
}