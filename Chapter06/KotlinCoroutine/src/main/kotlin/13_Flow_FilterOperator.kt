import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {
    val job = launch {
        flowingRiver()
            .map { pollutionByWeThePeople() }
            .filter { it.pH >= 7 }
            .collect { value -> println("Drop of drinkable water $value") }
    }
    delay(3000)
    job.cancel()
}
