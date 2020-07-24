package lambdas

import java.util.*

//val sayHello = { println("Hello Kotlin") }

// With no parameter and no return type
val sayHello: () -> Unit = { println("Hello Kotlin") }

val calculateAverage = { data: Array<Int> ->
    data.sum() / data.size
}

// Function with no parameter but returns Long
//val getCurrentTime: () -> Long = { Date().time }

// Same getCurrentTime function but with lateinit specifier
lateinit var getCurrentTime: () -> Long


/*val calculateAverage: (Array<Int>) -> Int = { data ->
    data.sum() / data.size
}*/

/*fun main() {
    sayHello()

    sayHello.invoke()
}*/

val isEmail: String.() -> Boolean = {
    this.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$".toRegex())
}

fun main() {

    // Defining implementation of lateinit getCurrentTime
    getCurrentTime = { Date().time }

    println(calculateAverage(arrayOf(10, 20, 30, 40, 50)))
    println(calculateAverage.invoke(arrayOf(10, 20, 30, 40, 50)))


    println(getCurrentTime())
}