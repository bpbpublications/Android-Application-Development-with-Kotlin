package delegatedProperty

import kotlin.properties.Delegates

class Recipe {
    var name by Delegates.observable("<no name>") { prop, old, new ->
        println("$old -> $new")
    }

    var ingredients: List<String> by Delegates.observable(listOf("Salt")) { prop, old, new ->
        println("$old -> $new")
    }
}

class Person {
    var name by Delegates.vetoable("Unnamed") { prop, old, new ->
        if (new.matches("^[a-zA-Z]*$".toRegex())) true else throw Exception("Name can only contain alphabets")
    }

    var age by Delegates.vetoable(0) { prop, old, new ->
        new >= 0
    }
}


data class Car(val carMap: Map<String, Any>) {
    val name: String by carMap
    val manufacturer: String by carMap
    val noOfDoors: Int by carMap
    val otherSpecs: List<String> by carMap
    val some: List<String>? by carMap

}

fun main() {
    val recipe = Recipe()

    recipe.name = "French fries"
    recipe.ingredients = listOf("Potato", "Oil", "Salt", "Pepper")


    val person = Person()
    person.age = 18
    println(person.age) // Prints 18
    person.age = -10
    println(person.age) // Also prints 18


    person.name = "Hardik"
    println(person.name) // Prints Hardik
    //person.name = "Hard!k" // Throws Exception as there is special character which is not valid.
    println(person.name)


    val carMap = mapOf(
        "name" to "Mustang GT",
        "manufacturer" to "Ford",
        "colour" to "Black",
        "noOfDoors" to 2,
        "otherSpecs" to listOf("Power 285 - 312 bhp", "0-60 mph 0 - 5.6 Secs", "Fuel Economy 28 - 35 mpg")
    )

    val car = Car(carMap)
    println(car.toString())
}

/*
Output
<no name> -> French fries
[Salt] -> [Potato, Oil, Salt, Pepper]*/
