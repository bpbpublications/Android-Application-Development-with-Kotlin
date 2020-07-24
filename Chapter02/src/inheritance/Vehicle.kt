package inheritance

open class Vehicle(name: String, wheels: Int) {

    open fun blowHorn() {
        println("Peep...peep...")
    }
}

open class VehicleV2(name: String, wheels: Int) {
    init {
        println("Initialising VehicleV2")
    }

    open val makeYear = 2000.also { println("Defining make year as 2000") }
}