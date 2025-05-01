package level01.exercise01.application;

import level01.exercise01.model.*;

import java.util.ArrayList;

/**
 * PROGRAM: ApplicationWorkers
 * AUTHOR: Diego Balaguer
 * DATE: 01/04/2025
 */

public class ApplicationWorkers {

    private static ArrayList<Instrument> instruments;

    public ApplicationWorkers() {
        instruments = new ArrayList<>();
    }

    public void loadInstruments() {

        System.out.println(System.lineSeparator() + "LOAD LIST OF INSTRUMENTS" + System.lineSeparator());

        PercussionInstrument drum = new PercussionInstrument("Drum", 2798.98);
        instruments.add(drum);
        PercussionInstrument xylophone = new PercussionInstrument("Xylophone", 2798.98);
        instruments.add(xylophone);

        StringInstrument guitar = new StringInstrument("Guitar", 1798.98);
        instruments.add(guitar);
        StringInstrument banjo = new StringInstrument("Banjo", 698.98);
        instruments.add(banjo);

        WindInstrument saxophone = new WindInstrument("Saxophone", 954.68);
        instruments.add(saxophone);
        WindInstrument flute = new WindInstrument("Flute", 754.68);
        instruments.add(flute);
    }

    public void listIntruments() {

        System.out.println(System.lineSeparator() + "LIST OF INSTRUMENTS" + System.lineSeparator());
        for (Instrument instrument : instruments) {
            System.out.println(instrument);
        }
    }

    public void playingInstruments() {
        System.out.println(System.lineSeparator() + "PLAYING INSTRUMENTS" + System.lineSeparator());
        for (Instrument instrument : instruments) {
            System.out.println(instrument.play());
        }
    }
}
