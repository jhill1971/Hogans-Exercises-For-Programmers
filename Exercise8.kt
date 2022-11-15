// Exercises For Programmers by Brian P. Hogan
// Exercise 8: Pizza Party
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

import java.util.Scanner

fun main() {
    // Declare variable to be used later
    var numSlices: Int = 0
    // create scanner object
    val reader = Scanner(System.`in`)

    print("How many people are having pizza? ")
    val diners = reader.nextInt()
    print("How many pizzas are you ordering? ")
    val numPies = reader.nextInt()
    print("Are the pizzas small(s), medium(m), or large(l)? ")
    val size = reader.next().lowercase()


    // Determine number of slices
    when (size) {
        "s" -> numSlices = 4
        "m" -> numSlices = 6
        "l" -> numSlices = 8
    }

    // Calculate
    val serving = (numPies*numSlices)/diners
    val leftovers = (numPies*numSlices) - (serving*diners)

    // Output
    println("There are $diners people and $numPies pizza pies.")
    println("Each person will get $serving slice(s).")
    println("You will have $leftovers slices left over.")
}