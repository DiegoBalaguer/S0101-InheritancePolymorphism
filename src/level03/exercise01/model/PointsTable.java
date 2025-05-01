package level03.exercise01.model;

/**
 * PROGRAM: PointsList
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class PointsTable {
    private String textPoint;
    private int points;

    public PointsTable(String textPoints, int points) {
        this.textPoint = textPoints;
        this.points = points;;
    }

    public String getTextPoint() {
        return this.textPoint;
    }

    public int getPoints() {
        return this.points;
    }

    @Override
    public String toString() {
        return "PointsBoard{" +
                "text='" + textPoint + '\'' +
                ", points=" + points +
                '}';
    }
}
