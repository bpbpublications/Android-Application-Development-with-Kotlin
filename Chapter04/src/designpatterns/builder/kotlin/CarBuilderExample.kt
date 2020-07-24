package designpatterns.builder.kotlin

fun main() {
    val car = CarV1(name = "Polo", colour = "White", breaks = "ABS", carType = "Hatchback")
    val petrolCar = CarV1(name = "Polo", colour = "White", breaks = "ABS", carType = "Hatchback", fuelType = "Petrol")
}