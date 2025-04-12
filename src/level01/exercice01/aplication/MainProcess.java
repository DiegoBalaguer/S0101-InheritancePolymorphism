package level01.exercice01.aplication;

import level01.exercice01.model.Instrument;

/**
 * PROGRAM: MainProcess
 * AUTHOR: Diego Balaguer
 * DATE: 01/04/2025
 */

public class MainProcess {

    public void initialProcess() {

        System.out.println("Force the class load via a static member: ");
        System.out.println(Instrument.class);
        System.out.println(Instrument.getCounter());

        InstrumentStates instrumentStates = new InstrumentStates();
        instrumentStates.loadInstruments();
        instrumentStates.listIntruments();
        instrumentStates.playingInstruments();
    }
}
