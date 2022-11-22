// Exercises For Programmers by Brian P. Hogan
// Exercise 38: Filtering Values
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

/** Program Entry Point*/
fun main() {
    filteringValues()
}

/** Input and analysis function */
fun filteringValues () {
    // Input list
    val values = mutableListOf<String>()
    println("Enter numbers, blank entry to quit: ")
    var input: String = "0"

    // Get Input and add it to list
    while (input != ""){
        println ("Enter a number:")
        input = readLine().toString()
        if (input == ""){break
        }else{
            values.add(input)
        }
    }
    // analysis list
    val analysisList = mutableListOf<Int>()
    for (x in values){
        analysisList.add(x.toInt())
    }

    // Filter numbers bu even/odd
    val filteredList = mutableListOf<Int>()
    for (y in analysisList){
        if (y%2 == 0){
            filteredList.add(y)
        }
    }
    // Output
    println ("The even numbers are: $filteredList")
}
