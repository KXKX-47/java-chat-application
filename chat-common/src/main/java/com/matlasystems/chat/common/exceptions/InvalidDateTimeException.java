/**
 * Represents invalid date/time values
 */

package com.matlasystems.chat.common.exceptions;

public class InvalidDateTimeException extends BusinessException {

    public InvalidDateTimeException(String message) {
        super(message);
    }

    public InvalidDateTimeException(String message,
                                    Throwable cause) {
        super(message, cause);
    }

}