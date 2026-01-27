package org.example.lessons_3

fun main(){


    val startName = "Андреева Татьяна Сергеевна"
    val startYer = 21


    val currnetName = "Сидорова Татьяна Сергеевна"
    val currnet = 22

    println("Введите возраст:")
    val result:String? = readLine()

    var inputYer: Int? = 0

    try {
        inputYer = result?.toInt()
    }catch(e: Exception){
        println("Не дулалось перевести в число ")

        return
    }


    if (inputYer != null) {
        if (inputYer < 22) {
            println("$startName $startYer")
        }
        else if (inputYer >= 22){
            println("$currnetName $currnet")
        }
    }
}