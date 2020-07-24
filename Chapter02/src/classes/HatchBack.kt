package classes

// Import statement goes here

class HatchBack constructor(numberOfDoors: Int, colour: String, driveType: CarType = CarType.MANUAL) :
    Car(numberOfDoors, colour, driveType) {

    override val speedLimit = 100

    init {
        println("Making your hatchback car with $numberOfDoors doors, " +
                "$colour colour. It has $numberOfWheels wheels and is of $driveType type")
    }

    override fun blowHorn() {
        println("Peep...peep...")
    }
}