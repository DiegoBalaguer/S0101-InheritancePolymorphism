package level03.exercice01.model;

import java.util.ArrayList;

/**
 * PROGRAM: MewsMotorcycling
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class NewsMotorcycling extends News {

    private String team;
    private static ArrayList<PricesTable> pricesTable;
    private static ArrayList<PointsTable> pointsTable;
    private static final double priceInit = 100;
    private static final int pointInit = 3;

    public NewsMotorcycling(String headline, String team) {
        super(headline);
        setTeam(team);
    }

    private void setTeam(String team) {
        if (team.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to team.");
        } else
            this.team = team;
    }

    public String getTeam() {
        return this.team;
    }

    public static void setPricesTable(ArrayList<PricesTable> pricesTables) {
        NewsMotorcycling.pricesTable = pricesTables;
    }

    public static void setPointsTable(ArrayList<PointsTable> pointsTables) {
        NewsMotorcycling.pointsTable = pointsTables;
    }

    @Override
    public int calculatePointsNews() {
        int points = NewsMotorcycling.pointInit;

        for (PointsTable pointsTable : NewsMotorcycling.pointsTable) {
            if (pointsTable.getTextPoint().equalsIgnoreCase(this.team)) {
                points += pointsTable.getPoints();
            }
        }
        return points;
    }

    @Override
    public double calculatePriceNews() {
        double price = NewsMotorcycling.priceInit;

        for (PricesTable pricesTable : NewsMotorcycling.pricesTable) {
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
        lineNews.add(this.team);
        lineNews.add(String.valueOf(calculatePriceNews()));
        lineNews.add(String.valueOf(calculatePointsNews()));

        return lineNews;
    }

    @Override
    public String toString() {
        return "level03.NewsMotorcycling{" +
                "team='" + team + '\'' +
                "} " + super.toString();
    }
}