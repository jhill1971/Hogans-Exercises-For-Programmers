// Exercises For Programmers by Brian P. Hogan
// Exercise 17: Blood Alcohol Calculator
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

/**
 * BAC formula:
 * BAC = (A*5.14 / W*r) - .015 x H
 * A = total alcohol consumed in oz.
 * W = body weight in pounds
 * r = Alcohol Distribution Ratio. male = 0.73, female = 0.66
 * H = hours since last drink
 */

import java.util.Scanner
import kotlin.system.exitProcess

// declare constants
const val STANDARD_DRINK: Double = 0.6

fun main() {
    //declare variables
    val reader = Scanner(System.`in`) // Create scanner object
    val r:Double// Alcohol Distribution Ratio

    // Get user data
    print("What is your sex? Enter 1 for male, 2 for female: ")
    val sex = reader.nextInt() // user's sex
    when (sex){
        1 -> r= 0.73
        2 -> r= 0.66
        else -> {
            println("Incorrect input")
            exitProcess(1)
        }
    }

    print("What is your weight in pounds? ")
    val W = reader.nextDouble() // Users weight
    print("How many drinks have you had? ")
    val numDrinks = reader.nextInt() // Number of drinks
    val A: Double = numDrinks * STANDARD_DRINK // Alcohol in ounces
    print("How long (in hours or decimal) since your last drink? ")
    val H: Double = reader.nextDouble() // Time since last drink

    // Calulate BAC and Intoxication
    val BAC:Double = (A*5.14 / W*r) - (.015 * H)
    val BACFormat = "%.2f".format(BAC)
    val intoxication: String = when (BAC){
        in 0.00 .. 0.05 -> "You're good to go!"
        in 0.051 .. 0.080 -> "Happy St. Patrick's Day!"
        in 0.081 .. 0.40 -> "Boris Yeltsin"
        else -> "How are you alive??"
    }

    // Output
    println()
    println("Your BAC is $BACFormat. $intoxication")

}