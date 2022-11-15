// Exercises For Programmers by Brian P. Hogan
// Exercise 21: Numbers to Names
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

/**
 * Write a program that converts a number from 1 to 12 to the corresponding month. Prompt for a number and
 * display the corresponding calendar month. For any value outside of 1 to 12, display an appropriate
 * error message. CONSTRAINTS: 1) Use a switch, case, or your language's equivalent. 2) Use a single output statement.
 */

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    print("Please enter the number of this month: ")
    val num = reader.nextInt()
    println()
    println("The name of this month is ${months(num)}")
}

fun months(num: Int): String{
    val name = when(num) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Smarch (Lousy Smarch weather...)"
    }
    return name
}