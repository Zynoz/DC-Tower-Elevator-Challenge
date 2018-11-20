package model;

/**
 * @author Maximilian Moser
 * This is the only exception that can be thrown by the application.
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public class ElevatorException extends Exception {

    public ElevatorException() {
        super();
    }

    public ElevatorException(String message) {
        super(message);
    }

    public ElevatorException(String message, Throwable cause) {
        super(message, cause);
    }

    public ElevatorException(Throwable cause) {
        super(cause);
    }

    protected ElevatorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}