package org.example.lesson_02

import kotlin.math.pow

fun main() {

    val initialAmount: Double = 70_000.0
    val annualRate: Double = 16.7
    val years: Int = 20

    val annualRateInValueDigit = annualRate / 100
    // Формула сложных процентов: A = P * (1 + r)^n
    val finalAmount: Double = initialAmount * (1 + annualRateInValueDigit).pow(years)

    println("%.3f".format(finalAmount))
}