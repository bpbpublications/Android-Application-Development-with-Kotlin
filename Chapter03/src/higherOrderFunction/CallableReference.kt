package higherOrderFunction

val bots = listOf(
    "Optimus Prime", "Ratchet",
    "Fallen", "Bumblebee", "Megatron", "Starscream", "Ironhide",
    "Barricade", "Demolisher"
)

val autoBots = listOf(
    "Optimus Prime", "Roadbuster", "Ratchet",
    "Bumblebee", "Ironhide"
)

fun main() {
    println(bots.filter { isAutoBot(it) })

    println(bots.filter(::isAutoBot))

    val recipes = listOf(
        Recipe(
            name = "Fried Chips",
            ingredients = listOf("Potato", "Oil", "Salt", "Pepper"),
            prepTime = 40
        ),
        Recipe(
            name = "Eggplant Salad",
            ingredients = listOf("Eggplant", "Tomato", "Onion", "Salt", "Pepper", "Oregano", "Parsley"),
            prepTime = 30
        )
    )

    println(recipes.minBy(Recipe::prepTime))

    println(recipes.minBy { it.prepTime })
}

fun isAutoBot(bot: String) = autoBots.contains(bot)

data class Recipe(val name: String, val ingredients: List<String>, val prepTime: Int)