package org.example.lessons_2

fun main(){

    val hourStart = 9
    val minStart = 36

    val travelTimeMin = 457


    val result = arrivalTtime(hourStart, minStart, travelTimeMin)

    println(result)


}


fun arrivalTtime(hour:Int, min:Int, duration:Int):String{

    val otherTime = (3600 * hour) + (min *60) + (duration * 60)

    val localHour = otherTime / 3600
    val localMin =  otherTime % 3600 / 60


    if (localMin.toString().length == 1){
        return "${localHour}:0${localMin}"
    }else{
        return "${localHour}:${localMin}"
    }

}
