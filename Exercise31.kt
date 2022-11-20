// Exercises For Programmers by Brian P. Hogan
// Exercise 31: Karvonen Heart Rate
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

/** Entry point for program */
fun main() {
    userData()
}

/** function to get user input. Checks that input is valid (within set range). */
fun userData() {
    val check = false //sentinel variable
    while (!check) {
        //input loop
        println("Please enter your age (1 to 100): ")
        val userAge = readLine()
        if (userAge!!.toInt() !in 1..100) {
            println("Invalid Input. Input must be an integer between 1 and 100.")
            continue
        } else {
            println("Please enter your resting pulse rate (50 to 100): ")
            val userPulse = readLine()
            if (userPulse!!.toInt() !in 50..100) {
                println("Invalid Input. Input must be an integer between 50 and 100.")
                continue
            } else {
                //pass to next function
                heartRateOutput(userAge.toInt(), userPulse.toInt())
                break
            }
        }
    }
}//End of userData function

/** function to calculate and output Karvonen Heart Rate Table */
fun heartRateOutput(userAge: Int, userPulse: Int) {

    // List of Intensities, as percents
    val inten = listOf<Int>(55, 60, 65, 70, 75, 80, 85, 90, 95)
    //Top of output
    println("Age: $userAge \t\t  Resting Pulse: $userPulse")
    println("Intensity \t\t| Rate")
    println("-------------------------")
    //calculation loop
    for (x in 0..8) {
        val dividend = inten[x].toDouble() / 100 //convert percents to decimals
        val thr: Double =
            (((220 - userAge) - userPulse) * dividend) + userPulse//Carry out calculation on current list element
        println("${inten[x]}%\t\t\t    | ${thr.toInt()} bpm") //output
    }
}//End of heartRateOutput function


