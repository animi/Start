package org.example.lessons_3

fun main(){


    val nameUser = "Vasya"
    val time = "AM" //PM
    val msg = "Hello $nameUser!"

    if (time == "AM"){
        print(msg + "Good morning.")
    }else{
        print(msg + "Good evening.")
    }


}