import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.Default
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.system.exitProcess

/**
 * Creating simple coroutine using GlobalScope and try to observe the name
 */
//Please use one main function at a time and comment other one.
fun main() {
    println("Thread : ${Thread.currentThread().name} Received an order to prepare burger and diet coke.")
    GlobalScope.launch {
        delay(2000)
        println("Thread : ${Thread.currentThread().name} Preparing coke")
    }
    GlobalScope.launch {
        delay(3000)
        println("Thread : ${Thread.currentThread().name} Preparing burger")
    }
    println("Thread : ${Thread.currentThread().name} Next order please!")
    Thread.currentThread().join()
}


/**
 * Creating simple coroutine using CoroutineScope and try to observe the name
 */
/*
fun main() {
    println("Thread :3_StartingAJob.kt ${Thread.currentThread().name} Received an order to prepare burger and diet coke.")
    CoroutineScope(Default).launch {
        delay(2000)
        println("Thread : ${Thread.currentThread().name} Preparing coke")
    }
    CoroutineScope(Default).launch {
        delay(3000)
        println("Thread : ${Thread.currentThread().name} Preparing burger")
    }
    println("Thread : ${Thread.currentThread().name} Next order please!")
    Thread.currentThread().join()
}*/