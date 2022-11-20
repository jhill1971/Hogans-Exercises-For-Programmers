// Exercises For Programmers by Brian P. Hogan
// Exercise 32: Guess the Number Game
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

import java.util.*
import kotlin.random.Random
import kotlin.system.exitProcess

fun difficultySelection() {
    println("The Numbers Game")
    println("----------------")
    println()
    println("Choose your difficulty level!")
    println("1 = Easy")
    println("2 = Average")
    println("3 = Hard")
    //Create an instance which takes input from standard input
    val reader = Scanner(System.`in`)
    print("Enter your choice  (1,2,3):")
    //nextInt() reads the next integer from the keyboard
    var level: Int = reader.nextInt()
    gameLogic(level)

}

fun gameLogic(level: Int) {
    var max = 0
    if (level == 1) {
        max = 10
    }
    if (level == 2) {
        max = 100
    }
    if (level == 3) {
        max = 1000
    }
    println("max = $max")
    //println("You chose $level, $max units!")
    var sentinel = false
    while (sentinel == false) {
        var count = 0
        var guess = 0
        val target: Int = Random.nextInt(max)
        while (guess != target) {
            print("What number am I thinking of?")
            val reader = Scanner(System.`in`)
            guess = reader.nextInt()
            //println ("You guessed $guess")
            when {
                guess > target -> {
                    println("Too high! Try again")
                    count += 1
                }
                guess < target -> {
                    println("Too low! Try again")
                    count += 1
                }
                guess == target -> {
                    println("You got it in $count guesses!")
                    count += 1
                    sentinel = true
                    gameResult(count)
                }
            }
        }
    }

}

fun gameResult(score: Int) {
    if (score == 1) {
        println("You're a mind reader")
    }
    if (score in 2..4) {
        println("Most impressive!")
    }
    if (score in 5..6) {
        println("You can do better than that!")
    }
    if (score > 7) {
        println("Better luck net time!")
    }
    goAgain()
}

fun goAgain() {
    println("Do you want to go again? (y/n)")
    val response = readLine()
    if (response == "y") {
        difficultySelection()
    } else if (response == "n") {
        println("Goodbye!")
        exitProcess(0)
    } else {
        goAgain()
    }


}

fun main(args: Array<String>) {
    difficultySelection()
}