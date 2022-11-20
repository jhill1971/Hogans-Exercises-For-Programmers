// Exercises For Programmers by Brian P. Hogan
// Exercise 28: Adding Numbers
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

import java.util.Scanner

fun main () {
    // Call the addingNumbers function.
    println("The total is: ${addingNumbers()}")
}

fun addingNumbers (): Int {
    // Scanner Variable
    val reader = Scanner(System.`in`)
    // Declare list to hold user-entered values
    val userInput = mutableListOf<Int>()
    // Get the number of integers the user wants to add
    print("How many numbers do you want to add? ")
    val numInts = reader.nextInt()
    println("Enter $numInts numbers when prompted: ")
    // For loop to get the user's input
    for (x in 1..numInts){
        println ("Enter number $x: ")
        val num = reader.nextInt()
        userInput.add(num)
    }
    // Sum the contents of the list
    val listSum = userInput.sum()
    // return the sum to the calling function
    return listSum
}

