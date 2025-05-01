package level01.exercise01.application;

import level01.exercise01.model.Instrument;

/**
 * PROGRAM: ApplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 01/04/2025
 */

public class ApplicationController {

    public void run() {

        System.out.println("Force the class load via a static member: ");
        System.out.println(Instrument.class);
        System.out.println(Instrument.getCounter());

        ApplicationWorkers applicationWorkers = new ApplicationWorkers();
        applicationWorkers.loadInstruments();
        applicationWorkers.listIntruments();
        applicationWorkers.playingInstruments();
    }
}
