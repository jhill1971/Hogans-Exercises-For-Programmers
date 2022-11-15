// Exercises For Programmers by Brian P. Hogan
// Exercise 16: Legal Driving Age
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

import java.util.Scanner


// Maps/Lookup Tables: Country Codes to minimum driving ages and Country Codes to Full Names
val northAmericaAges = mapOf<String, Int>(
    "ATG" to 18,
    "BHS" to 18,
    "BRB" to 18,
    "BLZ" to 18,
    "CAN" to 16,
    "CRI" to 18,
    "DMA" to 18,
    "DOM" to 18,
    "SLV" to 18,
    "GRD" to 18,
    "GTM" to 18,
    "HTI" to 18,
    "HND" to 18,
    "JAM" to 18,
    "MEX" to 18,
    "NIC" to 18,
    "PAN" to 18,
    "KNA" to 18,
    "LCA" to 18,
    "VCT" to 17,
    "TTO" to 17,
    "USA" to 16
)

val nations = mapOf<String, String>(
    "ATG" to "Antigua and Barbuda",
    "BHS" to "The Bahamas",
    "BRB" to "Barbados",
    "BLZ" to "Belize",
    "CAN" to "Canada",
    "CRI" to "Costa Rica",
    "DMA" to "Dominica",
    "DOM" to "The Dominican Republic",
    "SLV" to "El Salvador",
    "GRD" to "Grenada",
    "GTM" to "Guatemala",
    "HTI" to "Haiti",
    "HND" to "Honduras",
    "JAM" to "Jamaica",
    "MEX" to "Mexico",
    "NIC" to "Nicaragua",
    "PAN" to "Panama",
    "KNA" to "St. Kitts and Nevis",
    "LCA" to "St. Lucia",
    "VCT" to "St. Vincent and the Grenadines",
    "TTO" to "Trinidad and Tobago",
    "USA" to "The United States"
)

fun main() {
    val reader = Scanner(System.`in`)

    println(
        """Find out if you are eligible to drive in the any of the nations of North America.
        |Enter the three-letter abbreviation for the nation in which you want to drive.
        |For territories and dependencies, use the code of the parent country.
    """.trimMargin()
    )
    println()
    // Get user input
    print("Country Code: ")
    val countryCode = readLine()?.uppercase()
    print("What is your age? ")
    val age = reader.nextInt()

    // Decision and output statements
    if (countryCode !in northAmericaAges) {
        println("Country not found. Try again.")
    } else {
        if (age >= northAmericaAges[countryCode]!!) {
            println("You are old enough to drive in ${nations[countryCode]}.")
        } else {
            println("You're not old enough to drive in ${nations[countryCode]}.")
        }
    }
}