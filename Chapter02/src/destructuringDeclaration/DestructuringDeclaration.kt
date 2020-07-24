package destructuringDeclaration

import Strings.Ingredient
import Strings.Recipe
import tuples.showCareer



fun main() {
    //Destructuring Pair object which consist two Integer
    val (fifties, centuries) = showCareer(
        runsScored = intArrayOf(10, 55, 120, 67, 0),
        ballsFaced = intArrayOf(5, 60, 70, 62, 10)
    )

    println(" Total 50/100 : $fifties/$centuries")

    //Destructuring Recipe object which consist String and List
    val (name, ingredients) = getRoastPotatoesRecipe()

    println("To cook $name you need $ingredients as ingredients")

    // Iterating over map using for loop and destructuring declaration
    for ((dayOfWeek, nameOfDay) in getDaysOfWeek()) {
        println("$dayOfWeek $nameOfDay")
    }
}

fun getRoastPotatoesRecipe(): Recipe {
    return Recipe(
        "Roast Potatoes",
        listOf(
            Ingredient("Potatoes"), Ingredient("Black Pepper"),
            Ingredient("Olive oil"), Ingredient("Salt")
        )
    )
}

fun getDaysOfWeek(): Map<Int, String> {
    return mapOf(
        1 to "Sunday",
        2 to "Monday",
        3 to "Tuesday",
        4 to "Wednesday",
        5 to "Thursday",
        6 to "Friday",
        7 to "Saturday"
    )
}