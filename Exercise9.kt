// Exercises For Programmers by Brian P. Hogan
// Exercise 9: Paint Calculator
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

import java.util.*
import kotlin.math.roundToInt

const val COVERAGE = 360.0

fun main() {
    // create scanner object
    val reader = Scanner(System.`in`)

    // Get input
    print("What is the length of the ceiling? ")
    val length = reader.nextInt()
    print("What is the width of the ceiling? ")
    val width = reader.nextInt()

    // Calculate
    val squareFeet = length * width
    var numCans: Int = squareFeet/COVERAGE.roundToInt()

    if (numCans == 0) numCans = 1

    //output
    println("You will need $numCans gallon(s) of paint to cover $squareFeet square feet.")

}