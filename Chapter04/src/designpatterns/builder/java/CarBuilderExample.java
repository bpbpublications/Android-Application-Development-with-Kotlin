package designpatterns.builder.java;

public class CarBuilderExample {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .setName("Polo")
                .setColour("White")
                .setNumberOfDoors("4")
                .setTransmissionType("Automatic")
                .setFuelType("Petrol")
                .setCarType("Hatchback")
                .setEngine("1.2-litre TSI Petrol")
                .build();
    }
}
