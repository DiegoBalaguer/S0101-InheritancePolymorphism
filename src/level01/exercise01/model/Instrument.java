package level01.exercise01.model;

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
        this.name = name;
        this.price = price;
        Instrument.counter++;
        this.position = Instrument.counter;
    }

    static {
        System.out.println("Inside class Instrument " + counter);
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
