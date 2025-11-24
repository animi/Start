package org.example.lessons_2

fun main(){

    // не получилось разобраться с этой формулой
    //println(70000 * (1 + 0.167/12) * 12 *20)

    var sum: Double = 70000.0
    val proc = 0.167

    //буду считать через цикл
    //на каждой интерации буду рассчитывать проценты нарастающим итогом
    for(i in 0..19){
        sum  = sum + (sum * proc)
    }

    println(String.format("%.3f", sum))



}

