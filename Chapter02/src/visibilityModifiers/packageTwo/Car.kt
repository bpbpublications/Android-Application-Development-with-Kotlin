package visibilityModifiers.packageTwo

import visibilityModifiers.packageOne.Type
import visibilityModifiers.packageOne.Vehicle


class Aeroplane(val name: String, val numberOfDoors: Int, val colour: String) : Vehicle(name, 3) {
    override val type = Type.AIR
}

fun main() {
    val vehicle = Vehicle("SomethingMoving", 4)
    // Gives you compilation error
    //println(vehicle.type)
}