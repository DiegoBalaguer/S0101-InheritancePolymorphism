package level03.exercice01.exceptions;

public class UnknownNewsException extends Exception {
    public UnknownNewsException() {
        super("Unknown news on the system");
    }
}
