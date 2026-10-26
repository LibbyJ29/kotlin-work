// Task 15.2.3: SavingsAccount class

class SavingsAccount(holder: String, val rate: Double) : BankAccount(holder){

    init{
        require(rate >= 0) {"Rate must not be lower than 0"}
    }

    fun applyIntrest(){
        val intrest = (rate / 100) * balance
        deposit(intrest.toInt())
    }
}