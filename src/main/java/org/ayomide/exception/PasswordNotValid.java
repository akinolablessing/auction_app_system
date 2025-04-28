package org.ayomide.exception;

public class PasswordNotValid extends RuntimeException {
    public PasswordNotValid(String message) {
        super(message);
    }
}
