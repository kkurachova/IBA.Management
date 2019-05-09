package by.iba.management.model.exception;

import java.io.IOException;

public class FileNotFoundExceptionM extends IOException {
    public FileNotFoundExceptionM() {
        super();
    }

    public FileNotFoundExceptionM(String message) {
        super(message);
    }

    public FileNotFoundExceptionM(String message, Throwable cause) {
        super(message, cause);
    }

}
