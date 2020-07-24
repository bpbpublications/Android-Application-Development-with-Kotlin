package higherOrderFunction


fun main() {
    val division = getOperation(Operation.DIVISION)
    println(division.invoke(10, 20))

    val multiple = getOperation(Operation.MULTIPLY)
    println(multiple(30, 5))

}

enum class Operation {
    ADD, SUBTRACT, MULTIPLY, DIVISION
}

fun getOperation(type: Operation): (Int, Int) -> Int {
    return when (type) {
        Operation.SUBTRACT -> { x, y -> x - y }
        Operation.MULTIPLY -> { x, y -> x * y }
        Operation.DIVISION -> { x, y -> x / y }
        else -> { x, y -> x + y }
    }
}