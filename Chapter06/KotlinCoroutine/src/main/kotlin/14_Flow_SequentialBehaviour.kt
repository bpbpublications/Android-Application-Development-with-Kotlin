import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    val timeTaken = measureTimeMillis {
        getThreeIngredients().collect {
            println(it)
            delay(1000)
        }
    }
    println("Total time $timeTaken")
}

fun getThreeIngredients(): Flow<String> = flow {
    delay(1000)
    emit("Salt")
    delay(1000)
    emit("Pepper")
    delay(1000)
    emit("Potato")
}