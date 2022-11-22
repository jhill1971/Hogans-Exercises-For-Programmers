// Exercises For Programmers by Brian P. Hogan
// Exercise 37: Password Generator
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

/** Program Entry Point */
fun main () {
    getPassword()
}

/** Output */
fun getPassword(){
    println ("Your password is: ${passWordGenerator()}")
}

/** Password Generation Function */
fun passWordGenerator (): String {
    // arrays that contain possible characters.
    val letters = listOf<Char>('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v',
        'w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V',
        'W','X','Y','Z')
    val numbers = listOf<Char>('1', '2', '3', '4', '5', '6', '7', '8', '9', '0')
    val specSymbols = listOf<Char>('!', '@', '#', '$', '%', '^', '&','*','_','-', '+', '=')

    // array for new password
    val pwd = mutableListOf<Char>()

    println("How many characters do you want in your password: ")
    val totalCharacters = readLine()?.toInt()
    println("Of those, how many numbers do you want in your password?: ")
    val totalNumbers = readLine()?.toInt()
    println("And, how many special characters do you want in your password?: ")
    val totalSpecChar = readLine()?.toInt()
    val totalLetters:Int = totalCharacters!! - (totalNumbers!!.plus(totalSpecChar!!))
    println("Total Characters: $totalCharacters")

    //Input validation
    if (totalLetters < 0){
        println ("Invalid input. Restarting...")
        Thread.sleep(3000)
        getPassword()

    }else {
        //RANDOMLY SELECT LETTERS AND ADD TO LIST
        println("Letters: $totalLetters, Numbers: $totalNumbers, SpecChar: $totalSpecChar")
        for (x in 1..totalLetters)
            pwd.add(letters.shuffled()[0])

        //RANDOMLY SELECT NUMBERS AND ADD TO LIST
        for (x in 1..totalNumbers)
            pwd.add(numbers.shuffled()[0])

        //RANDOMLY SELECT SPEC CHARACTERS AND ADD TO LIST
        for (x in 1..totalSpecChar)
            pwd.add(specSymbols.shuffled()[0])
    }

    //CONVERT CHARS IN LIST TO ONE STRING
    val final = pwd.shuffled().joinToString("")

    //RETURN COMPLETED PASSWORD
    return final
}
