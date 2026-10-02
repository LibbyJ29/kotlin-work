// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

//herons formula s=1/2(a+b+c) then A = sqrt(s(s-a)(s-b)(s-c))
import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>){
    // validate 3 arguments inputted
    if (args.size !=3){
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }
    
    // arguments to floats
    val a = args[0].toFloat()
    val b = args[1].toFloat()
    val c = args[2].toFloat()
    
    //calculation
    val s = 0.5 * (a+b+c)
    val area = sqrt(s * (s-a) * (s-b) * (s-c))
    
    //output
    println("Area = %.5f".format(area))
    
}