package level03.exercise01.model;

/**
 * PROGRAM: PricesList
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class PricesTable {
    private String textPrice;
    private double price;

    public PricesTable(String textPrice, double price) {
        this.textPrice = textPrice;
        this.price = price;
    }

    public String getTextPrice() {
        return this.textPrice;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "PricesBoard{" +
                "text='" + textPrice + '\'' +
                ", price=" + price +
                '}';
    }
}
