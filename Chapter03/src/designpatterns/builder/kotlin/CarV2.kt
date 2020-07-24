package designpatterns.builder.kotlin

class CarV2 private constructor(builder: Builder) {
    private val name: String?
    private val colour: String?
    private val numberOfDoors: String?
    private val engine: String?
    private val breaks: String?
    private val transmissionType: String?
    private val fuelType: String?
    private val carType: String?

    init {
        this.name = builder.name
        this.colour = builder.colour
        this.numberOfDoors = builder.numberOfDoors
        this.engine = builder.engine
        this.breaks = builder.breaks
        this.transmissionType = builder.transmissionType
        this.fuelType = builder.fuelType
        this.carType = builder.carType
    }

    class Builder {
        internal var name: String? = null
        internal var colour: String? = null
        internal var numberOfDoors: String? = null
        internal var engine: String? = null
        internal var breaks: String? = null
        internal var transmissionType: String? = null
        internal var fuelType: String? = null
        internal var carType: String? = null

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setColour(colour: String): Builder {
            this.colour = colour
            return this
        }

        fun setNumberOfDoors(numberOfDoors: String): Builder {
            this.numberOfDoors = numberOfDoors
            return this
        }

        fun setEngine(engine: String): Builder {
            this.engine = engine
            return this
        }

        fun setBreaks(breaks: String): Builder {
            this.breaks = breaks
            return this
        }

        fun setTransmissionType(transmissionType: String): Builder {
            this.transmissionType = transmissionType
            return this
        }

        fun setFuelType(fuelType: String): Builder {
            this.fuelType = fuelType
            return this
        }

        fun setCarType(carType: String): Builder {
            this.carType = carType
            return this
        }

        fun build(): CarV2 {
            return CarV2(this)
        }
    }
}
