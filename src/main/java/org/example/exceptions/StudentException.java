package org.example.exceptions;

public class StudentException extends RuntimeException {
    private final String message = "No such student in DB!";

    public String getMessage() {
        return this.message;
    }
}
