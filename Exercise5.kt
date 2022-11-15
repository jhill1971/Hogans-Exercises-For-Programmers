// Exercises For Programmers by Brian P. Hogan
// Exercise 5: Simple Math
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

fun main() {

    // Get input
    print("What is the first number? ")
    val num1 = readLine()!!.toInt() // I'm using the not-null assertion. Normally, one would avoid this in non-trivial programs.
    print("What is the second number?")
    val num2 = readLine()!!.toInt()

    // Output to console
    println ("$num1 + $num2 = ${num1+num2}")
    println ("$num1 - $num2 = ${num1-num2}") // Extension: Check for larger integer.
    println ("$num1 * $num2 = ${num1*num2}")
    println ("$num1 / $num2 = ${num1/num2}") // Extension: Adjust decimal output.

}