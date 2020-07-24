import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {
    //flowingRiver().collect { value -> println("Drop of $value") }
    flowE().collect { value -> println("Drop of $value") }
}

fun flowE(): Flow<String> = flowOf(listOf(1, 2, 3, 4, 5)).map { it.toString() }
