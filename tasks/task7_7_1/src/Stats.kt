// Task 7.7.1: statistics functions
import kotlin.math.*

fun median(data: List<Float>):Float{
    val sortedData = data.sorted()
    val dataSize = sortedData.size
    if (dataSize % 2 == 1){
        return sortedData[dataSize/2]
    }
    else{
        return (sortedData[(dataSize/2) - 1] + sortedData[(dataSize/2)])/2
    }
}

fun displayStats(stats: List<Float>){
    println("Median: ${median(stats)}")
    println("Minimum: ${stats.min()}")
    println("Maximum: ${stats.max()}")
    println("Mean: ${stats.average()}")
    
}