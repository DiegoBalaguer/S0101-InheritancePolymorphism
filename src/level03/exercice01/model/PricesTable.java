package level03.exercice01.model;

/**
 * PROGRAM: level03.PricesList
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class PricesTable {
    private String text;
    private double price;

    public PricesTable(String text, double price) {
        setText(text);
        setPrice(price);
    }

    private void setText(String textPrice) {
        if (textPrice.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to text.");
        } else
            this.text = textPrice;
    }

    private void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("The price must be equal or greater than 1€.");
        } else
            this.price = price;
    }

    public String getText() {
        return this.text;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "PricesBoard{" +
                "text='" + text + '\'' +
                ", price=" + price +
                '}';
    }
}
