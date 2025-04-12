package level02.exercice01.model;

/**
 * PROGRAM: level02.model.Phone
 * AUTHOR: Diego Balaguer
 * DATE: 02/04/2025
 */

public class Phone {
    private String manufacturer;
    private String model;

    public Phone(String manufacturer, String model) {
        setManufacturer(manufacturer);
        setModel(model);
    }

    private void setManufacturer(String manufacturer) {
        if (manufacturer.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to manufacturer.");
        } else
            this.manufacturer = manufacturer;
    }

    private void setModel(String model) {
        if (model.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to model.");
        } else
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
