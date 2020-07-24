import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {
    val job = launch {
        getUnitValues()
            .zip(getIngredients()) { unit, ingredient ->
                "$unit $ingredient"
            }
            .collect { println(it) }
    }
    job.join()
}
