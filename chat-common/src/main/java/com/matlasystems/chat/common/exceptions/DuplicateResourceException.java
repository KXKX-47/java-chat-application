/*
Thrown when attempting to create an existing resource
 */

package com.matlasystems.chat.common.exceptions;

public class DuplicateResourceException
        extends BusinessException {

    public DuplicateResourceException(String message) {
        super(message);
    }

}