// Exercises For Programmers by Brian P. Hogan
// Exercise 19: BMI Calculator
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

/**
 * BMI Formula: (weight/(height*height))*703
 */
import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    // Input
    print("Enter your weight in pounds: ")
    val weight: Double = reader.nextDouble()
    println("Enter your height in feet, then inches.")
    print("Enter your height in feet (ex: 5): ")
    val feet: Int = reader.nextInt()
    print("Enter any inches (ex: 11): ")
    val inches: Int = reader.nextInt()
    val height = (feet * 12) + inches

    // Calculation
    val BMI: Double = (weight/(height*height)) * 703

    // Output
    val BMIFormat = "%.1f".format(BMI) // Format decimal number.
    val bodyMassIndex: String = when(BMI){
        in 0.0 .. 18.4 -> "You're underweight. Have a snack!"
        in 18.5 .. 25.0 -> "You are within your ideal weight range"
        in 25.1 .. 100.0 -> "You're overweight. See your doctor."
        else -> "Are you dead or something??"
    }
    println("Your BMI is $BMIFormat. $bodyMassIndex")

}
