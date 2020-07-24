package functions

fun main() {
    val runs = 100
    val ballsFaced = 86

    // There is no compiler error, causes blunder
    println(calculateStrikeRate(ballsFaced, runs)) //Results 86

    // Kotlin will make your system safe
    println(calculateStrikeRate(ballsFaced = ballsFaced, runs = runs)) //Results 116.27

    // Allowed if position based arguments are ahead of named arguments
    println(calculateStrikeRate(runs, ballsFaced=ballsFaced))

    // Named arguments ahead of position based arguments are not allowed and results into error
    //println(calculateStrikeRate(runs=runs, ballsFaced))
}