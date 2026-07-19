/**
 * Thrown for file upload and storage failures
 */

package com.matlasystems.chat.common.exceptions;

public class FileStorageException
        extends ApplicationException {

    public FileStorageException(String message) {
        super(message);
    }

    public FileStorageException(String message,
                                Throwable cause) {
        super(message, cause);
    }

}