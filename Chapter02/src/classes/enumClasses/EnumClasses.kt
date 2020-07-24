package classes.enumClasses

enum class CarType {
    MANUAL, SEMI_AUTOMATIC, AUTOMATIC
}

enum class CarTypeV2(val type: Int) {
    MANUAL(1), SEMI_AUTOMATIC(2), AUTOMATIC(3)
}

enum class Numbers(val num: String) {
    ONE("1") {
        override fun inRoman(): String = "I"

        override fun inSpanish(): String = "uno"
    },
    TWO("2") {
        override fun inRoman(): String = "II"

        override fun inSpanish(): String = "dos"
    },
    THREE("3") {
        override fun inRoman(): String = "III"

        override fun inSpanish(): String = "tres"
    };

    abstract fun inRoman(): String
    abstract fun inSpanish(): String
}

fun getCarType(typeCode: Int) {
    when (typeCode) {
        CarTypeV2.MANUAL.type -> {
            println("Car has manual handling")
            println("Ordinal ${CarTypeV2.MANUAL.ordinal}")
        }
        CarTypeV2.SEMI_AUTOMATIC.type -> {
            println("Car has semi automatic handling")
            println("Ordinal ${CarTypeV2.SEMI_AUTOMATIC.ordinal}")
        }
        CarTypeV2.AUTOMATIC.type -> {
            println("Car has fully automatic handling")
            println("Ordinal ${CarTypeV2.AUTOMATIC.ordinal}")
        }
    }
}

fun main() {
    println(Numbers.ONE.num)
    println(Numbers.ONE.inRoman())
    println(Numbers.ONE.inSpanish())
}