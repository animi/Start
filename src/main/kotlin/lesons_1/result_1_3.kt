package org.example.lesons_1



fun main(){


    /*Данные для задачи:
    Год полета – 1961
    Взлет – 09:07
    Посадка – 10:55*/

    val year:Int = 1961
    var rocketHors:String = "09"
    var rocketMin:String = "07"

    println(year)
    println(rocketHors + ":" + rocketMin)
    rocketHors = "10"
    rocketMin = "55"

    print(rocketHors)
    print(":")
    print(rocketMin)

}