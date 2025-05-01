package level03.exercise01.data;

import level03.exercise01.model.*;

import java.util.ArrayList;

/**
 * PROGRAM: Test
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class DataTest {

    public static void loadDataTest(ArrayList<Editor> editors) {

        Editor editor;
        NewsSoccer newsSoccer;
        NewsBasket newsBasket;
        NewsTennis newsTennis;
        NewsF1 newsF1;
        NewsMotorcycling newsMotorcycling;

        editor = new Editor("Bob Woodward", "12345678X");
        newsSoccer = new NewsSoccer("News soccer 01", "Lliga de campions", "Barça", "Ferran Torres");
        editor.setNews(newsSoccer);
        newsSoccer = new NewsSoccer("News soccer 02", "Lliga", "Barça", "player");
        editor.setNews(newsSoccer);
        newsBasket = new NewsBasket("News Basket 01", "Eurolliga", "Madrid");
        editor.setNews(newsBasket);
        newsTennis = new NewsTennis("News Tennis 01", "Madrid", "Nadal");
        editor.setNews(newsTennis);
        newsF1 = new NewsF1("News F1 01", "Ferrari");
        editor.setNews(newsF1);
        newsMotorcycling = new NewsMotorcycling("News Motorcycling 01", "Honda");
        editor.setNews(newsMotorcycling);
        editors.add(editor);

        editor = new Editor("Carl Bernstein", "23456789Y");
        newsSoccer = new NewsSoccer("News soccer 03", "Lliga de campions", "Barça", "Ferran Torres");
        editor.setNews(newsSoccer);
        newsSoccer = new NewsSoccer("News soccer 04", "Lliga", "Barça", "player");
        editor.setNews(newsSoccer);
        newsBasket = new NewsBasket("News Basket 02", "Eurolliga", "Madrid");
        editor.setNews(newsBasket);
        newsTennis = new NewsTennis("News Tennis 02", "Madrid", "Nadal");
        editor.setNews(newsTennis);
        newsF1 = new NewsF1("News F1 02", "Ferrari");
        editor.setNews(newsF1);
        newsMotorcycling = new NewsMotorcycling("News Motorcycling 02", "Honda");
        editor.setNews(newsMotorcycling);
        editors.add(editor);

        editor = new Editor("Joseph Pulitzer", "34567890Z");
        editors.add(editor);
        editor = new Editor("Ida B. Wells", "45678901A");
        editors.add(editor);
        editor = new Editor("Horace Greeley", "56789012B");
        editors.add(editor);
        editor = new Editor("Nellie Bly", "67890123C");
        editors.add(editor);
        editor = new Editor("William Randolph Hearst", "78901234D");
        editors.add(editor);
        editor = new Editor("Anna Politkóvskaya", "89012345E");
        newsSoccer = new NewsSoccer("News soccer 05", "Lliga de campions", "Barça", "Ferran Torres");
        editor.setNews(newsSoccer);
        newsSoccer = new NewsSoccer("News soccer 06", "Lliga", "Barça", "player");
        editor.setNews(newsSoccer);
        newsBasket = new NewsBasket("News Basket 03", "Eurolliga", "Madrid");
        editor.setNews(newsBasket);
        newsTennis = new NewsTennis("News Tennis 03", "Madrid", "Nadal");
        editor.setNews(newsTennis);
        newsF1 = new NewsF1("News F1 03", "Ferrari");
        editor.setNews(newsF1);
        newsMotorcycling = new NewsMotorcycling("News Motorcycling 03", "Honda");
        editor.setNews(newsMotorcycling);
        editors.add(editor);

        editor = new Editor("Hunter S. Thompson", "90123456F");
        editors.add(editor);
        editor = new Editor("David Halberstam", "01234567G");
        editors.add(editor);

        System.out.println("Load data test ok.");
    }
}
