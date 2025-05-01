package level03.exercise01.model;

import java.util.ArrayList;

/**
 * PROGRAM: News
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public abstract class News {

    private String headline;
    private String text;

    public News(String headline) {
        this.headline = headline;
    }

    public void setText(String text) {
            this.text = text;
    }

    public String getHeadline() {
        return this.headline;
    }

    public String getText() {
        return this.text;
    }

    public int calculatePointsNews() {
        int points = getPointsBase();

        for (PointsTable pointsTable : getPointsTables()) {
            if (getFilterCalculate(pointsTable.getTextPoint())) {
                points += pointsTable.getPoints();
            }
        }
        return points;
    }

    public double calculatePriceNews() {
        double price = getPriceBase();

        for (PricesTable pricesTable : getPricesTables()) {
            if (getFilterCalculate(pricesTable.getTextPrice())) {
                price += pricesTable.getPrice();
            }
        }
        return price;
    }

    protected abstract int getPointsBase();

    protected abstract ArrayList<PointsTable> getPointsTables();

    protected abstract double getPriceBase();

    protected abstract ArrayList<PricesTable> getPricesTables();

    protected abstract boolean getFilterCalculate(String textPricesTable);

    public abstract ArrayList<String> getLineListNews();
}
