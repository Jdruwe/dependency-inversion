package be.jeroendruwe.spring.dependencyinversion.exception;

public class InversionException extends RuntimeException {

    public InversionException(String message) {
        super(message);
    }
}
