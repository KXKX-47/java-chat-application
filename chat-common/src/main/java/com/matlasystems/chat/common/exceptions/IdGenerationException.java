package com.matlasystems.chat.common.exceptions;

public class IdGenerationException
        extends ApplicationException {

    public IdGenerationException(String message) {
        super(message);
    }

    public IdGenerationException(String message,
                                 Throwable cause) {
        super(message, cause);
    }

}