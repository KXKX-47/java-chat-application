/*
Represents business rule violations
 */

package com.matlasystems.chat.common.exceptions;

public class BusinessException extends ApplicationException {

    public BusinessException(String message) {

        super(message);

    }

    public BusinessException(String message,
                             Throwable cause) {

        super(message, cause);

    }

}