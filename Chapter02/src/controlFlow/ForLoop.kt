package controlFlow

fun main() {
    /**
     * Standard for loop which counts from 1 to 10 using ranges
     */
    for (count in 1..10) {
        println(count)
    }

    /**
     * A loop to count from 1 to 10 using until infix function,
     * just in case range is something you don't want to use
     */
    for (count in 1 until 10) {
        println(count)
    }


    /**
     * A for loop which counts in reverse order.
     */
    for (count in 100 downTo 1) {
        println(count)
    }

    /**
     * A loop to count from 1 to 100 in increments of 5
     */
    for (count in 1..100 step 5) {
        println(count)
    }


    val intArray = intArrayOf(30, 23, 34, 652, 575, 23, 668, 237, 9893)

    /**
     * Iterating over array
     */
    for (item in intArray) {
        println(item)
    }

    /**
     * Iterating over array with index, using destructuring declaration
     */
    for ((index, value) in intArray.withIndex()) {
        println("$value at index $index")
    }

    val autoBotList = listOf("Optimus prime", "Bumble bee", "Ratchet", "Iron hide", "Jazz")

    /**
     * Iterating over list
     */
    for (autoBot in autoBotList) {
        println(autoBot)
    }

    /**
     * Iterating over list with index, using destructuring declaration
     */
    for ((index, value) in autoBotList.withIndex()) {
        println("$value at index $index")
    }

    /**
     * Iterating over list with index, in reverse order
     */
    for ((index, value) in autoBotList.asReversed().withIndex()) {
        println("$value at index $index")
    }
}