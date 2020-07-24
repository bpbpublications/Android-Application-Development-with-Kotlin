package generics.typeProjection

import generics.typeSafety.Recipe
import generics.typeSafety.frenchFries
import generics.typeSafety.lassi
import generics.typeSafety.veggieChilly

fun main() {
    val allRecipeBook = RecipeBook<Recipe>().apply {
        put(frenchFries)
        put(lassi)
    }

    val latestRecipes = RecipeBook<Recipe>().apply {
        put(veggieChilly)
    }

    copyLatestRecipeIntoAllRecipes(allRecipeBook, latestRecipes)
}

fun <T> copyLatestRecipeIntoAllRecipes(allRecipeBook: RecipeBook<in T>, latestRecipes: RecipeBook<out T>) {
    latestRecipes.getAll().forEach {
        allRecipeBook.put(it)
    }

    // Won't compile because you're trying to read value from <in T>
    //val list: List<T> = allRecipeBook.getAll()

    // Won't compile because you're trying to put value from <put T>
    //latestRecipes.put(frenchFries)
}