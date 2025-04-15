package level03.exercice01.utils;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * PROGRAM: Utils
 * AUTHOR:  Diego Balaguer
 * DATE:    19/02/2025
 * <p>
 * PUBLIC METHODS AND VARIABLES:
 * <p>
 * random(min, max): Returns an integer between the range specified.
 * isNumber(text): Given a text, returns a boolean (true, false).
 * readKeystrokesXXX(Scanner, message): Shows a message and returns the given value turned into
 * Int, Double, String or Long depending on the name of the function. If it is string, it is possible to return "".
 * valueXXX(Scanner, message): Shows a message and returns the given value turned into Int, Double,
 * String or Long depending on the name of the function. In this function is not possible to be given an empty value.
 * <p>
 * USAGE:
 * <p>
 * To import this class into the necessary projects, we can do it in two ways:
 * <p>
 * **  import Utils; or import utils.*;
 * <p>
 * This way, we have to call the methods from another class like this:
 * Utils.random(1, 5);
 * <p>
 * **  import static Utils.*;
 * <p>
 * This way, we have to call the methods from another class like this:
 * random(1, 5);
 * <p>
 * Doing it like the first example, we have visual info that the method is into another class and it can help us.
 * Doing it like the second example, the code is more compact.
 * Choose as needed.
 */

public class Utils {

    private static Scanner sc = new Scanner(System.in);

    public static void closeScanner() {
        sc.close();
    }

    // Functions valueXX analyze that the inputs are not empty
    // In functions readKeystrokesXX you can press enter straightaway, but the numbers will be 0

    public static String valueString(String message) {
        // Only controlling the value emptiness
        do {
            try {
                return enterValueString(message);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e);
            }
        } while (true);
    }

    private static String enterValueString(String message) {
        String resp = readKeystrokesString(message);
        if (resp.isBlank()) {
            throw new IllegalArgumentException("Empty inputs are wrong.");
        } else {
            return resp;
        }
    }

    public static char valueChar(String message) {

        do {
            String resp = valueString(message);
            try {
                lenghtChar(resp.length());
                return resp.charAt(0);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e);
            }
        } while (true);
    }

    private static void lenghtChar(int length) throws IllegalArgumentException {

        if (length != 1) {
            throw new IllegalArgumentException("Length must be 1 character.");
        }
    }

    public static byte valueByte(String message) {

        do {
            String resp = valueString(message);
            try {
                return Byte.parseByte(resp);
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Error: " + e);
            }
        } while (true);
    }

    public static int valueIntWithoutException(String message) {

        do {
            String resp = valueString(message);
            if (isNumber(resp)) {
                return Integer.parseInt(resp);
            }
        } while (true);
    }

    public static int valueInt(String message) {

        do {
            String resp = valueString(message);
            try {
                return Integer.parseInt(resp);
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Error: " + e);
            }
        } while (true);
    }

    public static long valueLong(String message) {

        do {
            String resp = valueString(message);
            try {
                return Long.parseLong(resp);
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Error: " + e);
            }
        } while (true);
    }

    public static double valueDouble(String message) {

        do {
            String resp = valueString(message);
            try {
                return Double.parseDouble(resp);
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Error: " + e);
            }
        } while (true);
    }

    public static float valueFloat(String message) {

        do {
            String resp = valueString(message);
            try {
                return Float.parseFloat(resp);
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Error: " + e);
            }
        } while (true);
    }

    public static boolean valueBoolean(String message) {

        do {
            char resp = Character.toUpperCase(valueChar(message));
            try {
                return calculateValueBoolean(resp);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e);
            }
        } while (true);
    }

    private static boolean calculateValueBoolean(char valueBoolean) {

        return switch (valueBoolean) {
            case 'Y', 'T', 'S' -> true;
            case 'F', 'N' -> false;
            default -> throw new IllegalArgumentException("Only valid answers: 'S', 'N', 'Y', 'N', 'T', 'F'.");
        };
    }

    public static String readKeystrokesString(String message) {

        System.out.println(message);
        return sc.nextLine();
    }

    public static int readKeystrokesInt(String message) {

        do {
            String resp = valueString(message);

            resp = resp.isEmpty() ? "0" : resp;
            if (isNumber(resp)) {
                return Integer.parseInt(resp);
            }
        } while (true);

    }

    public static double readKeystrokesDouble(String message) {

        do {
            String resp = valueString(message);

            resp = resp.isEmpty() ? "0" : resp;
            if (isNumber(resp)) {
                return Double.parseDouble(resp);
            }
        } while (true);

    }

    public static boolean isNumber(String resp) {
        if (resp.matches("\\d+")) {
            // If it is a number, return true
            return true;
        }
        return false;
    }

    public static int random(int num_min, int num_max) {
        // Generate a random number
        Random random = new Random();
        return random.nextInt(num_min, num_max + 1);
    }

    public static String generateRandomString(int quantity) {

        String passwd = "";
        char letter = 0;

        for (int i = 0; i < quantity; i++) {
            // Generating a number between 1 and 3
            // 1 -> between A y Z
            // 2 -> between a y z
            // 3 -> between 0 y 9
            int type = Utils.random(1, 3);
            switch (type) {
                case 1 -> letter = (char) random('A', 'Z');
                case 2 -> letter = (char) random('a', 'z');
                case 3 -> letter = (char) random('0', '9');
            }
            passwd += letter;
        }
        return passwd;
    }

    public static String generateRandomStringCapsNums(int quantity) {

        String passwd = "";
        char letter = 0;

        for (int i = 0; i < quantity; i++) {
            int type = Utils.random(1, 2);
            switch (type) {
                case 1 -> letter = (char) random('A', 'Z');
                //case 2 -> letter = (char) random('a', 'z');
                case 2 -> letter = (char) random('0', '9');
            }
            passwd += letter;
        }
        return passwd;
    }

    public static String formatToChars(String text, int lengthString) {

        text = (text == null || text.isEmpty()) ? "" : text;
        lengthString = (lengthString <= 0) ? text.length() : lengthString;

        if (text.length() > lengthString) {
            return text.substring(0, lengthString); // Truncate if it is too long.
        } else {
            return String.format("%-" + lengthString + "s", text); // Fill with spaces if it is short.
        }
    }

    public static void validateIndex(int index, int totalArrayPos) throws IndexOutOfBoundsException {
        if (index < 0 || index >= totalArrayPos) {
            throw new IndexOutOfBoundsException("Index out of bounds for length");
        }
    }
}
