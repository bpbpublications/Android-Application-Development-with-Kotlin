import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.random.Random

class Water {
    private val hydrogen = 2
    private val oxygen = 1

    override fun toString(): String = "H$hydrogen O$oxygen"
}

class AcidicWater(val pH: Int) {
    private val hydrogen = 2
    private val oxygen = 1
    override fun toString(): String = "H$hydrogen O$oxygen pH=$pH"
}

fun flowingRiver(): Flow<Water> = flow {
    while (true) {
        delay(100)
        emit(Water())
    }
}

fun pollutionByWeThePeople() = AcidicWater(Random.nextInt(1, 10))

fun getIngredients(): Flow<String> = flow {
    emit("Aubergine")
    emit("Onion")
    emit("Tomatoes")
    emit("Garlic")
    emit("Green Chili")
    emit("Red Chili Powder")
    emit("Oil")
    emit("Coriander Leaves")
    emit("Salt")
}

fun getUnitValues(): Flow<String> = flow {
    emit("1 large")
    emit("1/2 cup")
    emit("1 cup")
    emit("6 cloves")
    emit("1")
    emit("1/4 teaspoon")
    emit("1.5 tablespoon")
    emit("1 tablespoon chopped")
    emit("as required")
}

fun getNumber(): Flow<String> = flow {
    emit("1"); delay(500)
    emit("2"); delay(500)
    emit("3"); delay(500)
}

fun getAlphabets(): Flow<String> = flow {
    emit("A"); delay(700)
    emit("B"); delay(700)
    emit("C"); delay(700)
}

fun getAlphabetsLower(): Flow<String> = flow {
    emit("a"); delay(1000)
    emit("b"); delay(1000)
    emit("c"); delay(1000)
}