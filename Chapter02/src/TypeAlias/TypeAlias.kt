package TypeAlias


typealias StringMap = Map<String, String>

// Refer ArrayIndexOutOfBoundsException as ArrayIndexException anywhere in project
typealias ArrayIndexException = ArrayIndexOutOfBoundsException

/* Suppose you have your own Date class and want to use Java date class within same class/function
You can give type alias as JavaData */
typealias JavaDate = java.util.Date

//You can also type alias for function as well
typealias BooleanPredicate<T> = (T) -> Boolean

fun getProducts(): StringMap {
    return mapOf(
        "Avocado" to "£2",
        "Whole meal bread" to "£1.60",
        "Milk" to "£1.50",
        "Yogurt" to "£1.90"
    )
}

fun main() {
    val oddNumbers: BooleanPredicate<Int> = { it % 2 != 0 }

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9).filter(oddNumbers)
    println(numbers)
}