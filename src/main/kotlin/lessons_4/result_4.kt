package org.example.lessons_4



fun main(){

    val start = ""
    val next = ""

    val currenDey = 5

    val digital = currenDey % 2 == 0


        val bigMsg = """
            Упражнения для рук: ${!digital}
            Упражнения для ног: ${digital}
            Упражнения для спины: ${digital}
            Упражнения для пресса: ${!digital}
        """.trimIndent()

    println(bigMsg)


}