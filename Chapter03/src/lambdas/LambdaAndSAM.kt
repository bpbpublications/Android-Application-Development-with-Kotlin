package lambdas

class Gibberish(private val number: Int) {
    private lateinit var calculable: Calculable

    fun setOnCalculateListener(calculable: Calculable) {
        this.calculable = calculable
    }


    fun performCalculation(newNum: Int, operationType: OperationType) {
        val result = when (operationType) {
            OperationType.SUM -> number + newNum
            OperationType.SUBTRACT -> number - newNum
            OperationType.MULTIPLY -> number * newNum
            OperationType.DIVISION -> number / newNum
        }

        if (::calculable.isInitialized) {
            calculable.onCalculate(number, result, operationType)
        }

    }
}

fun main() {
    val g1 = Gibberish(10)
    val g2 = Gibberish(20)

    g1.setOnCalculateListener(object : Calculable {
        override fun onCalculate(number: Int, result: Int, operationType: OperationType) {
            println("$number is changed to $result because $operationType was requested")
        }
    })

    g1.performCalculation(30, OperationType.SUM)
    g2.setOnCalculateListener(Calculable { number, result, operationType ->
        println("$number is changed to $result because $operationType was requested")
    })
}