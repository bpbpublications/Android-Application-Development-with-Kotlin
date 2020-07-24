package collections

fun main() {
    val worldRecipes = mutableListOf(
        Recipe("Jerk Chicken", 60),
        Recipe("Paella", 30),
        Recipe("Frito Mist", 50),
        Recipe("Hamburger", 20)
    )

    println(worldRecipes)
    val reversedWordRecipes = worldRecipes.asReversed()
    println("Reversed world recipes")
    println(reversedWordRecipes)

    // This only works if [worldRecipes] is mutable
    worldRecipes.add(Recipe("Hakka noodle",15))

    println("Reversed world recipes after updating master list")
    println(reversedWordRecipes)
}

/** Output
[Recipe(name=Jerk Chicken, cookingTimeInMinutes=60), Recipe(name=Paella, cookingTimeInMinutes=30), Recipe(name=Frito Mist, cookingTimeInMinutes=50), Recipe(name=Hamburger, cookingTimeInMinutes=20), Recipe(name=Masala dosa, cookingTimeInMinutes=5), Recipe(name=Potato chips, cookingTimeInMinutes=5), Recipe(name=French Toast, cookingTimeInMinutes=8)]
Reversed world recipes
[Recipe(name=French Toast, cookingTimeInMinutes=8), Recipe(name=Potato chips, cookingTimeInMinutes=5), Recipe(name=Masala dosa, cookingTimeInMinutes=5), Recipe(name=Hamburger, cookingTimeInMinutes=20), Recipe(name=Frito Mist, cookingTimeInMinutes=50), Recipe(name=Paella, cookingTimeInMinutes=30), Recipe(name=Jerk Chicken, cookingTimeInMinutes=60)]
Reversed world recipes after updating master list
[Recipe(name=Hakka noodle, cookingTimeInMinutes=15), Recipe(name=French Toast, cookingTimeInMinutes=8), Recipe(name=Potato chips, cookingTimeInMinutes=5), Recipe(name=Masala dosa, cookingTimeInMinutes=5), Recipe(name=Hamburger, cookingTimeInMinutes=20), Recipe(name=Frito Mist, cookingTimeInMinutes=50), Recipe(name=Paella, cookingTimeInMinutes=30), Recipe(name=Jerk Chicken, cookingTimeInMinutes=60)]
 **/