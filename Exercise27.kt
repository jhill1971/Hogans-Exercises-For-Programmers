// Exercises For Programmers by Brian P. Hogan
// Exercise 27: Validating Inputs
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

/**
Create a function for each type of validation you need. Then create a validateInput function that takes in all of the
input data and invokes the specific validation functions.
Use a single output statement to display the output.

Rules:
Prompt for first name, last name, employee id, and zipcode
The first name must be filled in
The last name must be filled in
The first and last name must be at least two characters long
The employee ID must be in the format AA-1234
The zip code must be a number
 */
import kotlin.system.exitProcess

val letters = listOf<Char>('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v',
    'w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V',
    'W','X','Y','Z')
val numbers = listOf<Char>('1', '2', '3', '4', '5', '6', '7', '8', '9', '0')

/** Entry Point for the Program */
fun main () {
    userInput()}

/** Get user input and send for analysis */
fun userInput () {
    println ("Enter your first name:")
    val firstName = readLine().toString()
    validateFirstName(firstName)

    println ("Enter your last name:")
    val lastName = readLine().toString()
    validateLastName(lastName)

    println ("Enter your zip code:")
    val zipCode = readLine().toString()
    validateZipCode(zipCode)

    println ("Enter your employee ID:")
    val empID = readLine().toString()
    validateEmployeeID(empID)

    validationOutput(firstName,lastName, zipCode, empID)

}


fun validateFirstName (firstName:String): Boolean{
    if (firstName.isBlank() || firstName.length < 2){
        println ("$firstName is not valid input.")
        exitProcess(1)
    } else println ("$firstName is valid")

    return true
}

fun validateLastName (lastName: String): Boolean{
    if (lastName.isBlank() || lastName.length < 2) {
        println ("$lastName is not valid input.")
        exitProcess(1)
    } else println ("$lastName is valid")

    return true
}

fun validateZipCode (zipCode: String):Boolean{
    try {
        zipCode.toInt()
    }catch (e: NumberFormatException){
        println("$zipCode is not valid input.")
        exitProcess(1)
    }
    println ("$zipCode is valid")
    return true
}

fun validateEmployeeID (employeeID: String) :Boolean {
    val idPattern = "[a-z][a-z]-[0-9][0-9][0-9][0-9]".toRegex()
    if (employeeID.matches(idPattern)){ println("Employee ID okay")
    } else {
        println("Employeee ID invalid.")
        exitProcess(1)
    }
    return true
}

fun validationOutput (firstName:String, lastName:String, zipCode: String, employeeID: String) {
    println("$firstName,$lastName, $zipCode, and $employeeID are valid entries.")
}


