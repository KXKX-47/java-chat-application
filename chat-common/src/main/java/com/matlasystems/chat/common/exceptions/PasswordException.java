package com.matlasystems.chat.common.exceptions;

public class PasswordException extends ApplicationException {

    public PasswordException(String message) {
        super(message);
    }

    public PasswordException(String message,
                               Throwable cause) {
        super(message, cause);
    }

}