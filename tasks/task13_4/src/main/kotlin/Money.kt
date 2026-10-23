// Task 13.4: Money class

data class Money(val euros: Int, val cents: Int){
    init{
        require(euros >= 0) {"euros must be non negative"}
        require(cents in 0..99) {"cents must be non negative"}
    }

    operator fun plus(other: Money): Money{
        if ((cents + other.cents) > 99){
            return Money(euros + other.euros + 1, cents + other.cents - 100)
        } else{
            return Money(euros + other.euros, cents + other.cents)
        }
    }

    override fun toString() = "€${euros}.${cents}"
}