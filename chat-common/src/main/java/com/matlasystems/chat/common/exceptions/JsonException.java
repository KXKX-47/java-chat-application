package com.matlasystems.chat.common.exceptions;

public class JsonException extends ApplicationException {

    public JsonException(String message) {
        super(message);
    }

    public JsonException(String message,
                         Throwable cause) {
        super(message, cause);
    }

}