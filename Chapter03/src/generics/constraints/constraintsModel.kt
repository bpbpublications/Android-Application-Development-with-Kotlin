package generics.constraints

interface Animal {
     val lifeSpan: Int
}

interface Oviparous : Animal {
    val eggColour: String
}

interface HasFurOrHair {
    val hairColour: String
}

interface Limbless

class Mammal<T>(private val mammal: T) where T : Animal, T : HasFurOrHair {
    fun aboutMe() {
        println("""I am a mammal with life span of ${mammal.lifeSpan} 
|                  and my hair colour is ${mammal.hairColour}""".trimMargin())
    }
}

class Reptile<T>(private val reptile: T) where T : Oviparous {
    fun aboutMe() {
        println("""I am a reptile with life span of ${reptile.lifeSpan} 
|                  and my egg colour is  ${reptile.eggColour}""".trimMargin())
    }
}

/*// Or

class Reptile<T:Oviparous>(private val reptile: T){
    fun aboutMe() {
        println("""I am a reptile with life span of ${reptile.lifeSpan} 
|                  and my egg colour is  ${reptile.eggColour}""".trimMargin())
    }
}*/

class Human(override val lifeSpan: Int, override val hairColour: String) : Animal, HasFurOrHair

class Whale(override val lifeSpan: Int) : Animal, Limbless

class Snake(override val lifeSpan: Int, override val eggColour: String) : Oviparous, Limbless

class AnyAnimal<T : Animal>(private val animal: T) {
    fun aboutMe() {
        println("I am an animal and I can live up to ${animal.lifeSpan}")
    }
}


