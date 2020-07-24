package generics.constraints

fun main() {
    val human = Mammal<Human>(Human(lifeSpan = 70, hairColour = "Black"))

    //Below is not possible because Whale is not a type of HasFurOrHair and gives compilation error
    //val whale = Mammal<Whale>(Whale(lifeSpan = 70))

    val anyHuman = AnyAnimal(Human(lifeSpan = 70, hairColour = "Black"))
    val whale = AnyAnimal(Whale(lifeSpan = 70))
    val snake = AnyAnimal(Snake(lifeSpan = 15, eggColour = "White"))
}