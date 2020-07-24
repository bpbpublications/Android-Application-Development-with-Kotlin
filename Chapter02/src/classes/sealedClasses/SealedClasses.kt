package classes.sealedClasses


sealed class CarType {
    data class Manual(val num: Int) : CarType()
    data class SemiAutomatic(val num: Int) : CarType()
    data class Automatic(val num: Int) : CarType()
    data class DualClutch(val num: Int) : CarType()
}

fun getCarType(carType: CarType) = when (carType) {
        is CarType.Manual -> println("Car has manual handling")
        is CarType.DualClutch -> println("Car has dual clutch handling")
        is CarType.SemiAutomatic -> println("Car has semi automatic handling")
        is CarType.Automatic -> println("Car has fully automatic handling")
    }
