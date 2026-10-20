// Task 12.5.3: demo program for class with custom setter

import kotlinx.datetime.LocalDate

fun main(){
    var birthDate = LocalDate(2001,2,1)
    var person = Person("john",birthDate)

    person.name = ""
}