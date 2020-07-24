package generics.typeSafety

fun main() {
    val anyList = mutableListOf<Any>(frenchFries, lassi, pasta)
    val recipeList = mutableListOf<Recipe>(frenchFries, lassi, pasta)

    println((anyList.firstOrNull() as? Recipe)?.name)

    println((recipeList.firstOrNull())?.name)


    anyList.add("WTF") // Can be done. Compiler will not complain

    //recipeList.add("WTF") // Gives you compilation error.

    recipeList.add(veggieChilly) // Possible because it's a recipe instance
}