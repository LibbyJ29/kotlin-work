// Task 4.3: grade calculation using a when expression
import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args: Array<String>){
    if (args.size != 3){
        println("Error: 3 arguements required")
        exitProcess(1)
    }
    val averageMark = ((args[0].toFloat() + args[1].toFloat() + args[2].toFloat()) / 3).roundToInt()
    val grade = when (averageMark){
        in 0..39   -> "Fail"
        in 40..69  -> "Pass"
        in 70..100 -> "Distinction"
        else       -> "?"
    }
    println("Average mark: ${averageMark}\nGrade: ${grade}")
}

