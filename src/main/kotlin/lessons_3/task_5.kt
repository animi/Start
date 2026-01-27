package org.example.lessons_3

fun main(){


    val shablon = "D2-D4;0"

    val seporatorShag = shablon.indexOf("-")
    val seporatorNumberHod = shablon.indexOf(";")

    val nach = shablon.substring(0, seporatorShag)
    val con = shablon.substring(seporatorShag + 1, seporatorNumberHod)
    val hod = shablon.substring(seporatorNumberHod + 1,)


    println(nach)
    println(con)
    println(hod)


}