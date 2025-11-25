package org.example.lessons_4



fun main(){

    val povrejdenit = false
    val commanda = 70
    val eda = 50

    val mojnoPlit = !povrejdenit && commanda in 50..70 && eda >= 50


    println(mojnoPlit)

}