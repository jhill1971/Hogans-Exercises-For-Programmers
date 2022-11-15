// Exercises For Programmers by Brian P. Hogan
// Exercise 7: Area of a Rectangular Room
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

/*
* Constraints:
* Keep the calculations separate from the output.
* Use a constant to hold the conversion factor.
*/
import java.util.Scanner

// Declare Constant
const val CONVERSION_FACTOR: Double = 0.09290304

fun main() {
    // create scanner object
    val reader = Scanner(System.`in`)

    // get user input
    print("What is the length of the room in feet? ")
    val length: Int = reader.nextInt()
    print("What is the width of the room in feet? ")
    val width: Int = reader.nextInt()

    // calculate area
    val area: Int = length * width
    // convert square feet to square meters
    val metricArea: Double = area * CONVERSION_FACTOR
    // format decimal result to 3 decimal places
    val formattedDec: String = "%.3f".format(metricArea)

    // Output
    println("The area of the room is:")
    println("$area square feet")
    println("$formattedDec square meters")

}