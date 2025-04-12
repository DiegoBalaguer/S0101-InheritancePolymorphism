package level01.exercice02.model;

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
        setModel(model);
        this.horsepower = setHorsepower(horsepower);
    }

    public static void setModel(String model) {
        if (model.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to model.");
        } else
            Car.model = model;
    }

    private int setHorsepower(int horsePower) {
        if (horsePower <= 0) {
            throw new IllegalArgumentException("The horsepower must be equal or greater than 1HP.");
        } else
            return horsePower;
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
