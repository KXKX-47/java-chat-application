/*
Thrown when a requested resource does not exist
 */


package com.matlasystems.chat.common.exceptions;

public class ResourceNotFoundException
        extends ApplicationException {

    public ResourceNotFoundException(String message) {
        super(message);
    }

}