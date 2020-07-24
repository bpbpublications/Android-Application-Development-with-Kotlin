package Strings

fun main() {
    val book1 = "Android application development with Kotlin"

    val book2 = "Android application development with Kotlin"

    val book3 = "Kotlin Blueprints"

    println(book1 == book2)// Returns true

    println(book1 == book3)// Returns false

    println(book1 === book2)// Returns true

    val friedChips = getFriedChips()
    println(friedChips)
    val frenchFries = getFriedChips()

    val (name, ingredients) = Recipe(
        name = "Fried Chips",
        ingredients = listOf(
            Ingredient("Potato"),
            Ingredient("Oil"),
            Ingredient("Salt"),
            Ingredient("Pepper")
        )
    )

    println(friedChips == frenchFries)// Returns true
    println(friedChips === frenchFries)// Returns false

    println("=======================")
    println(Float.NaN == Float.NaN) //Returns false
    println(Float.NaN.equals(Float.NaN)) //Returns true

    println(0F == -0F) //Returns true
    println(0F === -0F) //Returns true
    println(0F.equals(-0F)) //Returns false


    println("Android Application Development with Kotlin\n")
    println("A practical guide to learn Kotlin for Android\n\t\tAuthor by:Hardik Trivedi")
    println("Price : \$10")


}

private fun getFriedChips(): Recipe {
    return Recipe(
        name = "Fried Chips",
        ingredients = listOf(
            Ingredient("Potato"),
            Ingredient("Oil"),
            Ingredient("Salt"),
            Ingredient("Pepper")
        )
    )
}


data class Recipe(val name: String, val ingredients: List<Ingredient>)

data class Ingredient(val ingredient: String)