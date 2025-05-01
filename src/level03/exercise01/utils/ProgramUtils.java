package level03.exercise01.utils;

/**
 * PROGRAM: ProgramUtils
 * AUTHOR:  Diego Balaguer
 * DATE:    03/04/2025
 */

public class ProgramUtils {

    public static void validateIndex(int index, int totalArrayPos) throws IndexOutOfBoundsException {
        if (index < 0 || index >= totalArrayPos) {
            throw new IndexOutOfBoundsException("Index out of bounds for length");
        }
    }
}
