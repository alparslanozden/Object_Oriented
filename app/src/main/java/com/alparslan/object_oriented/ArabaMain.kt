package com.alparslan.object_oriented

fun main(){

    val bmw = Araba()

    println(bmw.renk)
    println(bmw.calisiyorMu)
    println(bmw.hiz)

    bmw.renk = "Beyaz"
    bmw.hiz = 150
    bmw.calisiyorMu = true

    println(bmw.renk)
    println(bmw.calisiyorMu)
    println(bmw.hiz)


}