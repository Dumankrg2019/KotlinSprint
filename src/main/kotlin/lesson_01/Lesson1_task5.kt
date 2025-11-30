package org.example.lesson_01

fun main() {
    val secondsInSpace: Short = 6480

    val hours: Int = secondsInSpace / 3600
    val minutes: Int = (secondsInSpace % 3600) / 60
    val seconds: Int = secondsInSpace % 60

    val timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println(timeString)
}