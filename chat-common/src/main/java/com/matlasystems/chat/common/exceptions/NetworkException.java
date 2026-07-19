package com.matlasystems.chat.common.exceptions;

public class NetworkException extends ApplicationException {

    public NetworkException(String message) {
        super(message);
    }

    public NetworkException(String message,
                            Throwable cause) {
        super(message, cause);
    }

}