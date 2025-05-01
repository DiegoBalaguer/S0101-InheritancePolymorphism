package level02.exercise01.model;

import level02.exercise01.interfaces.*;

/**
 * PROGRAM: Smartphone
 * AUTHOR: Diego Balaguer
 * DATE: 02/04/2025
 */

public class Smartphone extends Phone implements Camera, Clock {

    public Smartphone(String manufacturer, String model) {

        super(manufacturer, model);
    }

    @Override
    public String photo() {

        return "They are taking a photo...";
    }

    @Override
    public String alarm() {

        return "The alarm is ringing...";
    }

    @Override
    public String toString() {

        return "Smartphone{} " + super.toString();
    }
}
