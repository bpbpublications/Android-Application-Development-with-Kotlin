import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis


fun main() {
    repeat(5){
    sumWithAsync()
    sumWithoutAsync()}
}

fun sumWithoutAsync() = runBlocking {
    val totalTime = measureTimeMillis {
        val sum1 = sum(1, 250)
        val sum2 = sum(251, 500)
        val sum3 = sum(501, 750)
        val sum4 = sum(751, 1000)
        println("Sum is ${sum1 + sum2 + sum3 + sum4}")
    }
    println("Total time without coroutine: $totalTime")
}

fun sumWithAsync() = runBlocking {
    val totalTime = measureTimeMillis {
        val sum1 = async { sum(1, 250) }
        val sum2 = async { sum(251, 500) }
        val sum3 = async { sum(501, 750) }
        val sum4 = async { sum(751, 1000) }
        println("Sum is ${sum1.await() + sum2.await() + sum3.await() + sum4.await()}")
    }
    println("Total time with coroutine: $totalTime")
}

suspend fun sum(startNum: Int, endNum: Int): Int {
    delay(100)
    return (startNum..endNum).sum()
}

