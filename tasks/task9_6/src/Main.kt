// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    
    if(args.size != 1){
        throw IllegalArgumentException("Error: 1 arguement required")
        exitProcess(1)
    }
    try{
        val dataset = readData(args[0])
        val variance = variance(dataset)
        
        println("Size of Dataset: ${dataset.size}")
        println("Variance: %.5f".format(variance))
    }
    catch (error: IllegalArgumentException){
        println("Error: Bad File")
        exitProcess(1)
    }
    catch (error: Exception){
        println("Error: Something went wrong")
        exitProcess(1)
    }
}
