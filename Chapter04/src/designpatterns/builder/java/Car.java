package designpatterns.builder.java;

public class Car {
    private String name;
    private String colour;
    private String numberOfDoors;
    private String engine;
    private String breaks;
    private String transmissionType;
    private String fuelType;
    private String carType;

    private Car(Builder builder) {
        this.name = builder.name;
        this.colour = builder.colour;
        this.numberOfDoors = builder.numberOfDoors;
        this.engine = builder.engine;
        this.breaks = builder.breaks;
        this.transmissionType = builder.transmissionType;
        this.fuelType = builder.fuelType;
        this.carType = builder.carType;
    }

    public static class Builder {
        private String name;
        private String colour;
        private String numberOfDoors;
        private String engine;
        private String breaks;
        private String transmissionType;
        private String fuelType;
        private String carType;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public Builder setNumberOfDoors(String numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
            return this;
        }

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setBreaks(String breaks) {
            this.breaks = breaks;
            return this;
        }

        public Builder setTransmissionType(String transmissionType) {
            this.transmissionType = transmissionType;
            return this;
        }

        public Builder setFuelType(String fuelType) {
            this.fuelType = fuelType;
            return this;
        }

        public Builder setCarType(String carType) {
            this.carType = carType;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
