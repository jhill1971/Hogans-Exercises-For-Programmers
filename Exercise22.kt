// Exercises For Programmers by Brian P. Hogan
// Exercise 22:Comparing Numbers
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

/**
 * Write a program that asks for three numbers. Check first to see that all the numbers are different. If they
 * are not different, then exit the program. Otherwise, display the largest number of the three.
 * CONSTRAINT: Write the algorithm manually. Don't use a built-in function for finding the largest
 * number in a list.
 */

import java.util.Scanner
import kotlin.system.exitProcess

fun main() {
    val reader = Scanner(System.`in`)
    // get input
    println("Enter three different integer numbers when prompted.")
    print("enter n1: ")
    val n1: Int = reader.nextInt()
    print("enter n2: ")
    val n2: Int = reader.nextInt()
    print("enter n3: ")
    val n3: Int = reader.nextInt()

    // first check
    if ((n1 == n2) || (n2 == n3) || (n1 == n3)){
        println("The integer numbers should all be different")
        exitProcess(0)
    } else {
        println("let's compare the numbers")
    }

    // compare the numbers
    if ((n1 > n2) && (n1 > n3)){
        println("N1, $n1, is the biggest number.")
    } else if ((n2 > n1) && (n2 > n3)) {
        println("N2, $n2, is the biggest number.")
    } else {
        println("N3, $n3, is the biggest number")
    }

}