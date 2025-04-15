package level03.exercice01.aplication;

import level03.exercice01.enums.*;
import level03.exercice01.model.*;
import level03.exercice01.utils.Utils;

import java.util.ArrayList;

/**
 * PROGRAM: level03.MnuOptNewsMain
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class NewsManager {

    private Editor editor = null;

    public NewsManager(Editor editor) {

        this.editor = editor;
        menu();

    }

    private void menu() {

        do {
            MnuOptNews.viewMenu(editor.getName());
            int resp = Utils.valueInt("");
            try {
                MnuOptNews option = MnuOptNews.values()[resp - 1];
                switch (option) {
                    case EXIT -> {
                        return;
                    }
                    case NEWS_CRE_SO -> addNews(Sport.SOCCER);
                    case NEWS_CRE_BA -> addNews(Sport.BASKETBALL);
                    case NEWS_CRE_TE -> addNews(Sport.TENNIS);
                    case NEWS_CRE_F1 -> addNews(Sport.F1);
                    case NEWS_CRE_MO -> addNews(Sport.MOTORCYCLING);
                    case NEWS_TYP_TEXT -> setTextNews();
                    case NEWS_DEL -> removeNews();
                    case NEWS_LIST -> newsList(editor.getNews());
                    case NEWS_PUNT -> calculatePointsNews();
                    case NEWS_PRICE -> calculatePriceNews();
                    default -> System.out.println("Error: The value is wrong.");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: The value is wrong.");
            }
        } while (true);
    }

    private void addNews(Sport sport) {

        System.out.println(System.lineSeparator() + "CREATE " + sport + " ARTICLE .................." + System.lineSeparator());

        String headline = introHeadline();

        switch (sport) {
            case SOCCER -> {
                String competition = introCompetition();
                String club = introClub();
                String player = introPlayer();
                NewsSoccer news = new NewsSoccer(headline, competition, club, player);
                editor.setNews(news);
            }
            case BASKETBALL -> {
                String competition = introCompetition();
                String club = introClub();
                NewsBasket news = new NewsBasket(headline, competition, club);
                editor.setNews(news);
            }
            case TENNIS -> {
                String competition = introCompetition();
                String player = introPlayer();
                NewsTennis news = new NewsTennis(headline, competition, player);
                editor.setNews(news);
            }
            case F1 -> {
                String team = introTeam();
                NewsF1 news = new NewsF1(headline, team);
                editor.setNews(news);
            }
            case MOTORCYCLING -> {
                String team = introTeam();
                NewsMotorcycling news = new NewsMotorcycling(headline, team);
                editor.setNews(news);
            }
            default -> System.out.println("Wrong article's type.");
        }
    }

    private void removeNews() {

        System.out.println(System.lineSeparator() + "DELETE ARTICLE.................." + System.lineSeparator());

        int id = introIdNews();
        try {
            News newsRemove = editor.getNews().get(id);
            System.out.println(
                    "The article has been deleted from the system: " + System.lineSeparator() + newsRemove.toString());
            editor.removeNews(id);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds.");
        }
    }

    private void setTextNews() {

        System.out.println(System.lineSeparator() + "TYPE TEXT INTO ARTICLE.................." + System.lineSeparator());

        do {
            int id = introIdNews();
            try {
                editor.getNews().get(id).setText(introTextNews());
                //editor.setTextNews(id, introTextNews());
                return;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error: " + e);
            }
        } while (true) ;
        }

        private void calculatePointsNews () {
            int points = 0;

            for (News news : editor.getNews()) {
                points += news.calculatePointsNews();
            }
            System.out.println("The overall news' points are: " + points);
        }

        private void calculatePriceNews () {
            double price = 0;

            for (News n : editor.getNews()) {
                price += n.calculatePriceNews();
            }
            System.out.println("The overall news' price is: " + price + "€");
        }

        private void newsList (ArrayList < News > list) {
            System.out.println(System.lineSeparator() + "LIST NEWS..................");

            System.out.println(makeHeadLineNews());

            for (News news : list) {
                System.out.println(makeLineNews(news.listNews()));
            }
        }

        private void newsListWithId (ArrayList < News > listNews) {

            System.out.println(System.lineSeparator() + "LIST NEWS WITH ID...............");

            System.out.println("Index \t" + makeHeadLineNews());

            for (int i = 0; i < listNews.size(); i++) {
                System.out.println((i + 1) + ".-  \t" + makeLineNews(listNews.get(i).listNews()));
            }
        }

        private String introHeadline () {
            return Utils.valueString("Insert headline article: ");
        }

        private String introCompetition () {
            return Utils.valueString("Insert competition name: ");
        }

        private String introClub () {
            return Utils.valueString("Insert club name: ");
        }

        private String introPlayer () {
            return Utils.valueString("Insert player name: ");
        }

        private String introTeam () {
            return Utils.valueString("Insert team name: ");
        }

        private int introIdNews () {

            do {
                try {
                    newsListWithId(editor.getNews());
                    int idNews = Utils.valueInt("Type article's id: ") - 1;
                    Utils.validateIndex(idNews, editor.getNews().size());
                    return idNews;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Error: " + e);
                }
            } while (true);
        }

        private String introTextNews () {
            return Utils.valueString("Insert article's text: ");
        }

        public static String makeHeadLineNews () {

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

        public static String makeLineNews (ArrayList < String > dataLine) {

            int i = 0;

            return Utils.formatToChars(dataLine.get(i++), 20) + " \t " +
                    Utils.formatToChars(dataLine.get(i++), 10) + " \t " +
                    Utils.formatToChars(dataLine.get(i++), 15) + " \t " +
                    Utils.formatToChars(dataLine.get(i++), 10) + " \t " +
                    Utils.formatToChars(dataLine.get(i++), 15) + " \t " +
                    Utils.formatToChars(dataLine.get(i++), 10) + " \t " +
                    Utils.formatToChars(dataLine.get(i++), 8) + " \t " +
                    Utils.formatToChars(dataLine.get(i), 8);
        }
    }