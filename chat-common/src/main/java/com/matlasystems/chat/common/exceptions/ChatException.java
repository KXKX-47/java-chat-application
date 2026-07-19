/**
 * Represents chat specific business failures
 */

package com.matlasystems.chat.common.exceptions;

public class ChatException
        extends BusinessException {

    public ChatException(String message) {
        super(message);
    }

}