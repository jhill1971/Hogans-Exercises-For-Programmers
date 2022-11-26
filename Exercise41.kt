import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser
import java.io.InputStream
import java.nio.file.Files
import java.nio.file.Files.newBufferedReader
import java.nio.file.Paths
import java.util.*
import javax.swing.text.html.HTML.Tag.P

// Exercises For Programmers by Brian P. Hogan
// Exercise 41: Name Sorter
// James Hill, Houston, Texas, 2022
// GitHub: jhill1971 Twitter: @count_BASIC

/** Create a program that reads a list of names, sorts the list alphabetically, then outputs a table to the console.*/

data class Person(
    val lastName: String,
    val firstName: String
)

val personData = listOf<Person>(
    Person("Ling", "Mai"),
    Person("Johnson", "Jim"),
    Person("Zarnecki", "Sabrina"),
    Person("Jones","Chris"),
    Person("Jones", "Aaron"),
    Person("Swift", "Geoffrey"),
    Person("Xiong", "Fong")
)

/** Program entry point */
fun main() {
    // Sort data set by employee last name.
    val sortedData = personData.sortedBy{ it.lastName  }
    // Print table header
    println("Total of ${sortedData.size} names")
    for(x in 0..17){print("-")}
    print("\n")

    // Iterate through list and print names
    for (person in sortedData){
       println( "${person.lastName}, ${person.firstName}")
    }
}