import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    numbers()
        .catch { e -> println("exception caught ${e.message}") }
        .collect {
            println(it)
        }
}

suspend fun numbers(): Flow<Int> {
    return (1..100).asFlow()
        .onEach {
            delay(100)
            if (it == 5) {
                throw Exception()
            }
        }
        .catch { throw Exception("internet not available") }
        .map { it*2 }
}