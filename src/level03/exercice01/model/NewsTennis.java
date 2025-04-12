package level03.exercice01.model;

import java.util.ArrayList;

/**
 * PROGRAM: MewsTennis
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class NewsTennis extends News {

    private String competition;
    private String player;
    private static ArrayList<PricesTable> pricesTable;
    private static ArrayList<PointsTable> pointsTable;
    private static final double priceInit = 150;
    private static final int pointInit = 4;

    public NewsTennis(String headline, String competition, String player) {
        super(headline);
        setCompetition(competition);
        setPlayer(player);
    }

    private void setCompetition(String competition) {
        if (competition.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to competition.");
        } else
            this.competition = competition;
    }

    private void setPlayer(String player) {
        if (player.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to player.");
        } else
            this.player = player;
    }

    public static void setPricesTable(ArrayList<PricesTable> pricesTable) {
        NewsTennis.pricesTable = pricesTable;
    }

    public static void setPointsTable(ArrayList<PointsTable> pointsTable) {
        NewsTennis.pointsTable = pointsTable;
    }

    @Override
    public int calculatePointsNews() {
        int points = NewsTennis.pointInit;

        for (PointsTable pointsTable : NewsTennis.pointsTable) {
            if (pointsTable.getTextPoint().equalsIgnoreCase(this.competition) ||
                    pointsTable.getTextPoint().equalsIgnoreCase(this.player)) {
                points += pointsTable.getPoints();
            }
        }
        return points;
    }

    @Override
    public double calculatePriceNews() {
        double price = NewsTennis.priceInit;

        for (PricesTable pricesTable : NewsTennis.pricesTable) {
            if (pricesTable.getText().equalsIgnoreCase(this.competition) ||
                    pricesTable.getText().equalsIgnoreCase(this.player)) {
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
        lineNews.add(this.competition);
        lineNews.add("");
        lineNews.add(this.player);
        lineNews.add("");
        lineNews.add(String.valueOf(calculatePriceNews()));
        lineNews.add(String.valueOf(calculatePointsNews()));

        return lineNews;
    }

    @Override
    public String toString() {
        return "level03.NewsTennis{" +
                "competition='" + competition + '\'' +
                ", player='" + player + '\'' +
                "} " + super.toString();
    }
}