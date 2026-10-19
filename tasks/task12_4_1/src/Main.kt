// Task 12.4.1: main program

fun main(){
    val circle = Circle(Point(1.0, 2.0), 3.0)
    val point = Point(2.0, 1.0)
    println("Area: ${circle.area()}")
    println("Perimeter: ${circle.perimeter()}")
    println("Contains point? ${circle contains point}")
}