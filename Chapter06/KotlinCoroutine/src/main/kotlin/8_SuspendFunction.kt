import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlin.coroutines.Continuation
import kotlin.random.Random


fun main() {
    runBlocking {
        val orderJob = CoroutineScope(IO).launch {
            val orderId = prepareOrder(listOf("Boiled vegetable Salad", "Mushroom curry", "Punjabi flat bread"))
            println("Your order has been placed, order id is $orderId")
        }
        orderJob.join()
    }
}

private suspend fun prepareOrder(orderList: List<String>): String {
    println("Placing your order for $orderList")
    delay(3000)
    return "ORDER_${Random(999999).nextInt()}"
}
