# Task 12.1: program that uses a Point object

# Remember that you'll need an import statement to access the class!
from point import Point

p1 = Point(1, 2)
print(f"Point 1: x = {p1.x}")
print(f"Point 1: y = {p1.y}")
distanceFromOrigin = p1.distance()
print(f"Point 1: Distance from origin = {distanceFromOrigin:.2f}")

p2 = Point(4.5, 7)
print(f"Point 2: x = {p2.x}")
print(f"Point 2: y = {p2.y}")
distanceToPoint = p1.distanceTo(p2)
print(f"Point 1: Distance to Point 2 = {distanceToPoint:.2f}")
