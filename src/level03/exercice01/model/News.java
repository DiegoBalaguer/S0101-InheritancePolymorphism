package level03.exercice01.model;

import java.util.ArrayList;

/**
 * PROGRAM: Mews
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public abstract class News {

    private String headline;
    private String text;

    public News(String headline) {
        setHeadline(headline);
    }

    private void setHeadline(String headLine) {
        if (headLine.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to headline.");
        } else
            this.headline = headLine;
    }

    public void setText(String text) {
        if (text.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to text.");
        } else
            this.text = text;
    }

    public String getHeadline() {
        return this.headline;
    }

    public String getText() {
        return this.text;
    }

    public abstract int calculatePointsNews();

    public abstract double calculatePriceNews();

    public abstract ArrayList<String> listNews();
}
