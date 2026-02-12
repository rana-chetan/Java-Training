package custom_exception;

// Custom exception class
public class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}
