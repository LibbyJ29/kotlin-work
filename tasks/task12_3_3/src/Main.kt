// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate
fun main() {
    val birthDate = LocalDate(2006, 2, 23)
    val marriedPerson = Person("", "2006-02-23").apply {
        isMarried = true
    }
    println(marriedPerson.name)
    println(marriedPerson.birth)
    println(marriedPerson.isMarried)

}