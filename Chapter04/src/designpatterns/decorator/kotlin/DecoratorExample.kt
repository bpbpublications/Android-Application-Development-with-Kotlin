package designpatterns.decorator.kotlin

interface Recipe {
    fun cook()
}

class Sandwich : Recipe {
    override fun cook() {
        println("Preparing sandwich")
    }
}

class CheeseDecorator(val recipe: Recipe) : Recipe by recipe {
    override fun cook() {
        recipe.cook()
        garnish()
    }

    private fun garnish() {
        println("Keep calm and shred cheese...")
    }
}


fun main() {
    val sandwich = Sandwich().apply { cook() }
    val cheeseSandwich = CheeseDecorator(sandwich).apply { cook() }
}