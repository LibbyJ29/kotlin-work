
import kotlin.math.*

fun median(data: List<Float>):Float{
    if (data.size < 1){
        throw IllegalArgumentException("Size equals zero")
    }

    val sortedData = data.sorted()
    val dataSize = sortedData.size
    if (dataSize % 2 == 1){
        return sortedData[dataSize/2]
    } else{
        return (sortedData[(dataSize/2) - 1] + sortedData[(dataSize/2)])/2
    }
}

