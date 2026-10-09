// Task 4.7: finding the longest line in a file
import kotlin.system.exitProcess
import kotlin.io.path.*
import kotlin.io.useLines

fun main(args: Array<String>) {
    if (args.size != 1){
        println("Error: 1 arguement required")
        exitProcess(1)
    }
    
    val filePath = Path(args[0])
    var longestLine = ""
    var lineNumber = 0
    var longestLineNumber = 0
    
    filePath.useLines {
        for (line in it){
            lineNumber += 1
            if (line.length > longestLine.length){
                longestLine = line
                longestLineNumber = lineNumber 
            }
        }
    }
    println("Line ${longestLineNumber} is the longest (length = ${longestLine.length})")


}