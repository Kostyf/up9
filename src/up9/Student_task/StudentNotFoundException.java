package up9.Student_task;
import java.io.IOException;

public class StudentNotFoundException extends IOException {
    public StudentNotFoundException(String message) {
        super(message);
    }
}