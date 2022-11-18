// Exercises For Programmers by Brian P. Hogan
// Exercise 24: Anagram Checker
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

import java.util.*

/** The Main Function gets the user's input and passes it for analysis
 * The results are then displayed from this function.
 */
fun main () {
    // get input
    println("Enter the first word:")
    val stringOne = readLine()
    println("Enter the second word:")
    val stringTwo = readLine()

    // call function
    val result = isAnagram(stringOne.toString(), stringTwo.toString())

    // check result
    if (result) {
        println("The words are anagrams.")
    } else {
        println("THe words are not anagrams.")

    }
}
/** This function checks whether the passed strings are anagrams. */
fun isAnagram (wordOne:String, wordTwo:String): Boolean {

    // Firstly, To be anagrams, the strings must be of equal length.
    if (wordOne.length != wordTwo.length) {
        return false
    }

    // Convert strings to charArrays.
    val stringArrayOne = wordOne.toCharArray()
    val stringArrayTwo = wordTwo.toCharArray()

    // Sort arrays
    Arrays.sort(stringArrayOne)
    Arrays.sort(stringArrayTwo)

    // Convert arrays back to strings
    val sortedOne = String(stringArrayOne)
    val sortedTwo = String(stringArrayTwo)

    // Now we can compare the sorted strings.

    if (sortedOne == sortedTwo) {
        return true
    }
    return false
}
