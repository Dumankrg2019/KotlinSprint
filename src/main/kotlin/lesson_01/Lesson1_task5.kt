package org.example.lesson_01

const val SECONDS_IN_MINUTE: Int = 60
const val SECONDS_IN_HOUR: Int = 60 * SECONDS_IN_MINUTE

fun main() {

    val secondsInSpace: Short = 6480

    val hours: Int = secondsInSpace / SECONDS_IN_HOUR
    val minutes: Int = (secondsInSpace % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    val seconds: Int = secondsInSpace % SECONDS_IN_MINUTE

    val timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println(timeString)
}