// Exercises For Programmers by Brian P. Hogan
// Exercise 18: Temperature Converter
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

import java.util.Scanner
import kotlin.system.exitProcess
fun main() {
    val reader = Scanner(System.`in`)
    println("Select C to convert from Fahrenheit to Celsius.")
    println("Select F to convert from Celsius to Fahrenheit.")
    print("Your Choice: ")
    val userSelection = readLine()?.uppercase()
    println()
    when (userSelection){
        "C" -> {print("Please enter the temperature in Fahrenheit: ")
            val tempF: Double = reader.nextDouble()
            val c = (tempF-32)*5/9
            println("The temperature in Celsius is: ${c.toInt()}")}

        "F" -> {print("Please enter the temperature in Celsius: ")
            val tempC = reader.nextInt()
            val f = (tempC*9/5)+32
            println("The temperature in Fahrenheit is ${f.toInt()}")}

        else -> {println("Incorrect input.")
        exitProcess(1)
        }
    }
}