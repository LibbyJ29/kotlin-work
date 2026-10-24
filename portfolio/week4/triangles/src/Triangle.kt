// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double){
    
    fun isValidTriangle() = ((sideA + sideB > sideC) && (sideA+ sideC > sideB) && (sideB + sideC > sideA))

    init{
        require(isValidTriangle()) {"side has to make a valid triangle"}
    }

    val perimeter get() = sideA + sideB + sideC

    val semiPerimeter get() = perimeter / 2

    val area get() = sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC))

    override fun toString() = "Triangle(${sideA}, ${sideB}, ${sideC})"
   
}
