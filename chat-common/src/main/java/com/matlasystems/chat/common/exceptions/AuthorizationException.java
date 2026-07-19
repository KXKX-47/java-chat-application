/**
 * Thrown when the authenticated user lacks permission
 */

package com.matlasystems.chat.common.exceptions;

public class AuthorizationException
        extends ApplicationException {

    public AuthorizationException(String message) {
        super(message);
    }

}