// COMP2850 Portfolio: Week 3

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

fun isValidTriangle(sides: Triangle): Boolean{
    val (a, b, c) = sides
    
    // Comparisons
    if ((a + b > c) && (a + c > b) && (b + c > a)){
        return true
    } else{
        return false
    }
}

fun triangleArea(sides: Triangle): Double{
    // Throw error if invalid triangle
    if(isValidTriangle(sides) == false){
        throw IllegalArgumentException("Invalid triangle")
    } else{
        val (a, b, c) = sides

        // Calculation
        val s = 0.5 * (a+b+c)
        val area = sqrt(s * (s-a) * (s-b) * (s-c))

        return area
    }
}