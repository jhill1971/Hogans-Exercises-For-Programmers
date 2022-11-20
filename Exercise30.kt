// Exercises For Programmers by Brian P. Hogan
// Exercise 30: Multiplication Table
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

import kotlin.system.exitProcess
import java.util.Scanner

/** Program entry point */
fun main() {
    digits()
}

/** function to get and validate user input */
fun digits() {
    val reader = Scanner(System.`in`)
    println("Enter 15 to exit.")
    // loop
    var check = true
    while (check == true) {
        println("Enter a number (1-12):")
        val numOne = reader.nextInt()
        if (numOne == 15) {
            println("Goodbye!")
            exitProcess(0)
        }

        if (numOne.toInt() in 1..12) {
            multiply(numOne)
        }

        if (numOne !in 1..12) {
            println("Numbers must be between 1 and 12. Try again.")
            continue
        }
    }
}

/** function to carry out calculation and output result to console */
fun multiply(numOne: Int) {
    for (x in 0..12) {
        val product = numOne * x
        println("$numOne x $x = $product")
    }
    println()
}



