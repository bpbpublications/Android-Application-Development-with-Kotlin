package typeCasting

fun main() {
    cast(10)// Prints null
    cast("Hardik") // Prints 6
}

fun cast(data: Any) {
    //println((data as String).length)
    println((data as? String)?.length)
}

fun castGeneric(data: Any) {
    when (data) {
        is HashMap<*, *> -> println(data[1])
        is List<*> -> println(data[0])
        else -> println("Given type is neither a Map nor a List")
    }
}