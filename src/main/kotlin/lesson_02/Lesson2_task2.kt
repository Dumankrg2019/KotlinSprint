package org.example.lesson_02

fun main() {
    val countOfEmployee = 50
    val countOfInterns = 30
    val salaryForEmployee = 30000
    val salaryForIntern = 20000

    val expensesForEmployee: Int = countOfEmployee * salaryForEmployee
    val totalExpensesForSalary: Int = expensesForEmployee + countOfInterns * salaryForIntern
    val averageSalaryPerEmployee: Int = totalExpensesForSalary/(countOfEmployee + countOfInterns)

    println(expensesForEmployee)
    println(totalExpensesForSalary)
    println(averageSalaryPerEmployee)
}