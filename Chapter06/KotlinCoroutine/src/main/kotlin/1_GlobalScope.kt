import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Creating simple coroutine using GlobalScope.launch function
 */
fun main() {
    println("Received an order to prepare burger and diet coke.")
    GlobalScope.launch {
        delay(2000)
        println("Preparing coke")
    }
    GlobalScope.launch {
        delay(3000)
        println("Preparing burger")
    }
    println("Next order please!")
    Thread.currentThread().join()
}