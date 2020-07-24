package controlFlow

fun main() {
    // Simple while loop
    var num = 1
    while (num <= 10) {
        println(num)
        num--
    }

    // Do while loop
    do {
        val data = getData()
        println(data)
    } while (data != null)
}

fun getData(): String? {
    return ""
}
