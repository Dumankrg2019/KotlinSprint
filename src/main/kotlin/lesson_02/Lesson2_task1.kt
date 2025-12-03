package org.example.lesson_02

fun main() {
    val grade1 = 3
    val grade2 = 4
    val grade3 = 3
    val grade4 = 5
    val countOfGrades = 4.0

    val averageScore: Double = (grade1 + grade2 + grade3 + grade4) / countOfGrades
    println("%.2f".format(averageScore))
}