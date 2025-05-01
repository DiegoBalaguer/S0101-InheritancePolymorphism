package level03.exercise01.model;

import level03.exercise01.data.TablesPricesPoints;

import java.util.ArrayList;

/**
 * PROGRAM: NewsBasket
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class NewsBasket extends News {

    private String competition;
    private String club;

    public NewsBasket(String headline, String competition, String club) {
        super(headline);
        this.competition = competition;
        this.club = club;
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
        return TablesPricesPoints.loadPointsBaseBasket();
    }

    @Override
    protected ArrayList<PointsTable> getPointsTables() {
        return TablesPricesPoints.loadTablePointsBasket();
    }

    @Override
    protected double getPriceBase() {
        return TablesPricesPoints.loadPriceBaseBasket();
    }

    @Override
    protected ArrayList<PricesTable> getPricesTables() {
        return TablesPricesPoints.loadTablePricesBasket();
    }

    @Override
    protected boolean getFilterCalculate(String textPricesTable) {
        return (textPricesTable.equalsIgnoreCase(this.competition) ||
                textPricesTable.equalsIgnoreCase(this.club));
    }

    @Override
    public ArrayList<String> getLineListNews() {
        ArrayList<String> lineNews = new ArrayList<>();

        lineNews.add(super.getHeadline());
        lineNews.add(super.getText());
        lineNews.add(this.competition);
        lineNews.add(this.club);
        lineNews.add("");
        lineNews.add("");
        lineNews.add(String.valueOf(calculatePriceNews()));
        lineNews.add(String.valueOf(calculatePointsNews()));

        return lineNews;
    }

    @Override
    public String toString() {
        return "NewsBasket{" +
                "competition='" + competition + '\'' +
                ", club='" + club + '\'' +
                "} " + super.toString();
    }
}
