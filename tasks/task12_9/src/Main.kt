// Task 12.9: demo program for class implementing Static Factory Method
import kotlinx.datetime.LocalDate

fun main(){
    val person = Person.create("john", LocalDate(2006, 1, 30))

    val person2 = Person.create("john", LocalDate(2006, 1, 29))
}