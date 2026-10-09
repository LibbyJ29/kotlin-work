// Task 5.2.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>){
    if (args.size != 1){
        println("Error: 1 arguement required")
        exitProcess(1)
    }
    val area = circleArea(args[0].toDouble())
    val perimeter = circlePerimeter(args[0].toDouble())
    println("Circle Area: %.4f".format(area))
    println("Circle Perimeter: %.4f".format(perimeter))
}