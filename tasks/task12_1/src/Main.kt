// Task 12.1: program that uses a Point object

fun main(){
    val p1 = Point(1.0, 2.0)
    println("Point 1: x = ${p1.x}")
    println("Point 1: y = ${p1.y}")
    val distanceFromOrigin = p1.distance()
    println("Point 1: distance from origin = %.2f".format(distanceFromOrigin))

    val p2 = Point(4.5,7.0)
    println("Point 2: x = ${p2.x}")
    println("Point 2: y = ${p2.y}")
    val distanceToPoint = p1.distanceTo(p2)
    println("Point 1: distance to Point 2 = %.2f".format(distanceToPoint))
}