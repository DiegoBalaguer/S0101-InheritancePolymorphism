package level01.exercice01.model;

/**
 * PROGRAM: Instrument
 * AUTHOR: Diego Balaguer
 * DATE: 01/04/2025
 */

public abstract class Instrument {

    private String name;
    private double price;
    private int position;
    private static int counter = 0;

    public Instrument(String name, double price) {
        setName(name);
        setPrice(price);
        setPosition();
    }

    static {
        System.out.println("Inside class Instrument " + counter);
    }

    private void setName(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to name.");
        } else
            this.name = name;
    }

    private void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("The base price must be equal or greater than 1€.");
        } else
            this.price = price;
    }

    private void setPosition() {
        Instrument.counter++;
        this.position = Instrument.counter;
    }

    public String getName() {
        return name;
    }

    public static String getCounter() {
        return "Counter value: " + counter;
    }

    public abstract String play();

    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", position=" + position +
                '}';
    }
}
