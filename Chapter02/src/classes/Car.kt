package classes

abstract class Car(val numberOfDoors: Int, val colour: String, val driveType: CarType) {
    val numberOfWheels: Int = 4
    open val speedLimit = 70
    var carName: String = "Default Car"
        get() = field
        set(value) {
            if (value.matches("[^A-Za-z0-9]".toRegex())) {
                field = value
            } else {
                throw IllegalArgumentException("Special characters are not allowed")
            }
        }
    val isPremiumCar: Boolean
        get() = speedLimit > 100 && (driveType == CarType.AUTOMATIC || driveType == CarType.SEMI_AUTOMATIC)

/*    var someProperty: String = "Some name"
        private set(value) {
            // Your logic
        }*/

    abstract fun blowHorn()


    init {
        println("Iteration one for making your abstract car")
    }

    init {
        println("Iteration two for making your abstract car")
    }

}