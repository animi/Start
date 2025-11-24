package org.example.lessons_3

fun main(){

    //Задача не понятная

    val shablon = "[E2-E4;2]"

    var shablonBez = shablon.replace("[","")
    shablonBez = shablonBez.replace("]","")

    val posSeporator = shablonBez.indexOf("-")
    val posStep = shablonBez.indexOf(";")

    val start = shablonBez.substring(0,posSeporator)
    val end = shablonBez.substring(posSeporator+1, posSeporator + 3)
    val hod = shablonBez.substring(posStep+1)


    println("C " + start)
    println("Na " + end)
    println("xod " + hod)


}