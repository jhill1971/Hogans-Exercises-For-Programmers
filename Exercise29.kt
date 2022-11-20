// Exercises For Programmers by Brian P. Hogan
// Exercise 29: Handling Bad Input
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

/** Entry point for the program*/
fun main () {
    seventyTwo()
}

/** Get user input and check for valid input*/
fun seventyTwo () {
    var check = false
    while (check == false){
        println ("Please enter the rate of return: ")
        val ror = readLine()
        var numeric = true
        try {
            ror!!.toInt()
        }catch (e: NumberFormatException){
            numeric = false
        }
        if (numeric) {
            println("Valid input")
        }else{
            println("Sorry, $ror is not valid input.")
            println("Input must be an integer.")
            continue}
        if (ror!!.toInt() == 0){
            println ("Sorry, $ror is not a valid input.")
            println ("Input must be greater than 0.")
        }else{
            val years = 72/ ror.toDouble()
            val formattedYears = "%.2f".format(years)
            println("It will take $formattedYears years to double your initial investment.")
            check = true
        }

    }
}

