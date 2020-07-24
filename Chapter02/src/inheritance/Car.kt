package inheritance

import classes.CarType

class Car(val name: String, val numberOfDoors: Int, val colour: String) : Vehicle(name, 4) {

}


class CarV2 : Vehicle {

    constructor(name: String, numberOfDoors: Int, colour: String) : super(name, 4)

    override fun blowHorn() {
        super.blowHorn()
        println("Pom...pom...")
    }
}

class CarV3(name: String, numberOfDoors: Int, colour: String) : VehicleV2(name, 4) {
    init {
        println("Initialising CarV3")
    }

    override var makeYear: Int = 2019.also { println("Defining make year as 2019") }
}

fun main() {
    val vehicle: Vehicle = CarV2("Polo", 4, "White")
    vehicle.blowHorn()

    val vehicleV3: VehicleV2 = CarV3("Polo", 4, "White")
    println(vehicleV3.makeYear)
}