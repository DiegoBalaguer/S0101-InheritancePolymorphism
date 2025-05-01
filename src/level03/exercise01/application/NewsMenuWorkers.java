package level03.exercise01.application;

import level03.exercise01.model.*;
import level03.exercise01.utils.ConsoleUtils;
import level03.exercise01.utils.ProgramUtils;
import level03.exercise01.utils.StringUtils;

import java.util.ArrayList;

/**
 * PROGRAM: NewsMenuWorkers
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class NewsMenuWorkers {

    private Editor editor;

    public NewsMenuWorkers(Editor editor) {
        this.editor = editor;
    }

    public void createNewsSoccer() {
        System.out.println(System.lineSeparator() + "CREATE SOCCER ARTICLE .................." + System.lineSeparator());

        String headline = enterHeadline();
        String competition = enterCompetition();
        String club = enterClub();
        String player = enterPlayer();
        NewsSoccer news = new NewsSoccer(headline, competition, club, player);
        editor.setNews(news);
    }

    public void createNewsBasketball() {
        System.out.println(System.lineSeparator() + "CREATE BASKETBALL ARTICLE .................." + System.lineSeparator());

        String headline = enterHeadline();
        String competition = enterCompetition();
        String club = enterClub();
        NewsBasket news = new NewsBasket(headline, competition, club);
        editor.setNews(news);
    }

    public void createNewsTennis() {
        System.out.println(System.lineSeparator() + "CREATE TENNIS ARTICLE .................." + System.lineSeparator());

        String headline = enterHeadline();
        String competition = enterCompetition();
        String player = enterPlayer();
        NewsTennis news = new NewsTennis(headline, competition, player);
        editor.setNews(news);
    }

    public void createNewsF1() {
        System.out.println(System.lineSeparator() + "CREATE F1 ARTICLE .................." + System.lineSeparator());

        String headline = enterHeadline();
        String team = enterTeam();
        NewsF1 news = new NewsF1(headline, team);
        editor.setNews(news);
    }

    public void createNewsMotorcycling() {
        System.out.println(System.lineSeparator() + "CREATE SOCCER ARTICLE .................." + System.lineSeparator());

        String headline = enterHeadline();
        String team = enterTeam();
        NewsMotorcycling news = new NewsMotorcycling(headline, team);
        editor.setNews(news);
    }

    public void removeNewsById() {
        System.out.println(System.lineSeparator() + "DELETE ARTICLE.................." + System.lineSeparator());

        int id = enterIdNews();
        try {
            News newsRemove = editor.getNews().get(id);
            System.out.println(
                    "The article has been deleted from the system: " + System.lineSeparator() + newsRemove.toString());
            editor.removeNewsById(id);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Index out of bounds.");
        }
    }

    public void setTextNews() {
        System.out.println(System.lineSeparator() + "TYPE TEXT INTO ARTICLE.................." + System.lineSeparator());

        int id = enterIdNews();
        editor.getNews().get(id).setText(enterTextNews());
    }

    public void calculatePointsNews() {
        int points = 0;

        for (News news : editor.getNews()) {
            points += news.calculatePointsNews();
        }
        System.out.println("The overall news' points are: " + points);
    }

    public void calculatePriceNews() {
        double price = 0;

        for (News news : editor.getNews()) {
            price += news.calculatePriceNews();
        }
        System.out.println("The overall news' price is: " + price + "€");
    }

    public void showNewsList(ArrayList<News> list) {
        System.out.println(System.lineSeparator() + "LIST NEWS..................");

        System.out.println(makeHeadLineNews());

        for (News news : list) {
            System.out.println(makeLineNews(news.getLineListNews()));
        }
    }

    private void showNewsListWithId(ArrayList<News> listNews) {

        System.out.println(System.lineSeparator() + "LIST NEWS WITH ID...............");

        System.out.println("Index \t" + makeHeadLineNews());

        for (int i = 0; i < listNews.size(); i++) {
            System.out.println((i + 1) + ".-  \t" + makeLineNews(listNews.get(i).getLineListNews()));
        }
    }

    private String enterHeadline() {
        return ConsoleUtils.readRequiredString("Insert headline article: ");
    }

    private String enterCompetition() {
        return ConsoleUtils.readRequiredString("Insert competition name: ");
    }

    private String enterClub() {
        return ConsoleUtils.readRequiredString("Insert club name: ");
    }

    private String enterPlayer() {
        return ConsoleUtils.readRequiredString("Insert player name: ");
    }

    private String enterTeam() {
        return ConsoleUtils.readRequiredString("Insert team name: ");
    }

    private int enterIdNews() {
        do {
            try {
                showNewsListWithId(editor.getNews());
                int idNews = ConsoleUtils.readRequiredInt("Type article's id: ") - 1;
                ProgramUtils.validateIndex(idNews, editor.getNews().size());
                return idNews;
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Error: " + e);
            }
        } while (true);
    }

    private String enterTextNews() {
        return ConsoleUtils.readRequiredString("Insert article's text: ");
    }

    public static String makeHeadLineNews() {

        ArrayList<String> dataLine = new ArrayList<>();

        dataLine.add("Headline");
        dataLine.add("Text");
        dataLine.add("Competition");
        dataLine.add("Club");
        dataLine.add("Player");
        dataLine.add("Team");
        dataLine.add("Price");
        dataLine.add("Points");

        return makeLineNews(dataLine);
    }

    public static String makeLineNews(ArrayList<String> dataLine) {

        int i = 0;

        return StringUtils.formatToChars(dataLine.get(i++), 20) + " \t " +
                StringUtils.formatToChars(dataLine.get(i++), 10) + " \t " +
                StringUtils.formatToChars(dataLine.get(i++), 15) + " \t " +
                StringUtils.formatToChars(dataLine.get(i++), 10) + " \t " +
                StringUtils.formatToChars(dataLine.get(i++), 15) + " \t " +
                StringUtils.formatToChars(dataLine.get(i++), 10) + " \t " +
                StringUtils.formatToChars(dataLine.get(i++), 8) + " \t " +
                StringUtils.formatToChars(dataLine.get(i), 8);
    }
}