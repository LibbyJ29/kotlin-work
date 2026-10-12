// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1){
        println("Error: 1 argument required")
        exitProcess(1)
    }
    val dataset = fetchData(args[0])
    val lowestTemp = dataset.minBy {it.second}
    val highestTemp = dataset.maxBy {it.second}
    println("Lowest temperature: Station: ${lowestTemp.first}, Temperature: ${lowestTemp.second}")
    println("Highest temperature: Station: ${highestTemp.first}, Temperature: ${highestTemp.second}")
        
    val averageTemp = dataset.sumOf {it.second / dataset.size}
    println("Average Temperature: %.2f".format(averageTemp))
    
    dataset.sortedBy { it.first }.forEach { println(it) }
    
    
    
}

