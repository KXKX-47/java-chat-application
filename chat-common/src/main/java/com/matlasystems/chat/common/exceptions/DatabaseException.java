/**
 * Represents database related failures
 */

package com.matlasystems.chat.common.exceptions;

public class DatabaseException
        extends ApplicationException {

    public DatabaseException(String message) {
        super(message);
    }

    public DatabaseException(String message,
                             Throwable cause) {
        super(message, cause);
    }

}