// Exercises For Programmers by Brian P. Hogan
// Exercise 33: Magic 8 Ball
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

/** Program entry point */
fun main() {
    intro()
}

/** Get "User Input"*/
fun intro () {
    println ("Concentrate on a yes/no question...")
    //pause
    Thread.sleep(2000)
    shake()
}

/** Shaking the ball */
fun shake () {
    for( x in 0..3){
        println("Shaking ball...")
        //pause
        Thread.sleep(1000)
    }
    selectResponse()
}

/** Get randomly selected response and output to console. */
fun selectResponse(){
    val responses = listOf<String>(
        "It is certain.",
        "It is decidedly so.",
        "Without a doubt.",
        "Yes, definitely.",
        "As I see it, yes.",
        "Most likely.",
        "Outlook good.",
        "Yes.",
        "Signs point to yes.",
        "Reply hazy, try again.",
        "Ask again later.",
        "Better not tell you now.",
        "Cannot predict now.",
        "Concentrate and ask again.",
        "Don't count on it.",
        "My reply is no.",
        "My sources say no.",
        "Outlook not so good.",
        "Very doubtful."
    )
    println()
    println ("The 8-Ball says:")
    val answer = responses.shuffled()[0]
    println (answer)
}

