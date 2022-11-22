// Exercises For Programmers by Brian P. Hogan
// Exercise 34: Employee List Removal
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

/** List of employees */
val employees = mutableListOf<String>(
    "john smith",
    "jackie johnson",
    "chris jones",
    "amanda cullen",
    "jeremy goodwin"
)

/** Program Entry Point */
fun main() {
    employeeList()
}

/** Working with the employee list */
fun employeeList() {
    //Initial count of employees in list
    println("There are ${employees.count()} employees")
    //Display each item in list on its own line
    for (x in employees) {
        println(x)
    }
    println()

    //Get name to delete
    print("Enter an employee to remove: ")
    val removal = readLine()?.lowercase()
    // Validate input
    if (removal in employees) {
        employees.remove(removal)
    } else {
        println("Target not in list. Try again")
        println()
        employeeList()
    }

    //New count of employees in list
    println("There are ${employees.count()} employees")
    //Display each item in list on its own line
    for (x in employees) {
        println(x)
    }
}


