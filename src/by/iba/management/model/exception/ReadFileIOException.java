package by.iba.management.model.exception;

import java.io.IOException;

public class ReadFileIOException extends IOException {
    public ReadFileIOException() {
        super();
    }

    public ReadFileIOException(String message) {
        super(message);
    }

    public ReadFileIOException(String message, Throwable cause) {
        super(message, cause);
    }

}
