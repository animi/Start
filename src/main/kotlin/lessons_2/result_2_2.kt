package org.example.lessons_2

fun main(){

    val totalEmploy = 50
    val totalEmployMoney = 30000

    val stydent = 20
    val stydentMoney = 20000


    val totalSum = (totalEmploy * totalEmployMoney) + (stydent * stydentMoney)

    println("ЗП постоянных сотрудников ${totalEmploy * totalEmployMoney}")

    println("Общая ЗП  ${totalSum}")


    println("Средняя ЗП  ${totalSum / (totalEmploy + stydent)}")



}