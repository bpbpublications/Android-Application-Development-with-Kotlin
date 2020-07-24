package collections

data class Recipe(val name: String, val cookingTimeInMins: Int)

fun main() {
    val worldRecipes = listOf(
        Recipe("Jerk Chicken", 60),
        Recipe("Paella", 30),
        Recipe("Masala dosa", 5),
        Recipe("French Toast", 8)
    )
    // Returns sorted immutable list
    println(worldRecipes.sortedBy { it.cookingTimeInMins })

    val recipeComparator =
        Comparator<Recipe> { recipe1, recipe2 -> recipe1.cookingTimeInMins - recipe2.cookingTimeInMins }
    // Returns sorted immutable list using custom comparator
    println(worldRecipes.sortedWith(recipeComparator))
}
/** Both println prints
[Recipe(name=Masala dosa, cookingTimeInMins=5), Recipe(name=French Toast, cookingTimeInMins=8), Recipe(name=Paella, cookingTimeInMins=30), Recipe(name=Jerk Chicken, cookingTimeInMins=60)]
*/