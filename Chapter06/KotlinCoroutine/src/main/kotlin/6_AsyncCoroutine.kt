import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//Please use one main function at a time and comment other one.
/**
 * Awaits for the result. Once the job is finished captures the result and process it.
 */
fun main() = runBlocking {
    val deferredResult = async {
        delay(3000L)
        "Veggie treat"
    }
    println("Your coke is ready, waiting for burger...")
    println("Here is your burger, ${deferredResult.await()}")
}

/**
 * Fire and forget type of a call. If the thread is alive the job will be keep
 */
/*fun main() = runBlocking {
    launch {
        delay(3000L)
        println("Here is your burger veggie treat.")
    }
    println("Here is your coke.")
}*/


/**
 * Just adds a simple delay and nothing else
 */
/*fun main() = runBlocking {
    delay(3000L)
    println("Here is your coke and burger veggie treat.")
}*/
