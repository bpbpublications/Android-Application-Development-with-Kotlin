import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {
    val job = launch {
        flowingRiver().collect { value -> println("Drop of $value") }
    }
    delay(3000)
    job.cancel()
}