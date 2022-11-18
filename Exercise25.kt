// Exercises For Programmers by Brian P. Hogan
// Exercise 25: Password Strength Indicator
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

/**
 * RULES:
 * A VERY WEAK password contains only numbers and is < 8 characters in length. ex: '12345'
 * A WEAK password contains only letters and is < 8 characters in length. ex: 'abcdef'
 * A STRONG password contains letters and at least 1 number and is >= 8 characters in length. ex: 'abc123xyz'
 * A VERY STRONG password contains letters, numbers, special characters and is >= 8 characters in length. ex: '1337h@xor!'
 */

/** Main Function gets the user's input, passes the password for analysis, and returns the results */
fun main () {
    println ("Enter the password you want to check:")
    val password = readLine()
    val result = passwordAnalysis(password.toString())

    when (result){
        '0' -> println ("Your password is very weak.")
        '1' -> println ("Your password is weak.")
        '2' -> println ("Your password is strong.")
        '3' -> println ("Your password is very strong.")
        else -> println ("try again.")
    }
}

/** This function analyzes the password in question */
fun passwordAnalysis (pwd:String): Char {
    // lists that contain possible characters.
    val letters = listOf<Char>('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v',
        'w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V',
        'W','X','Y','Z')
    val numbers = listOf<Char>('1', '2', '3', '4', '5', '6', '7', '8', '9', '0')
    val specSymbols = listOf<Char>('!', '@', '#', '$', '%', '^', '&','*','_','-', '+', '=')

    // declare variables
    var l = 0
    var n = 0
    var s = 0

    // declare return constants
    val vWeak = '0'
    val weak = '1'
    val strong = '2'
    val vStrong = '3'
    val huh = '4'

    // analyze password string - does the password contain letters, numbers, and special symbols?
    for (x in pwd) {
        if (x in letters) {
            l += 1
        }
        if (x in numbers) {
            n += 1
        }
        if (x in specSymbols) {
            s += 1
        }

    }

    // Check password length and the type of characters it contains.
    val strLength = pwd.length
    if (strLength >= 8 && s >= 1 && l + n + s == strLength) {return vStrong}
    if (strLength >= 8 && s == 0 && l < strLength && l + n == strLength) {return strong}
    if (strLength < 8 && n == strLength) {return vWeak}
    if (strLength < 8 && l == strLength) {return weak}

    return huh
}