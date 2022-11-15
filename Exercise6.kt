// Exercises For Programmers by Brian P. Hogan
// Exercise 6: Retirement Calculator
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

import java.time.Year
import java.util.Scanner

fun main() {
    // create scanner object
    val reader = Scanner(System.`in`)

    // Get the current year
    val thisYear = Year.now()
    // Get user input
    print("What is your current age? ")
    val userAge = reader.nextInt()
    print("At what age would you like to retire? ")
    val retirementAge = reader.nextInt()

    // Calculate difference between retirement age and current age
    val difference: Int = retirementAge - userAge
    println()

    // Output
    if (difference <= 0){
        println("You can already retire")
    } else {
        println(
            "You have $difference years until you can retire. It's $thisYear, so you can retire in ${
                thisYear.plusYears(difference.toLong()) }")
        // This uses the Year object's plusYears() function. Difference must be cast to a Long type to carry out the calculation.
                }
}