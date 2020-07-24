package classes.dataClasses


data class Recipe(val name: String, val ingredients: List<Ingredient>)

data class Ingredient(val ingredient: String)

fun main() {
    val friedChips = Recipe(
        name = "Fried Chips",
        ingredients = listOf(
            Ingredient("Potato"),
            Ingredient("Oil"),
            Ingredient("Salt"),
            Ingredient("Pepper")
        )
    )

    val cheeseFriedChips =
        friedChips.copy(ingredients = friedChips
            .ingredients
            .toMutableList().apply { add(Ingredient("Cheese")) })
}