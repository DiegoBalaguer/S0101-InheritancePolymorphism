package level02.exercise01.model;

/**
 * PROGRAM: Phone
 * AUTHOR: Diego Balaguer
 * DATE: 02/04/2025
 */

public class Phone {
    private String manufacturer;
    private String model;

    public Phone(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String callPhoneNumber(String phoneNumber) {
        return "Calling phone number " + phoneNumber;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
