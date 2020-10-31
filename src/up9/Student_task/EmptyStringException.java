package up9.Student_task;

import java.io.IOException;

/**
 * Исключение пустой строки EmptyStringException, используется в классах:
 * Student {@link Student}, LabClass {@link LabClass}
 */
public class EmptyStringException extends IOException {

    public EmptyStringException(String message) {
        super(message);
    }
}
