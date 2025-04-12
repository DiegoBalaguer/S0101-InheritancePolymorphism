package level03.exercice01.data;

import level03.exercice01.model.PointsTable;
import level03.exercice01.model.PricesTable;
import level03.exercice01.model.*;
import java.util.ArrayList;

/**
 * PROGRAM: ListsPricesPoints
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class TablesPricesPoints {

public void loadInitValues(ArrayList<Editor> editors) {

    Editor.setSalary(35000);

    loadTablePricesSoccer();
    loadTablePointsSoccer();
    loadTablePointsTennis();
    loadTablePricesTennis();
    loadTablePointsBasket();
    loadTablePricesF1();
    loadTablePointsF1();
    loadTablePricesMotorCycle();
    loadTablePointsMotorCycle();
    loadTablePricesBasket();
}

    private void loadTablePricesSoccer() {
        ArrayList<PricesTable> tablePrices = new ArrayList<>();
        tablePrices.add(new PricesTable("Lliga de Campions", 100));
        tablePrices.add(new PricesTable("Barça", 100));
        tablePrices.add(new PricesTable("Madrid", 100));
        tablePrices.add(new PricesTable("Ferran Torres", 50));
        tablePrices.add(new PricesTable("Benzema", 50));

        NewsSoccer.setPricesTable(tablePrices);
    }

    private void loadTablePointsSoccer() {
        ArrayList<PointsTable> tablePoints = new ArrayList<>();
        tablePoints.add(new PointsTable("Lliga de Campions", 3));
        tablePoints.add(new PointsTable("Lliga", 2));
        tablePoints.add(new PointsTable("Barça", 1));
        tablePoints.add(new PointsTable("Madrid", 1));
        tablePoints.add(new PointsTable("Ferran Torres", 1));
        tablePoints.add(new PointsTable("Benzema", 1));

        NewsSoccer.setPointsTable(tablePoints);
    }

    private void loadTablePricesBasket() {
        ArrayList<PricesTable> tablePrices = new ArrayList<>();
        tablePrices.add(new PricesTable("Eurolliga", 75));
        tablePrices.add(new PricesTable("Barça", 75));
        tablePrices.add(new PricesTable("Madrid", 75));

        NewsBasket.setPricesTable(tablePrices);
    }

    private static void loadTablePointsBasket() {
        ArrayList<PointsTable> tablePoints = new ArrayList<>();
        tablePoints.add(new PointsTable("Eurolliga", 3));
        tablePoints.add(new PointsTable("ACB", 2));
        tablePoints.add(new PointsTable("Barça", 1));
        tablePoints.add(new PointsTable("Madrid", 1));

        NewsBasket.setPointsTable(tablePoints);
    }


    private static void loadTablePricesTennis() {
        ArrayList<PricesTable> tablePrices = new ArrayList<>();
        tablePrices.add(new PricesTable("Federer", 100));
        tablePrices.add(new PricesTable("Nadal", 100));
        tablePrices.add(new PricesTable("Djokovic", 100));

        NewsTennis.setPricesTable(tablePrices);
    }

    private static void loadTablePointsTennis() {
        ArrayList<PointsTable> tablePoints = new ArrayList<>();
        tablePoints.add(new PointsTable("Federer", 3));
        tablePoints.add(new PointsTable("Nadal", 3));
        tablePoints.add(new PointsTable("Djokovic", 3));

        NewsTennis.setPointsTable(tablePoints);
    }

    private static void loadTablePricesF1() {
        ArrayList<PricesTable> tablePrices = new ArrayList<>();
        tablePrices.add(new PricesTable("Ferrari", 50));
        tablePrices.add(new PricesTable("Mercedes", 50));

        NewsF1.setPricesTable(tablePrices);
    }

    private static void loadTablePointsF1() {
        ArrayList<PointsTable> tablePoints = new ArrayList<>();
        tablePoints.add(new PointsTable("Ferrari", 2));
        tablePoints.add(new PointsTable("Mercedes", 2));

        NewsF1.setPointsTable(tablePoints);
    }

    private static void loadTablePricesMotorCycle() {
        ArrayList<PricesTable> tablePrices = new ArrayList<>();
        tablePrices.add(new PricesTable("Honda", 50));
        tablePrices.add(new PricesTable("Yamaha", 50));

        NewsMotorcycling.setPricesTable(tablePrices);
    }

    private static void loadTablePointsMotorCycle() {
        ArrayList<PointsTable> tablePoints = new ArrayList<>();
        tablePoints.add(new PointsTable("Honda", 3));
        tablePoints.add(new PointsTable("Yamaha", 3));

        NewsMotorcycling.setPointsTable(tablePoints);
    }
}
