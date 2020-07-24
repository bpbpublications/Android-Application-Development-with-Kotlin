import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val damCapacity = 50 ; var waterLevel = 0
    try {
        flowingRiver().collect {
            check(waterLevel <= damCapacity) { "Dam capacity reached" }
            println("Water level ${waterLevel++}")
        }
    } catch (e: Exception) {
        println("!!! ALERT !!! : ${e.message}")
    } finally {
        println("Water level logged and action taken")
    }
}

//With throw
/*fun main() = runBlocking {
    val damCapacity = 50
    var waterLevel = 0
    try {
        flowingRiver().collect {
            if (waterLevel >= damCapacity) {
                throw IllegalStateException("Dam capacity reached")
            }
            println("Water level ${waterLevel++}")
        }
    } catch (e: Exception) {
        println("!!! ALERT !!! : ${e.message}")
    } finally {
        println("Water level logged and action taken")
    }

}*/