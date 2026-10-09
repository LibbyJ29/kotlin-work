// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1){
        println("Error: 1 arguement required")
        exitProcess(1)
    }
    
    val upperLimit = args[0].toInt()
    println(upperLimit)
    var currentSum = 0
    var newSum = 0
    for (i in 1..upperLimit){
        if (i % 2 == 1){
            newSum += i
            println("${currentSum} + ${i} = ${newSum}")
            currentSum = newSum
        }
    }

}
