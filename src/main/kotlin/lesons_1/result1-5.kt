package org.example.lesons_1

fun main(){


    val colCes = 5409

    val colMin = colCes/60
    val hors = colMin/60
    val mm = colMin%60
    val sec = colCes%60


    println("[${hors}:${mm}:${sec}]")

}