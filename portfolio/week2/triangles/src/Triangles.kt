// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(sides: Triangle): Boolean{
    val (a, b, c) = sides
    
    //comparisons
    if ((a + b > c) && (a + c > b) && (b + c > a)){
        return true
    }
    else{
        return false
    }
}

fun triangleArea(sides: Triangle): Double{
    val (a, b, c) = sides
    
    //calculation
    val s = 0.5 * (a+b+c)
    val area = sqrt(s * (s-a) * (s-b) * (s-c))

    return area
}