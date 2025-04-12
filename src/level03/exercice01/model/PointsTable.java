package level03.exercice01.model;

/**
 * PROGRAM: level03.PointsList
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class PointsTable {
    private String textPoint;
    private int points;

    public PointsTable(String text, int points) {
        setTextPoint(text);
        setPoints(points);
    }

    private void setTextPoint(String textPoints) {
        if (textPoints.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to text.");
        } else
            this.textPoint = textPoints;
    }

    private void setPoints(int points) {
        if (points <= 0) {
            throw new IllegalArgumentException("The points must be equal or greater than 1.");
        } else
            this.points = points;
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
