// Exercises For Programmers by Brian P. Hogan
// Exercise 12: Computing Simple Interest
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

/**
 * Create a program that computes simple interest.Prompt for the principal amount, the rate as a percentage, and the time.
 * Display the amount accrued (principal + interest)
 *
 * The formula for simple interest is A=P(1+rt), where P is the principal amount, r is the annual rate of interest,
 * t is the number of years the amount is invested, and A is the amount at the end of the investment.
 */

import java.util.Scanner

// create reader object. Placing this line outside of functions makes it global.
val reader = Scanner(System.`in`)

fun getInput() {
    print("Enter the principal: $")
    val principal = reader.nextDouble()
    print("Enter the APR (as a percent): %")
    val apr = reader.nextDouble()
    print("Enter the period in years: ")
    val time = reader.nextInt()
    calculateInterest(principal, apr, time)
}

fun calculateInterest(prin:Double, rate:Double, time:Int) {
    // convert percentage rate to decimal
    val decApr = rate/100.00
    // final amount calculation
    val a = prin * (1 + decApr*time)
    // output string
    println("After $time years at $rate%, the investment will be worth $$a")
}

fun main(){
    getInput()
}