import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {
    val job = launch {
        getUnitValues().onEach { delay(100) }
            .combine(getIngredients().onEach { delay(1000) }) { unit, ingredient ->
                "$unit $ingredient"
            }
            .collect { println(it) }
    }
    job.join()
}
