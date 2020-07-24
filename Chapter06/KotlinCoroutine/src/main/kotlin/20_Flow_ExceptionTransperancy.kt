import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking

/*fun main() = runBlocking {
    val damCapacity = 50; var waterLevel = 0

    flowingRiver()
        .onEach {
            check(waterLevel <= damCapacity) { "Dam capacity reached" }
        }
        .catch { e -> println("!!! ALERT !!! : ${e.message}") }
        .collect {
            println("Water level ${waterLevel++}")
        }
}*/

fun main() = runBlocking {
    val damCapacity = 50
    val damWarningLevel = 40
    var waterLevel = 0

    flowingRiver()
        .onEach {
            check(waterLevel <= damWarningLevel) { "Water is higher than warning level" }
        }
        .catch { e -> println("!!! ALERT !!! : ${e.message}") }
        .onEach {
            check(waterLevel <= damCapacity) { "Dam capacity reached" }
        }
        .catch { e -> println("!!! HIGH ALERT !!! : ${e.message}") }
        .collect {
            println("Water level ${waterLevel++}")
        }
}