/*
Base exception for every custom exception
 */

package com.matlasystems.chat.common.exceptions;

public class ApplicationException extends RuntimeException {

    public ApplicationException(String message) {

        super(message);
    }

    public ApplicationException(String message, Throwable cause){

        super(message, cause);
    }
}

