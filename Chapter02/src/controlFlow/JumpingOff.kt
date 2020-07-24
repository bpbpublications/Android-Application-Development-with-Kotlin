package controlFlow

fun main() {
    addPositive(10, 20)
    addPositive(-10, 10)


    /**
     * Terminates the loop completely and jumps to the given label
     */
    brk@ for (i in 1..5) {
        for (j in 1..5) {
            if (i == 2 && j == 2) {
                break@brk
            }
            println("i=$i and j=$j")
        }
    }

    /**
     * Skips just an iteration and jumps to the given label
     */
    cntnu@ for (i in 1..5) {
        for (j in 1..5) {
            if (i == 2 && j == 2) {
                continue@cntnu
            }
            println("i=$i and j=$j")
        }
    }

    println("Out of all loops")
}

fun addPositive(num1: Int, num2: Int) {
    if (num1 < 0 || num2 < 0)
        return
    println(num1 + num2)
}