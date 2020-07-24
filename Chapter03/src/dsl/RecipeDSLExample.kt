package dsl

fun main() {
    val recipe = recipe {
        id = 52942
        recipeName = "Roast fennel and aubergine paella"
        imageUrl = "https://www.themealdb.com/images/media/meals/1520081754.jpg"
        cookingInstructions {
            instruction { instruction = "1 Put the fennel, aubergine, pepper and courgette in a roasting tray" }
            instruction { instruction = "Add a glug of olive oil, season with salt and pepper and toss around to coat the veggies in the oil." }
            instruction { instruction = "Roast in the oven for 20 minutes, turning a couple of times until the veg are pretty much cooked through and turning golden." }
            instruction { instruction = "Meanwhile, heat a paella pan or large frying pan over a low\u2013 medium heat and add a glug of olive oil. Saut\u00e9 the onion for 8\u201310 minutes until softened" }
            instruction { instruction = "Increase the heat to medium and stir in the rice, paprika and saffron." }
            instruction { instruction = "Cook for around 1 minute to start toasting the rice, then add the white wine." }
            instruction { instruction = "Reduce by about half before stirring in two-thirds of the stock." }
            instruction { instruction = "Reduce to a simmer and cook for 10 minutes without a lid, stirring a couple of times."}
            instruction { instruction = "Pour over the remaining stock, arrange the lemon wedges on top and cover with a lid or some aluminium foil." }
            instruction { instruction = "Cook for a further 10 minutes."}
        }
    }
}

fun recipe(recipe: Recipe.() -> Unit): Recipe {
    return Recipe().apply {
        recipe()
    }
}

class Recipe(
    var id: Int = 0,
    var recipeName: String = "",
    var imageUrl: String = ""
) {
    val cookingInstructions = mutableListOf<Instruction>()

    fun cookingInstructions(cookingInstructions: CookingInstructions.() -> Unit) {
        this.cookingInstructions.addAll(CookingInstructions().apply(cookingInstructions))
    }
}

data class Instruction(var instruction: String = "")

class InstructionBuilder {
    var instruction: String = ""
    fun build(): Instruction = Instruction(instruction)
}

class CookingInstructions : ArrayList<Instruction>() {
    fun instruction(instructionBuilder: InstructionBuilder.() -> Unit) {
        add(InstructionBuilder().apply(instructionBuilder).build())
    }
}
