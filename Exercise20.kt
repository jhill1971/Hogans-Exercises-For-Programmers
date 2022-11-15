// Exercises For Programmers by Brian P. Hogan
// Exercise 20: Multistate Sales Tax Calculator
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

/**
 * Create a tax calculator that handles multiple states and multiple counties within each state. The
 * program prompts the user for the order amount and the state where the order will be shipped.
 * For Wisconsin residents, prompt the user for the county of residence. For Eau Claire county, add an additional
 * 0.005 tax. For Dunn county residents, add an additional 0.004 tax. Illinois residents are charged an 8% sales tax, with
 * no additional county-level charge. All other states are not charged tax.
 */

import java.util.Scanner

val stateTaxes = mapOf<String, Double>(
    "TX" to 0.0625,
    "IL" to 0.080,
    "WI" to 0.055
)

val countyTaxes = mapOf<String, Double>(
    "eau claire" to 0.005,
    "dunn" to 0.004,
    "harris" to 0.020
)

fun main() {
    val reader = Scanner(System.`in`)
    print("What is the order amount? ")
    val orderAmt = reader.nextDouble()
    print("What state is the delivery going to? (use two-letter abbreviation): ")
    val state = readLine()?.uppercase()


    var taxRate: Double? = when (state) {
        "IL" -> stateTaxes["IL"]
        "TX" -> stateTaxes["TX"]
        "WI" -> stateTaxes["WI"]
        else -> 0.00
    }

    val formattedOrder = ("%.2f".format(orderAmt))

    if (state == "WI" || state == "TX" || state == "IL") {
        val localTax = countyTax()
        var salesTax = (orderAmt * (taxRate!! + localTax!!))
        val total = orderAmt + salesTax
        val formattedTax = ("%.2f".format(salesTax))
        val formattedTotal = ("%.2f".format(total))
        println("For that delivery: ")
        println("The subtotal is: $$formattedOrder")
        println("The tax is: $$formattedTax")
        println("The total is: $$formattedTotal")
    } else {
        println()
        println("For a delivery to $state")
        println("The total is: $$formattedOrder")
    }

}

fun countyTax(): Double? {
    print("What county is the delivery going to? ")
    val county = readLine()?.lowercase()
    val localTax: Double? = when (county) {
        "harris" -> countyTaxes["harris"]
        "eau claire" -> countyTaxes["eau claire"]
        "dunn" -> countyTaxes["dunn"]
        else -> 0.00
    }
    return localTax
}