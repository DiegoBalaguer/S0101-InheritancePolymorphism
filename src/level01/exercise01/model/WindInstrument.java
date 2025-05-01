package level01.exercise01.model;

/**
 * PROGRAM: WindInstrument
 * AUTHOR: Diego Balaguer
 * DATE: 01/04/2025
 */

public class WindInstrument extends Instrument {

    public WindInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public String play() {
        return "Instrument " + super.getName() + ": a wind instrument is playing";
    }

    @Override
    public String toString() {
        return "WindInstrument{} " + super.toString();
    }
}
