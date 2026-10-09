// Task 5.1.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>){
    if (args.size !=2){
        println("Error: 2 arguements required")
        exitProcess(1)
    }
    val result = anagrams(args[0],args[1])
    println(result)
}

