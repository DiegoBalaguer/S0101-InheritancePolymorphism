package level03.exercice01.model;

import java.util.ArrayList;

/**
 * PROGRAM: Editor
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class Editor {

    private String name;
    private final String dni;
    private static double salary;
    private ArrayList<News> news;

    public Editor(String name, String dni) {
        setName(name);
        this.dni = setDni(dni);
        news = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to name.");
        } else
            this.name = name;
    }

    private String setDni(String dni) {
        if (dni.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to dni.");
        } else
            return dni;
    }

    public static void setSalary(double salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("The salary must be equal or greater than 1€.");
        } else
            Editor.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setNews(News news) {
        this.news.add(news);
    }

    public void removeNews(int idNews) {
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
        list.add(this.dni);
        list.add(String.valueOf(salary));
        list.add(String.valueOf(calculatePointsNews()));
        list.add(String.valueOf(calculatePriceNews()));

        return list;
    }

    @Override
    public String toString() {
        return "Editor{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", news=" + news +
                '}';
    }
}
