// Task 12.5.2: demo program for class with custom getter
import kotlinx.datetime.LocalDate

fun main(){
    val birthDate = LocalDate(2003,4,12)
    val person = Person("John", birthDate)
    println("Persons name: ${person.name}")
}