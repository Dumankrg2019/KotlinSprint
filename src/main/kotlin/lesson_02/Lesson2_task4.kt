package org.example.lesson_02

fun main() {

    val crystalOre: Int = 7
    val ironOre: Int = 11


    val buffPercent: Int = 20


    val crystalBonus: Int = crystalOre * buffPercent / 100
    val ironBonus: Int = ironOre * buffPercent / 100

    println("Crystalline ore bonus: $crystalBonus")
    println("Iron ore bonus: $ironBonus")
}