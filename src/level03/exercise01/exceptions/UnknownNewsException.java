package level03.exercise01.exceptions;

/**
 * PROGRAM: UnknownNewsException
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class UnknownNewsException extends Exception {
    public UnknownNewsException() {
        super("Unknown news on the system");
    }
}
