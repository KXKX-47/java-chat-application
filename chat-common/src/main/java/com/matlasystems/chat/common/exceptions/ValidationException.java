/*
Thrown when business validation fails
 */

package com.matlasystems.chat.common.exceptions;

public class ValidationException extends BusinessException {

    public ValidationException(String message) {
        super(message);
    }

    public ValidationException(String message,
                               Throwable cause) {

        super(message);

        initCause(cause);

    }

}