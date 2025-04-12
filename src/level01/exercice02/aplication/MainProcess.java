package level01.exercice02.aplication;

import level01.exercice02.model.Car;

/**
 * PROGRAM: MainProcess
 * AUTHOR: Diego Balaguer
 * DATE: 01/04/2025
 */

public class MainProcess {

    public void initialProcess() {

        Car ford01 = new Car("Explorer", 170);

        System.out.println(System.lineSeparator() + ford01);

        System.out.println(System.lineSeparator() + ford01.accelerate());
        System.out.println(System.lineSeparator() + Car.brake());

        Car ford02 = new Car("Escort", 125);

        System.out.println(System.lineSeparator() + ford01);

        System.out.println(System.lineSeparator() + ford02);

        Car.setModel("Fiesta");

        System.out.println(System.lineSeparator() + ford01);

        System.out.println(System.lineSeparator() + ford02);
    }
}
