// Exercises For Programmers by Brian P. Hogan
// Exercise 15: Password Validation
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

// Declare Map
val users = mapOf(
    "Trouble" to "blackie123",
    "Charlie" to "456siamese",
    "Oliver" to "pumpkin19",
    "Teddy" to "wanderer97"
)

fun main() {
    getUsername()
}

fun getUsername() {
    print("Enter your username: ")
    val userName = readLine()!!.capitalize()
    if (userName !in users) {
        println("No such user, try again")
    } else {
        println("Valid username")
        getPassword(userName)
    }
}

fun getPassword(userName: String) {
    print("Enter your password: ")
    val passWord = readLine()!!
    if (passWord != users[userName]){
        println("STRANGER DANGER!!! I DON'T KNOW YOU!!!11!!!!")
    } else {
        println("Welcome")
    }
}