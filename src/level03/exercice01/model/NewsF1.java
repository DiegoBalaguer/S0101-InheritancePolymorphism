package level03.exercice01.model;

import java.util.ArrayList;

/**
 * PROGRAM: MewsF1
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class NewsF1 extends News {

    private String team;
    private static ArrayList<PricesTable> pricesTable;
    private static ArrayList<PointsTable> pointsTable;
    private static final double priceInit = 100;
    private static final int pointInit = 4;

    public NewsF1(String headline, String team) {
        super(headline);
        setTeam(team);
    }

    private void setTeam(String team) {
        if (team.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to team.");
        } else
            this.team = team;
    }

    public static void setPricesTable(ArrayList<PricesTable> pricesTable) {
        NewsF1.pricesTable = pricesTable;
    }

    public static void setPointsTable(ArrayList<PointsTable> pointsTable) {
        NewsF1.pointsTable = pointsTable;
    }

    @Override
    public int calculatePointsNews() {
        int points = NewsF1.pointInit;

        for (PointsTable pointsTable : NewsF1.pointsTable) {
            if (pointsTable.getTextPoint().equalsIgnoreCase(this.team)) {
                points += pointsTable.getPoints();
            }
        }
        return points;
    }

    @Override
    public double calculatePriceNews() {
        double price = NewsF1.priceInit;

        for (PricesTable pricesTable : NewsF1.pricesTable) {
            if (pricesTable.getText().equalsIgnoreCase(this.team)) {
                price += pricesTable.getPrice();
            }
        }
        return price;
    }

    @Override
    public ArrayList<String> listNews() {
        ArrayList<String> lineNews = new ArrayList<>();

        lineNews.add(super.getHeadline());
        lineNews.add(super.getText());
        lineNews.add("");
        lineNews.add("");
        lineNews.add("");
        lineNews.add(team);
        lineNews.add(String.valueOf(calculatePriceNews()));
        lineNews.add(String.valueOf(calculatePointsNews()));

        return lineNews;
    }

    @Override
    public String toString() {
        return "level03.NewsF1{" +
                "team='" + team + '\'' +
                "} " + super.toString();
    }
}