package level03.exercise01.exceptions;

/**
 * PROGRAM: UnknownEditorException
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class UnknownEditorException extends Exception {
    public UnknownEditorException() {
        super("Unknown editor on the system");
    }
}
