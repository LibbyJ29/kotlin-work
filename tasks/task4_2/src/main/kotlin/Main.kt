// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    println("PIZZA MENU \n(a)Margherita\n(b)Pepperoni\n(c)Hawaiinan\n(d)Meat Feast")
    print("Select a pizza (a-d): ")
    val pizza = readln().lowercase()
    
    if (pizza.length == 1 && pizza[0] in 'a'..'d'){
            println("Order accepted")
    }
    else{
        println("Invalid choice!")
    }
    
}
