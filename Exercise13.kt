// Exercises For Programmers by Brian P. Hogan
// Exercise 13: Determining Compound Interest
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

/**
 * Write a program to compute the value of an investment compounded over time. The program should ask for the
 * starting amount, the number of years to invest, the interest rate, and the number of periods per year to compound.
 *
 * The formula is A=P * (1 + r/n)^n*t where P is the principal, r is the apr, t is the time in years,
 * n is the number of times the interest is compounded per year, and A is the amount at the end of the investment.
 */

import java.util.Scanner
import kotlin.math.pow

fun getUserInput() {
    // create reader object.
    val reader = Scanner(System.`in`)

    // get user input
    print("Enter the principal: $")
    val principal = reader.nextDouble()
    print("Enter the APR (as a percent): %")
    val apr = reader.nextDouble()
    print("How many times per year is the interest compounded: ")
    val compoundX = reader.nextInt()
    print("Enter the period in years: ")
    val time = reader.nextInt()

    // call the calculation function and pass the user input to it.
    calculateInterest(principal, apr, compoundX, time)
}

fun calculateInterest(p: Double, apr: Double, n: Int, t: Int) {
    // convert percentage rate to decimal
    val r = apr / 100.00
    // final amount calculation
    val a = p * (1 + r / n).pow(n * t)
    // format decimal output
    val aFmt = "%.2f".format(a)
    // output string
    println("After $t years at $apr%, the investment will be worth $$aFmt")
}

fun main() {
    getUserInput()
}