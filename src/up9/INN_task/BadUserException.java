package up9.INN_task;
import java.io.IOException;

public class BadUserException extends IOException {

    public BadUserException(String message) {
        super(message);
    }
}