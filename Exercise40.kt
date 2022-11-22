// Exercises For Programmers by Brian P. Hogan
// Exercise 40: Filtering Records
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

import java.util.Formatter

// Data class to structure the employee data. Answers the question,"What KIND of data do we want?"
data class Employee2(
    val firstName: String,
    val lastName: String,
    val position: String,
    val separation: String
)

// The actual employee data. Answers the question, "What IS the data the want? "
val dataSet2 = listOf<Employee>(
    Employee("John", "Johnson", "Manager", "2016-12-31"),
    Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"),
    Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"),
    Employee("Sally", "Weber", "Web Developer", "2015-12-18"),
    Employee("Jake", "Jacobson", "Programmer", "UNSEPARATED"),
    Employee("Jacquelyn", "Jackson", "DBA", "UNSEPARATED")
)

fun main() {
    // Get search value from user
    print("What first or last name do you want to search for? ")
    val searchString = readLine().toString().capitalize()
    println()

    // Print table header
    System.out.format("%1s%26s%40s", "NAME", "| POSITION", "| SEPARATION DATE\n")
    for(x in 0..68){print("-")}
    print("\n")

    // Loop through dataSet
    for (employee in dataSet2){
        // Check Search String against content of list, if found, then display employee information
        if(searchString in employee.lastName || searchString in employee.firstName){
            System.out.format("%-20s%-32s%-13s", employee.firstName+" "+employee.lastName, "| ${employee.position}", "| ${employee.separation}\n")
        } else continue
    }
}