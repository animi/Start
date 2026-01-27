package org.example.lessons_3

fun main(){


    println("Input digital:")

    val result:String? = readLine()

    var digital: Int? = 0

    try {
        digital = result?.toInt()
    }catch(e: Exception){
        println("Не дулалось перевести в число ")

        return
    }


    if (digital != null) {

        val strCalc = """
            $digital x 1 = ${digital*1}
            $digital x 2 = ${digital*2}
            $digital x 3 = ${digital*3}
            $digital x 4 = ${digital*4}
            $digital x 5 = ${digital*5}
            $digital x 6 = ${digital*6}
            $digital x 7 = ${digital*7}
            $digital x 8 = ${digital*8}
            $digital x 9 = ${digital*9}
        """.trimIndent()


        println(strCalc)
    }


}