// Task 15.2.3: demo program

fun main() {
    // Write code to demonstrate the classes here
    val savingsAccount = SavingsAccount("John", 1.8)
    savingsAccount.deposit(1250)
    println("Original balance: £${savingsAccount.balance}")

    for (i in 1..5){
        savingsAccount.applyIntrest()
        println("Year ${i} balance: £${savingsAccount.balance}")
    }

    savingsAccount.withdraw(50)
    println("Final balance: £${savingsAccount.balance}")
}
