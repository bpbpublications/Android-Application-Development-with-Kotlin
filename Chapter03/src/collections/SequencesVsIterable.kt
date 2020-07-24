package collections

import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

@ExperimentalTime
fun main() {
    val iterableTimeTaken = measureTime {
        val transactionList = listOf(5, 120, 10, 73, 805, 2000, 30, 300)
            .filter { it > 100 }
            .map {
                println("Found transaction with amount $it")
                it
            }
            .take(3)
        println(transactionList)
    }
    println(iterableTimeTaken)
    val sequenceTimeTaken = measureTime {
        val transactionSequence = sequenceOf(5, 120, 10, 73, 805, 2000, 30, 300)
            .filter { it > 100 }
            .map {
                println("Found transaction with amount $it")
                it
            }
            .take(3)

        println(transactionSequence.toList())
    }
    println(sequenceTimeTaken)
}