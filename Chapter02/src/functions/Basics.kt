package functions

fun main() {
    println(calculateStrikeRate(runs = 100, ballsFaced = 86))
}


fun calculateStrikeRate(runs: Int, ballsFaced: Int): Float {
    return (runs.toFloat() / ballsFaced) * 100
}

fun displayIngredients(ingredients: List<String>): Unit {

}

fun finish() {
    // Destroy the Activity
}