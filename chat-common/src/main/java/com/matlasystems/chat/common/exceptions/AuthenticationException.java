/*
Thrown when authentication fails
 */

package com.matlasystems.chat.common.exceptions;

public class AuthenticationException
        extends ApplicationException {

    public AuthenticationException(String message) {
        super(message);
    }

}