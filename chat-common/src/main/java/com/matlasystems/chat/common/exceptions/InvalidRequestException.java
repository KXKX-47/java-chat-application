/**
 * Thrown when a request is malformed or inconsistent
 */

package com.matlasystems.chat.common.exceptions;

public class InvalidRequestException
        extends ApplicationException {

    public InvalidRequestException(String message) {
        super(message);
    }

    public InvalidRequestException(String message,
                                   Throwable cause) {
        super(message, cause);
    }

}