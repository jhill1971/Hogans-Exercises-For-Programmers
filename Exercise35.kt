// Exercises For Programmers by Brian P. Hogan
// Exercise 35: Picking A Winner
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

/** Program Entry Point */
fun main() {
    winnerPicker()
}

/** Select winner from user-entered list*/
fun winnerPicker () {
    // Declare list and input variable
    var contestants = mutableListOf<String>()
    var input: String = "name"

    // User enters names. Empty string stops input.
    while (input != ""){
        println ("Enter the contestant's name:")
        input = readLine().toString()
        if (input == ""){break
        }else{
            contestants.add(input)}
    }
    // when user enters a blank string, select winner from entries in list.
    val winner = contestants.shuffled()[0]
    println ("The winner is... $winner!")
}

