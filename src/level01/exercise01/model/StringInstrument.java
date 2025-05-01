package level01.exercise01.model;

/**
 * PROGRAM: StringInstrument
 * AUTHOR: Diego Balaguer
 * DATE: 01/04/2025
 */

public class StringInstrument extends Instrument {

    public StringInstrument(String name, double price) {

        super(name, price);
    }

    @Override
    public String play() {

        return "Instrument " + super.getName() + ": a string instrument is playing";
    }

    @Override
    public String toString() {
        return "StringInstrument{} " + super.toString();
    }
}