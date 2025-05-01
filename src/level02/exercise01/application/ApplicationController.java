package level02.exercise01.application;

import level02.exercise01.model.Smartphone;

/**
 * PROGRAM: ApplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 02/04/2025
 */

public class ApplicationController {

    public void run() {

        System.out.println("CREATING PHONE....");

        Smartphone phone = new Smartphone("Nokia", "6350");

        System.out.println(System.lineSeparator() + phone);

        System.out.println(System.lineSeparator() + phone.callPhoneNumber("+34 610 69 39 77"));

        System.out.println(System.lineSeparator() + phone.photo());

        System.out.println(System.lineSeparator() + phone.alarm());

    }
}
