// Exercises For Programmers by Brian P. Hogan
// Exercise 39: Sorting Records
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

/**
 * Given the provided data set, create a program that sorts all employees by last name and prints them to the screen
 * in a tabular format.
 */
import java.util.Formatter
// Data class to structure the employee data. Answers the question,"What KIND of data do we want?"
data class Employee(
    val firstName: String,
    val lastName: String,
    val position: String,
    val separation: String
)

// The actual employee data. Answers the question, "What IS the data the want? "
val dataSet = listOf<Employee>(
    Employee("John", "Johnson", "Manager", "2016-12-31"),
    Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"),
    Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"),
    Employee("Sally", "Weber", "Web Developer", "2015-12-18"),
    Employee("Jake", "Jacobson", "Programmer", "UNSEPARATED"),
    Employee("Jacquelyn", "Jackson", "DBA", "UNSEPARATED")
)

fun main() {
    // Sort data set by employee last name.
    val sortedData = dataSet.sortedBy{ it.lastName  }
    // Print table header
    System.out.format("%1s%26s%40s", "NAME", "| POSITION", "| SEPARATION DATE\n")
    for(x in 0..68){print("-")}
    print("\n")

    // Iterate through list and print employee information
    for (employee in sortedData){
        System.out.format("%-20s%-32s%-13s", "${employee.firstName+" "+employee.lastName}", "| ${employee.position}", "| ${employee.separation}\n")
    }

}