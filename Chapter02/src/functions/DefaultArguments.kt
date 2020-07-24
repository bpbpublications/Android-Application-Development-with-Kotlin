package functions

fun greet(greeting: String = "Hello!", message: String) {
    println("$greeting $message")
}

fun printMultiplicationTable(number: Int, limit: Int = 10) {
    for (count in 1..limit) {
        println("$number x $count = ${number * count}")
    }
}

fun greet(message: String) {
    println(message)
}

fun main() {
    greet(message = "Hardik") // Prints Hello! Hardik
    greet(greeting = "Good Morning!", message = "Hardik") //Prints, Good Morning! Hardik


    printMultiplicationTable(10)// Works fine as default argument comes last
    //greet("Hardik") // Without named parameter gives error.
}
