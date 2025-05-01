package level03.exercise01.model;

import java.util.ArrayList;

/**
 * PROGRAM: Editor
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class Editor {

    private String name;
    private final String DNI;
    private static double salary;
    private ArrayList<News> news;

    public Editor(String name, String dni) {
        this.name = name;
        this.DNI = dni;
        news = new ArrayList<>();
    }

    public static void setSalary(double salary) {
        Editor.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setNews(News news) {
        this.news.add(news);
    }

    public void removeNewsById(int idNews) {
        this.news.remove(idNews);
    }

    public ArrayList<News> getNews() {
        return news;
    }

    public int calculatePointsNews() {
        int points = 0;
        for (News news : this.news) {
            points += news.calculatePointsNews();
        }
        return points;
    }

    public double calculatePriceNews() {
        double price = 0;
        for (News news : this.news) {
            price += news.calculatePriceNews();
        }
        return price;
    }

    public ArrayList<String> listEditor() {
        ArrayList<String> list = new ArrayList<>();

        list.add(this.name);
        list.add(this.DNI);
        list.add(String.valueOf(salary));
        list.add(String.valueOf(calculatePointsNews()));
        list.add(String.valueOf(calculatePriceNews()));

        return list;
    }

    @Override
    public String toString() {
        return "Editor{" +
                "name='" + name + '\'' +
                ", dni='" + DNI + '\'' +
                ", news=" + news +
                '}';
    }
}
