package level03.exercice01.exceptions;

public class UnknownEditorException extends Exception {
    public UnknownEditorException() {
        super("Unknown editor on the system");
    }
}

