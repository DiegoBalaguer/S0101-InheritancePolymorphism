package level03.exercise01.model;

import level03.exercise01.data.TablesPricesPoints;

import java.util.ArrayList;

/**
 * PROGRAM: NewsMotorcycling
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class NewsMotorcycling extends News {

    private String team;

    public NewsMotorcycling(String headline, String team) {
        super(headline);
        this.team = team;
    }

    @Override
    public int calculatePointsNews() {
        int points = getPointsBase();

        for (PointsTable pointsTable : getPointsTables()) {
            if (getFilterCalculate(pointsTable.getTextPoint())) {
                points += pointsTable.getPoints();
            }
        }
        return points;
    }

    @Override
    public double calculatePriceNews() {
        double price = getPriceBase();

        for (PricesTable pricesTable : getPricesTables()) {
            if (getFilterCalculate(pricesTable.getTextPrice())) {
                price += pricesTable.getPrice();
            }
        }
        return price;
    }

    @Override
    protected int getPointsBase() {
        return TablesPricesPoints.loadPointsBaseMotorcycling();
    }

    @Override
    protected ArrayList<PointsTable> getPointsTables() {
        return TablesPricesPoints.loadTablePointsMotorcycling();
    }

    @Override
    protected double getPriceBase() {
        return TablesPricesPoints.loadPriceBaseMotorcycling();
    }

    @Override
    protected ArrayList<PricesTable> getPricesTables() {
        return TablesPricesPoints.loadTablePricesMotorcycling();
    }

    @Override
    protected boolean getFilterCalculate(String textPricesTable) {
        return (textPricesTable.equalsIgnoreCase(this.team));
    }

    @Override
    public ArrayList<String> getLineListNews() {
        ArrayList<String> lineNews = new ArrayList<>();

        lineNews.add(super.getHeadline());
        lineNews.add(super.getText());
        lineNews.add("");
        lineNews.add("");
        lineNews.add("");
        lineNews.add(this.team);
        lineNews.add(String.valueOf(calculatePriceNews()));
        lineNews.add(String.valueOf(calculatePointsNews()));

        return lineNews;
    }

    @Override
    public String toString() {
        return "NewsMotorcycling{" +
                "team='" + team + '\'' +
                "} " + super.toString();
    }
}