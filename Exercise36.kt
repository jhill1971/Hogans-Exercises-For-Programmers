// Exercises For Programmers by Brian P. Hogan
// Exercise 36: Computing Statistics
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

import java.lang.Math.sqrt
import java.util.*

//Initialize list
var responseTimes = mutableListOf<Int>()

//Initialize response variable
var userInput: Int = 1

/** Program Entry Point */
fun main() {
    getResponseTimes()
}

/** Function to get user input */
fun getResponseTimes() {
    //get website response times in mS.
    println("Enter the sites' response times in mS. Enter 0 to quit input.")

    //Initialize reader variable
    val reader = Scanner(System.`in`)

    //Data entry loop
    while (userInput != 0) {
        println("Enter the response time:")
        userInput = reader.nextInt()
        if (userInput == 0) {
            break
        } else {
            responseTimes.add(userInput)
        }
    }
    analysis()
}

/** Analysis and output function */
fun analysis() {
    //Statistical Analysis
    val minVal = responseTimes.minOrNull()!!.toInt()
    val maxVal = responseTimes.maxOrNull()!!.toInt()
    val mean = responseTimes.average()

    //Calculate Standard Deviation
    var sdList = mutableListOf<Double>() //Declare list for Standard Deviation Calculation
    for (y in responseTimes) {
        var n = y - mean //Find difference between each number in list and the mean of the list.
        var n2 = n * n //Get the square of that value
        sdList.add(n2) //add to new list
    }
    val sdMean = sdList.average() //get mean of list
    val stdDev = sqrt(sdMean) //get square root of that mean
    val formattedStdDev = String.format("%.2f", stdDev)
    analysisOutput(minVal, maxVal, mean, formattedStdDev)

}

/** Output Function */
fun analysisOutput(minVal: Int, maxVal: Int, mean: Double, formattedStdDev: String) {
    //Output
    println("There are ${responseTimes.count()} entries")
    //Display each item in list on its own line
    for (x in responseTimes) {
        print("$x ")
    }

    println()
    println("Analysis:")
    println("____________________________________")
    println("Minimum Value:      $minVal")
    println("Maximum Value:      $maxVal")
    println("Mean:               $mean")
    println("Standard Deviation: $formattedStdDev")

}


