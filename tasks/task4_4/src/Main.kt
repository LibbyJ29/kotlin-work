// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 3){
        println("Error: 3 arguements required")
        exitProcess(1)
    }
    //initial temperature in Celsius; a maximum temperature in Celsius; and a temperature increment.
    val initialTemperature = args[0].toFloat()
    val maxTemperature = args[1].toFloat()
    val temperatureIncrement = args[2].toFloat()
}
