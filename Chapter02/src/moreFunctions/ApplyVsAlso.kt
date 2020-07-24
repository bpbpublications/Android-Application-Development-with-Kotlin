package moreFunctions

fun main() {
    numberIncrementerApply()
    numberIncrementerAlso()
}

//Increment number using apply function
fun numberIncrementerApply() {
    val incrementedNumber = Number(10).apply {
        inc()
        inc()
        inc()
    }
    incrementedNumber.printNumber()
}

//Increment number using also function
fun numberIncrementerAlso() {
    val incrementedNumber = Number(10).also {
        it.inc()
        it.inc()
        it.inc()
    }
    incrementedNumber.printNumber()
}

class Number(private var num: Int) {
    fun inc() {
        num++
    }

    fun printNumber() {
        println(num)
    }
}