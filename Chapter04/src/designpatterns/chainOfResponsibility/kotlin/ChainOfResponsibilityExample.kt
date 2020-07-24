package designpatterns.chainOfResponsibility.kotlin

interface CurrencyDispenser {
    val currencyValue: Int
    val nextDispenser: CurrencyDispenser?
    fun dispenseMoney(amount: Int)
}

class DispenseTen(override val nextDispenser: CurrencyDispenser? = null, override val currencyValue: Int = 10) :
    CurrencyDispenser {
    override fun dispenseMoney(amount: Int) {
        if (amount >= currencyValue) {
            val (quantity, remainder) = amount.getQuantityAndRemainder(currencyValue)
            println("Dispensing $quantity of $currencyValue")
            if (remainder > 0) {
                println("Amount must be in multiple of £10")
            }
        } else if (amount != 0) {
            println("Amount must be in multiple of £10")
        }
    }
}

class DispenseTwenty(override val nextDispenser: CurrencyDispenser? = null, override val currencyValue: Int = 20) :
    CurrencyDispenser {
    override fun dispenseMoney(amount: Int) {
        if (amount >= currencyValue) {
            val (quantity, remainder) = amount.getQuantityAndRemainder(currencyValue)
            println("Dispensing $quantity of $currencyValue")
            nextDispenser?.dispenseMoney(remainder)
        } else {
            nextDispenser?.dispenseMoney(amount)
        }
    }
}

class DispenseFifty(override val nextDispenser: CurrencyDispenser? = null, override val currencyValue: Int = 50) :
    CurrencyDispenser {
    override fun dispenseMoney(amount: Int) {
        if (amount >= currencyValue) {
            val (quantity, remainder) = amount.getQuantityAndRemainder(currencyValue)
            println("Dispensing $quantity of $currencyValue")
            nextDispenser?.dispenseMoney(remainder)
        } else {
            nextDispenser?.dispenseMoney(amount)
        }
    }
}

class ATM {
    private val ten = DispenseTen()
    private val twenty = DispenseTwenty(ten)
    private val fifty = DispenseFifty(twenty)

    fun withdrawMoney(amount: Int) {
        fifty.dispenseMoney(amount)
        println("Denominations for $amount")
    }
}

private fun Int.getQuantityAndRemainder(currencyValue: Int): Pair<Int, Int> {
    val quantity = this / currencyValue
    val remainder = this % currencyValue
    return Pair(quantity, remainder)
}

fun main() {
    ATM().apply {
        withdrawMoney(120)
        withdrawMoney(30)
        withdrawMoney(40)
        withdrawMoney(15)
    }
}