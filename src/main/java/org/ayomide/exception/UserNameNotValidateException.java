package org.ayomide.exception;

public class UserNameNotValidateException extends RuntimeException {
    public UserNameNotValidateException(String message) {
        super(message);
    }
}
