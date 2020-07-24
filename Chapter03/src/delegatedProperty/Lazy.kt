package delegatedProperty

fun main() {
    val sayHello by lazy {
        println("Inside lazy")
        "Hello"
    }
}