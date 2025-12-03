package org.example.lesson_02

const val SECOND_IN_MINUTE = 60
fun main() {

    val departureHour: Int = 9
    val departureMinute: Int = 39
    val travelMinutes: Int = 457

    val departureTotalMinutes: Int = departureHour * SECOND_IN_MINUTE + departureMinute
    val arrivalTotalMinutes: Int = departureTotalMinutes + travelMinutes

    val arrivalHour: Int = arrivalTotalMinutes / SECOND_IN_MINUTE
    val arrivalMinute: Int = arrivalTotalMinutes % SECOND_IN_MINUTE

    val arrivalTime: String = String.format("%02d:%02d", arrivalHour, arrivalMinute)

    println(arrivalTime)
}