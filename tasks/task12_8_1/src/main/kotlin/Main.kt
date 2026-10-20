// Task 12.8.1: demo program for Day enum class

fun main(){
    try{
        print("Enter a day of the week: ")
        val dayString = readln()
        val day = Day.valueOf(dayString)
    }
    catch (error: IllegalArgumentException) {
        println("Error, Input must be: ")
        for (day in Day.entries){
            println(day)
        }
    }
}