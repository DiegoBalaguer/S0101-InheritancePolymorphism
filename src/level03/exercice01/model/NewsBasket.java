package level03.exercice01.model;

import java.util.ArrayList;

/**
 * PROGRAM: MewsBasket
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class NewsBasket extends News {

    private String competition;
    private String club;
    private static ArrayList<PricesTable> pricesTable;
    private static ArrayList<PointsTable> pointsTable;
    private static final double priceInit = 250;
    private static final int pointInit = 4;

    public NewsBasket(String headline, String competition, String club) {
        super(headline);
        setCompetition(competition);
        setClub(club);
    }

    private void setCompetition(String competition) {
        if (competition.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to competition.");
        } else
            this.competition = competition;
    }

    private void setClub(String club) {
        if (club.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to club.");
        } else
            this.club = club;
    }

    public static void setPricesTable(ArrayList<PricesTable> pricesTable) {

        NewsBasket.pricesTable = pricesTable;
    }

    public static void setPointsTable(ArrayList<PointsTable> pointsTable) {

        NewsBasket.pointsTable = pointsTable;
    }

    @Override
    public int calculatePointsNews() {

        int points = NewsBasket.pointInit;

        for (PointsTable tablePoints : NewsBasket.pointsTable) {
            if (tablePoints.getTextPoint().equalsIgnoreCase(this.competition) ||
                    tablePoints.getTextPoint().equalsIgnoreCase(this.club)) {
                points += tablePoints.getPoints();
            }
        }
        return points;
    }

    @Override
    public double calculatePriceNews() {
        double price = NewsBasket.priceInit;

        for (PricesTable tablePrices : NewsBasket.pricesTable) {
            if (tablePrices.getText().equalsIgnoreCase(this.competition) ||
                    tablePrices.getText().equalsIgnoreCase(this.club)) {
                price += tablePrices.getPrice();
            }
        }
        return price;
    }

    @Override
    public ArrayList<String> listNews() {
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
        return "level03.NewsBasket{" +
                "competition='" + competition + '\'' +
                ", club='" + club + '\'' +
                "} " + super.toString();
    }
}
