package level01.exercise02.model;

/**
 * PROGRAM: Car
 * AUTHOR: Diego Balaguer
 * DATE: 01/04/2025
 */

public class Car {
    private static final String MANUFACTURER = "Ford";
    private static String model;
    private final int horsepower;

    public Car(String model, int horsepower) {
        Car.model = model;
        this.horsepower = horsepower;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

    public static String brake() {
        return "The vehicle is under braking...";
    }

    public String accelerate() {
        return "The vehicle is accelerating...";
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + MANUFACTURER + '\'' +
                ", model=" + model +
                ", horsepower=" + horsepower +
                '}';
    }
}
