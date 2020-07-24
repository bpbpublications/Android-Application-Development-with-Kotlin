package LateOrLazy

import Strings.Recipe

lateinit var recipe: Recipe

lateinit var recipe1: () -> Recipe

fun main() {
    if (::recipe.isInitialized) {
        println("To cook ${recipe.name} you need ${recipe.ingredients} as ingredients")
    }
    /*recipe1 = {
        Recipe("Hello", listOf())
    }*/

    println(recipe1().name)
}