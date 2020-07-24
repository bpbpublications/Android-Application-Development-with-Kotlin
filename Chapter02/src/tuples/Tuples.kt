package tuples

fun main() {
    val career = showCareer(
        runsScored = intArrayOf(10, 55, 120, 67, 0),
        ballsFaced = intArrayOf(5, 60, 70, 62, 10)
    )
    println(" Total 50/100 : ${career.first}/${career.second}")

    /**
     * Extension function Pair<T, T>.toList(): List<T>
     * prints List of centuries [2, 1]
     */
    println("List of centuries ${career.toList()}")

    val triple = Triple(first = "Hardik", second = 32, third = listOf("Ahmedabad", "Pune", "London"))
    println("${triple.first} ${triple.second} ${triple.third}")

    /**
     * Extension function Triple<T, T, T>.toList(): List<T>
     * prints List triple data [Hardik, 32, [Ahmedabad, Pune, London]]
     */
    println("List triple data ${triple.toList()}")
}


fun showCareer(runsScored: IntArray, ballsFaced: IntArray): Pair<Int, Int> {
    val fifties = runsScored.filter { it in 50..99 }.count()
    val centuries = runsScored.filter { it >= 100 }.count()

    return Pair(first = fifties, second = centuries)
}