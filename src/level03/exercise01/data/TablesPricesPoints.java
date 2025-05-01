package level03.exercise01.data;

import level03.exercise01.model.PointsTable;
import level03.exercise01.model.PricesTable;

import java.util.ArrayList;

/**
 * PROGRAM: TablesPricesPoints
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class TablesPricesPoints {

    public static double loadInitialEditorSalary() {
        return 35000;
    }

    public static int loadPointsBaseSoccer() {
        return 5;
    }

    public static ArrayList<PointsTable> loadTablePointsSoccer() {
        ArrayList<PointsTable> tablePoints = new ArrayList<>();
        tablePoints.add(new PointsTable("Lliga de Campions", 3));
        tablePoints.add(new PointsTable("Lliga", 2));
        tablePoints.add(new PointsTable("Barça", 1));
        tablePoints.add(new PointsTable("Madrid", 1));
        tablePoints.add(new PointsTable("Ferran Torres", 1));
        tablePoints.add(new PointsTable("Benzema", 1));

        return tablePoints;
    }

    public static int loadPriceBaseSoccer() {
        return 300;
    }

    public static ArrayList<PricesTable> loadTablePricesSoccer() {
        ArrayList<PricesTable> tablePrices = new ArrayList<>();
        tablePrices.add(new PricesTable("Lliga de Campions", 100));
        tablePrices.add(new PricesTable("Barça", 100));
        tablePrices.add(new PricesTable("Madrid", 100));
        tablePrices.add(new PricesTable("Ferran Torres", 50));
        tablePrices.add(new PricesTable("Benzema", 50));

        return tablePrices;
    }

    public static int loadPointsBaseBasket() {
        return 4;
    }

    public static ArrayList<PointsTable> loadTablePointsBasket() {
        ArrayList<PointsTable> tablePoints = new ArrayList<>();
        tablePoints.add(new PointsTable("Eurolliga", 3));
        tablePoints.add(new PointsTable("ACB", 2));
        tablePoints.add(new PointsTable("Barça", 1));
        tablePoints.add(new PointsTable("Madrid", 1));

        return tablePoints;
    }

    public static int loadPriceBaseBasket() {
        return 250;
    }

    public static ArrayList<PricesTable> loadTablePricesBasket() {
        ArrayList<PricesTable> tablePrices = new ArrayList<>();
        tablePrices.add(new PricesTable("Eurolliga", 75));
        tablePrices.add(new PricesTable("Barça", 75));
        tablePrices.add(new PricesTable("Madrid", 75));

        return tablePrices;
    }


    public static int loadPointsBaseTennis() {
        return 4;
    }

    public static ArrayList<PointsTable>  loadTablePointsTennis() {
        ArrayList<PointsTable> tablePoints = new ArrayList<>();
        tablePoints.add(new PointsTable("Federer", 3));
        tablePoints.add(new PointsTable("Nadal", 3));
        tablePoints.add(new PointsTable("Djokovic", 3));

        return tablePoints;
    }

    public static int loadPriceBaseTennis() {
        return 150;
    }

    public static ArrayList<PricesTable> loadTablePricesTennis() {
        ArrayList<PricesTable> tablePrices = new ArrayList<>();
        tablePrices.add(new PricesTable("Federer", 100));
        tablePrices.add(new PricesTable("Nadal", 100));
        tablePrices.add(new PricesTable("Djokovic", 100));

        return tablePrices;
    }

    public static int loadPointsBaseF1() {
        return 4;
    }

    public static ArrayList<PointsTable> loadTablePointsF1() {
        ArrayList<PointsTable> tablePoints = new ArrayList<>();
        tablePoints.add(new PointsTable("Ferrari", 2));
        tablePoints.add(new PointsTable("Mercedes", 2));

        return tablePoints;
    }

    public static int loadPriceBaseF1() {
        return 100;
    }

    public static ArrayList<PricesTable> loadTablePricesF1() {
        ArrayList<PricesTable> tablePrices = new ArrayList<>();
        tablePrices.add(new PricesTable("Ferrari", 50));
        tablePrices.add(new PricesTable("Mercedes", 50));

        return tablePrices;
    }

    public static int loadPointsBaseMotorcycling() {
        return 3;
    }

    public static ArrayList<PointsTable>  loadTablePointsMotorcycling() {
        ArrayList<PointsTable> tablePoints = new ArrayList<>();
        tablePoints.add(new PointsTable("Honda", 3));
        tablePoints.add(new PointsTable("Yamaha", 3));

        return tablePoints;
    }

    public static int loadPriceBaseMotorcycling() {
        return 100;
    }

    public static ArrayList<PricesTable> loadTablePricesMotorcycling() {
        ArrayList<PricesTable> tablePrices = new ArrayList<>();
        tablePrices.add(new PricesTable("Honda", 50));
        tablePrices.add(new PricesTable("Yamaha", 50));

        return tablePrices;
    }
}
