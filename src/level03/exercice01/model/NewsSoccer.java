package level03.exercice01.model;

import java.util.ArrayList;

/**
 * PROGRAM: MewsSoccer
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class NewsSoccer extends News {

    private String competition;
    private String club;
    private String player;
    private static ArrayList<PricesTable> pricesTable;
    private static ArrayList<PointsTable> pointsTable;
    private static final double priceInit = 300;
    private static final int pointInit = 5;

    public NewsSoccer(String headline, String competition, String club, String player) {
        super(headline);
        setCompetition(competition);
        setClub(club);
        setPlayer(player);
    }

    private void setCompetition(String Competition) {
        if (Competition.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to competition.");
        } else
            this.competition = Competition;
    }

    private void setClub(String club) {
        if (club.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to club.");
        } else
            this.club = club;
    }

    private void setPlayer(String player) {
        if (player.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to player.");
        } else
            this.player = player;
    }

    public static void setPricesTable(ArrayList<PricesTable> pricesTable) {
        NewsSoccer.pricesTable = pricesTable;
    }

    public static void setPointsTable(ArrayList<PointsTable> pointsTable) {
        NewsSoccer.pointsTable = pointsTable;
    }

    @Override
    public int calculatePointsNews() {
        int points = NewsSoccer.pointInit;

        for (PointsTable pointsTable : NewsSoccer.pointsTable) {
            if (pointsTable.getTextPoint().equalsIgnoreCase(this.competition) ||
                    pointsTable.getTextPoint().equalsIgnoreCase(this.club) ||
                    pointsTable.getTextPoint().equalsIgnoreCase(this.player)) {
                points += pointsTable.getPoints();
            }
        }
        return points;
    }

    @Override
    public double calculatePriceNews() {
        double price = NewsSoccer.priceInit;

        for (PricesTable pricesTable : NewsSoccer.pricesTable) {
            if (pricesTable.getText().equalsIgnoreCase(this.competition) ||
                    pricesTable.getText().equalsIgnoreCase(this.club) ||
                    pricesTable.getText().equalsIgnoreCase(this.player)) {
                price += pricesTable.getPrice();
            }
        }
        return price;
    }

    public ArrayList<String> listNews() {
        ArrayList<String> lineNews = new ArrayList<>();

        lineNews.add(super.getHeadline());
        lineNews.add(super.getText());
        lineNews.add(this.competition);
        lineNews.add(this.club);
        lineNews.add(this.player);
        lineNews.add("");
        lineNews.add(String.valueOf(calculatePriceNews()));
        lineNews.add(String.valueOf(calculatePointsNews()));

        return lineNews;
    }

    @Override
    public String toString() {
        return "level03.NewsSoccer{" +
                "competition='" + competition + '\'' +
                ", club='" + club + '\'' +
                ", player='" + player + '\'' +
                "} " + super.toString();
    }
}