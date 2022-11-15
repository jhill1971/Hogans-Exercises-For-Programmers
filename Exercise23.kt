// Exercises For Programmers by Brian P. Hogan
// Exercise 23:Car Troubleshooter
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

import kotlin.system.exitProcess

fun carTroubleshooter() {
    println("Please answer all questions with a y or n.")
    println("Is your car silent when you turn the key?")
    val response = readLine()

    if (response.equals("y", ignoreCase = true)) {
        println("Are the battery terminals corroded?")
        val response2 = readLine()
        if (response2.equals("y", ignoreCase = true)) {
            println("Clean the terminals and try starting again.")
        } else {
            println("Replace the cables and try again.")
        }

    } else {
        println("Does the car make a clicking sound?")
        val response3 = readLine()
        if (response3.equals("y", ignoreCase = true)) {
            println("Replace the battery.")
        } else {
            println("Does the car crank up but fail to start?")
            val response4 = readLine()
            if (response4.equals("y", ignoreCase = true)) {
                println("Check spark plug connections.")
            } else {
                println("Does the engine start and then die?")
                val response5 = readLine()
                if (response5.equals("y", ignoreCase = true)) {
                    println("Does your car have fuel injection?")
                    val response6 = readLine()
                    if (response6.equals("y", ignoreCase = true)) {
                        println("Take it in for service")
                        exitProcess(0)
                    } else {
                        println("Check to make sure the choke is opening and closing.")
                        exitProcess(0)

                    }

                }else {
                    println("Beats the fuck outta me... Better call an expert.")
                    exitProcess(0)
                }

            }
        }
    }
}//end of carTroubleshooter function

fun main() {
    carTroubleshooter()
}