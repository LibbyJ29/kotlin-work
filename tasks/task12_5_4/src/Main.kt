// Task 12.5.4: demo program for class with a computed property
import kotlinx.datetime.LocalDate

fun main(){
    val birthDate = LocalDate(2006,1,30)
    val person = Person("John",birthDate)
    println("Persons age: ${person.age}")
}