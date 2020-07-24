import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.Default
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.random.Random
import kotlin.system.exitProcess



fun main() = runBlocking {
    val orderJob = launch(Default) {
        while(isActive){
            println("Placing your order for ${listOf("Boiled vegetable Salad", "Mushroom curry", "Punjabi flat bread")}")
            println("Your order has been placed, order id is ORDER_${Random(999999).nextInt()}")
        }
    }
    delay(5000)
    orderJob.cancelAndJoin()
    println("Job is cancelled")
    delay(2000)
}



/*fun main() = runBlocking {
    val startTime = System.currentTimeMillis()
    val job = launch(Dispatchers.Default) {
        var nextPrintTime = startTime
        var i = 0
        while (i < 5) { // computation loop, just wastes CPU
            // print a message twice a second
            if (System.currentTimeMillis() >= nextPrintTime) {
                println("job: I'm sleeping ${i++} ...")
                nextPrintTime += 500L
            }
        }
    }
    delay(1300L) // delay a bit
    println("main: I'm tired of waiting!")
    job.cancelAndJoin() // cancels the job and waits for its completion
    println("main: Now I can quit.")
}*/