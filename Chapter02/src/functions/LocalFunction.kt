package functions


fun showCareer(runsScored: IntArray, ballsFaced: IntArray) {
    val totalRuns = runsScored.sum()
    val totalBallsFaced = ballsFaced.sum()

    fun calculateAverage(): Float = totalRuns.toFloat() / runsScored.size

    fun calculateStrikeRate(): Float = (totalRuns.toFloat() / totalBallsFaced) * 100

    fun calculateFifties() = runsScored.filter { it in 50..99 }.count()

    fun calculateCenturies() = runsScored.filter { it >= 100 }.count()

    println("Total runs $totalRuns")
    println("Total balls faced $totalBallsFaced")
    println("Average ${calculateAverage()}")
    println("Strike Rate : ${calculateStrikeRate()}")
    println("Fifties scored: ${calculateFifties()}, Centuries made: ${calculateCenturies()}")
}

fun main() {
    showCareer(
        runsScored = intArrayOf(10, 55, 120, 67, 0),
        ballsFaced = intArrayOf(5, 60, 70, 62, 10)
    )
}
