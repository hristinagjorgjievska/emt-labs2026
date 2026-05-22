package mk.ukim.finki.emt.labb1.model.exceptions;

public class HostNotFoundException extends RuntimeException {
    public HostNotFoundException(String message) {
        super(message);
    }
}
