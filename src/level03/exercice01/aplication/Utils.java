package level03.exercice01.aplication;

import java.util.Random;
import java.util.Scanner;

/**
 * PROGRAM: level03.Utils
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
 */

public class Utils {

    private static
    Scanner sc = new Scanner(System.in);

    public static void closeScanner() {
        sc.close();
    }

    // Functions valueXX analyze that the inputs are not empty
    public static String valueString(String message) {
        // Only controlling the value emptiness

        do {
            String resp = readKeystrokesString(message);
            if (resp.isBlank()) {
                System.out.println("Empty inputs are wrong.");
            } else {
                return resp;
            }
        } while (true);
    }

    public static int valueInt(String message) {

        do {
            String resp = readKeystrokesString(message);
            if (resp.isBlank()) {
                System.out.println("Empty inputs are wrong.");
            } else if (isNumber(resp)) {
                return Integer.parseInt(resp);
            } else System.out.println("Inputs are wrong.");
        } while (true);
    }

    public static long valueLong(String message) {

        do {
            String resp = readKeystrokesString(message);
            if (resp.isBlank()) {
                System.out.println("Empty inputs are wrong.");
            } else if (isNumber(resp)) {
                return Long.parseLong(resp);
            } else System.out.println("Inputs are wrong.");
        } while (true);
    }

    public static double valueDouble(String message) {

        do {
            String resp = readKeystrokesString(message);
            if (resp.isBlank()) {
                System.out.println("Empty inputs are wrong.");
            } else if (isNumber(resp)) {
                return Double.parseDouble(resp);
            } else System.out.println("Inputs are wrong.");
        } while (true);
    }

    public static String readKeystrokesString(String message) {
        System.out.println(message);
        String resp = sc.nextLine();

        return resp;
    }

    public static int readKeystrokesInt(String message) {

        do {
            String resp = valueString(message);

            resp = resp.isEmpty() ? "0" : resp;
            if (isNumber(resp)) {
                return Integer.parseInt(resp);
            } else {
                System.out.println("Inputs are wrong.");
            }
        } while (true);
   }

    public static double readKeystrokesDouble(String message) {

        do {
            String resp = valueString(message);

            resp = resp.isEmpty() ? "0" : resp;
            if (isNumber(resp)) {
                return Double.parseDouble(resp);
            } else {
                System.out.println("Inputs are wrong.");
            }
        } while (true);
    }

    public static boolean isNumber(String resp) {
        if (resp.matches("\\d+")) {
            return true;
        }
        return false;
    }

    public static void validateIndex(int index, int totalArrayPos) throws IndexOutOfBoundsException {
        if (index < 0 || index >= totalArrayPos) {
            throw new IndexOutOfBoundsException("Index out of bounds for length");
        }
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

    public static String formatedToChars(String text, int lengthString) {

        text = (text == null || text.isEmpty()) ? "" : text;
        lengthString = (lengthString <= 0) ? text.length() : lengthString;

        if (text.length() > lengthString) {
            return text.substring(0, lengthString); // Truncate if it is too long.
        } else {
            return String.format("%-" + lengthString + "s", text); // Fill with spaces if it is short.
        }
    }
}
