import java.util.*

// Exercises For Programmers by Brian P. Hogan
// Exercise 10: Self-Checkout
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

/**
 * Create a simple self-checkout system. Prompt for the prices and quantities of three items. Calculate the
 * subtotal of the items. Then, calculate the tax using a tax rate of 5.5%. Print out the line items with the quantity
 * and total, and then print out the subtotal, tax amount, and grand total.
 */

const val TAX_RATE: Double = 0.055
fun main() {
    // Declare Arrays
    val items = arrayOf("Item 1", "Item 2", "Item 3")
    val quantity = arrayOf(0, 0, 0)
    val unitPrice = arrayOf(0.0, 0.0, 0.0)
    val price = arrayOf(0.0, 0.0, 0.0)

    // Declare Variables
    val x = 0
    var subSub:Double = quantity[x]*price[x]
    var subTotal = 0.0
    val taxAmount = price.sum() * TAX_RATE
    val grandTotal = price.sum() + taxAmount

    // create scanner object
    val reader = Scanner(System.`in`)

    // User Input
    for (x in 1..3){
        print("Enter how many of item $x you want: ")
        val quanInput = reader.nextInt()
        print("What is the price of item $x? " )
        val priceInput = reader.nextDouble()
        quantity[x-1] = quanInput
        unitPrice[x-1] = priceInput
        price[x-1] = quanInput * priceInput
    }

    // Output
    println()
    println("Item\tQuantity\tPer Unit\tPrice")
    println("***************************************")
    for (x in 0..2){
        println("${items[x]}\t${quantity[x]}\t\t\t$${unitPrice[x]}\t\t$${price[x]}")
    }
    println("***************************************")
    println("SUBTOTAL:   \t$${price.sum()}")
    println("TAX:    \t\t$${price.sum()}")
    println("GRAND TOTAL: \t$$grandTotal")
}