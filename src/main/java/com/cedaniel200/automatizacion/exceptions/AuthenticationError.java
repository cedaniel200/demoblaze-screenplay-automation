package com.cedaniel200.automatizacion.exceptions;

public class AuthenticationError extends AssertionError {
    public static final String MESSAGE_FAILED_AUTHENTICATION = "Authentication failed";

    public AuthenticationError(String message, Throwable cause) {
        super(message, cause);
    }
}
