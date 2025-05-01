package level03.exercise01.model;

import level03.exercise01.data.TablesPricesPoints;

import java.util.ArrayList;

/**
 * PROGRAM: NewsSoccer
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class NewsSoccer extends News {

    private String competition;
    private String club;
    private String player;

    public NewsSoccer(String headline, String competition, String club, String player) {
        super(headline);
        this.competition = competition;
        this.club = club;
        this.player = player;
    }

    @Override
    protected int getPointsBase() {
        return TablesPricesPoints.loadPointsBaseSoccer();
    }

    @Override
    protected ArrayList<PointsTable> getPointsTables() {
        return TablesPricesPoints.loadTablePointsSoccer();
    }

    @Override
    protected double getPriceBase() {
        return TablesPricesPoints.loadPriceBaseSoccer();
    }

    @Override
    protected ArrayList<PricesTable> getPricesTables() {
        return TablesPricesPoints.loadTablePricesSoccer();
    }

    @Override
    protected boolean getFilterCalculate(String textPricesTable) {
        return (textPricesTable.equalsIgnoreCase(this.competition) ||
                textPricesTable.equalsIgnoreCase(this.club) ||
                textPricesTable.equalsIgnoreCase(this.player));
    }

    public ArrayList<String> getLineListNews() {
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
        return "NewsSoccer{" +
                "competition='" + competition + '\'' +
                ", club='" + club + '\'' +
                ", player='" + player + '\'' +
                "} " + super.toString();
    }
}