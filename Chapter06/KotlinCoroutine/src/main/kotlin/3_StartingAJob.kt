import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.Default
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.random.Random
import kotlin.system.exitProcess


fun main() {
    runBlocking {
        val orderJob = CoroutineScope(IO).launch {
            println("Placing your order for ${listOf("Boiled vegetable Salad", "Mushroom curry", "Punjabi flat bread")}")
            delay(3000)
            val orderId = "ORDER_${Random(999999).nextInt()}"
            println("Your order has been placed, order id is $orderId")
        }
        orderJob.join()
    }
}
