package visibilityModifiers.packageOne

enum class Type {
    ROAD, AIR, WATER
}

open class Vehicle(name: String, wheels: Int) {
    protected open val type = Type.ROAD
}