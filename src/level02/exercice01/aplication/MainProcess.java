package level02.exercice01.aplication;

import level02.exercice01.model.Smartphone;

/**
 * PROGRAM: MainProcess
 * AUTHOR: Diego Balaguer
 * DATE: 02/04/2025
 */

public class MainProcess {

    public void initialProcess() {

        System.out.println("CREATING PHONE....");

        Smartphone phone = new Smartphone("Nokia", "6350");

        System.out.println(System.lineSeparator() + phone);

        System.out.println(System.lineSeparator() + phone.callPhoneNumber("+34 610 69 39 77"));

        System.out.println(System.lineSeparator() + phone.photo());

        System.out.println(System.lineSeparator() + phone.alarm());

    }
}
