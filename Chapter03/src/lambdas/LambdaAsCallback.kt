package lambdas

fun main() {
    println("Starting long running operation")
    getData("https://something.com") {
        println("Operation completed")
    }
    println("After long running operation started")
}

fun getData(url: String, callback: () -> Unit) {
    println("Waiting to finish the long running operation")
    //Your long running operation
    val t = Thread(Runnable {
        Thread.sleep(5000) // Simulating delay
        callback.invoke()
    })
    t.start()
}