// Exercises For Programmers by Brian P. Hogan
// Exercise 11: Currency Conversion
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

/**
 * Write a program that converts currency. Specifically, convert euros to U.S. dollars. Prompt for the amount of
 * Euros the user has, and prompt for the current exchange rate of the Euro. Print out the new amount in U.S. dollars.
 * The formula for currency conversion is: amount to = (amount from * rate from) / rate to.
 * where, amount to is the amount in U.S. Dollars, amount from is the amount in Euros, rate from is the current
 * exchange rate in Euros, and rate to is the current exchange rate of the U.S. dollar.
 *
 * Constraints:
 * Ensure that fractions of a cent are rounded up to the next penny.
 * Use a single output statement
 *
 * Today's exchange rate:
 * 1 USD = 1.00415 Euro
 * 1 Euro = 0.995865 USD
 */

import java.util.Scanner

// declare constants
const val USD_RATE = 1.00415
const val EURO_RATE = 0.995865

fun main() {
    // create reader object
    val reader = Scanner(System.`in`)

    // get input
    print("How many Euros are you exchanging? ")
    val eurosToConvert = reader.nextDouble()

    // Calculation
    val usdResult = (eurosToConvert * EURO_RATE)/USD_RATE

    // Format decimals
    val formattedResult = "%.2f".format(usdResult)
    val formattedEuros = "%.2f".format(eurosToConvert)

    // Output
    println("$formattedEuros Euros at an exchange rate of $EURO_RATE is $$formattedResult.")
}