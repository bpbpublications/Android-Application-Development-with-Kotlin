package LateOrLazy

fun main() {
    val sayHello by lazy {
        println("Inside lazy")
        "Hello"
    }

    println(sayHello)

    println(sayHello)
}