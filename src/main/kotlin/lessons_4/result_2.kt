package org.example.lessons_4


const val VES_OT = 35
const val VES_DO = 100

const val LITR_DO = 100

fun main(){


    val ves = 50
    val litr = 99


    val res = ves in VES_OT..VES_DO && litr in 0..LITR_DO

    println(res)

}