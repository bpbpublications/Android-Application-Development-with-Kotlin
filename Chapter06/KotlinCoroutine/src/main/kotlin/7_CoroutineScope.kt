import kotlinx.coroutines.*

fun main() = runBlocking {
    repeat(100_000) { // launch a lot of coroutines
        launch {
            delay(3000L)
            println("Preparing order $it")
        }
    }
}