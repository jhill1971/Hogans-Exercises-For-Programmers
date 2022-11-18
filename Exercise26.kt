// Exercises For Programmers by Brian P. Hogan
// Exercise 26: Months to Pay off a Credit Card
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

import java.util.Scanner
import kotlin.math.ln
import kotlin.system.exitProcess

/**  Entry point of the program */
fun main () {
    getCCInput()
}

/** Get user input */
fun getCCInput () {
    val reader = Scanner(System.`in`)
    print("What is your balance? ")
    val balance = reader.nextDouble()
    print("What is the APR on the card (as a percent)? ")
    val apr = reader.nextDouble()
    print("What is your monthly payment? ")
    val pmt = reader.nextDouble()

    // call next function
    calculatePayoff(balance, apr, pmt)
}

/** Calculate payoff */
fun calculatePayoff(b: Double, apr:Double, p:Double){
    // Declare variables
    val i = (apr/365)/100 // Daily interest rate
    // p = monthly payment

    // perform calculations
    val n = -((ln(1-(i*b)/p))/ ln(1+i)) // n=number of months to pay off loan.

    // call next function
    output(n)

}

/** Output Results */
fun output (n:Double) {

    println ("It will take you ${n.toInt()} months to pay off this card.")
    exitProcess(0)

}