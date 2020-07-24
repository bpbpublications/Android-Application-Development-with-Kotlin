import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val damCapacity = 50;
    var waterLevel = 0

    flowingRiver()
        .onStart {
            println("River flowing")
        }
        .onEach {
            check(waterLevel <= damCapacity) { "Dam capacity reached" }
            println("Water level ${waterLevel++}")
        }
        .onCompletion { cause ->
            cause?.let { println("The dam became full") } ?: println("River is empty but the dam is not full")
        }
        .catch { e -> println("!!! ALERT !!! : ${e.message}") }
        .collect()
}
