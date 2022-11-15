// Exercises For Programmers by Brian P. Hogan
// Exercise 14: Tax Calculator
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val wiTaxRate = .055

    print("What is the order amount? ")
    val orderAmt = reader.nextDouble()
    print("What is the state (use two-letter abbreviation): ")
    val state = readLine()?.uppercase()

    if (state == "WI") {
        var salesTax = (orderAmt*wiTaxRate)
        println("The subtotal is: $$orderAmt")
        println("The tax is: $$salesTax")
        println("The total is: ${salesTax + orderAmt}")
    } else {
        println("The total is: $$orderAmt")
    }

}