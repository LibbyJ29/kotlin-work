// Task 7.3.1: list element access

fun main(){
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    println(numbers)
    println(numbers.slice(2..4))
    println(numbers.first())
    println(numbers.last())
    numbers[0] = 10
    numbers.add(1)
    println(numbers)
    
    numbers.add(1)
    println(numbers)
    val numbers2 = listOf(1,2,3,4,5)
    numbers.addAll(numbers2)
    println(numbers)
    numbers.remove(1)
    println(numbers)
    numbers.removeAll(numbers2)
    println(numbers)
    numbers.removeAt(2)
    println(numbers)
    numbers.clear()
    println(numbers)
}