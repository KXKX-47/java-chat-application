package com.matlasystems.chat.common.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileStorageExceptionTest {

    @Test
    void shouldCreateExceptionWithMessage() {

        String message = "Unable to upload file.";

        FileStorageException exception =
                new FileStorageException(message);

        assertEquals(message, exception.getMessage());

    }

    @Test
    void shouldCreateExceptionWithCause() {

        Throwable cause =
                new RuntimeException("Disk Full");

        FileStorageException exception =
                new FileStorageException(
                        "Upload failed.",
                        cause);

        assertEquals(
                "Upload failed.",
                exception.getMessage());

        assertEquals(
                cause,
                exception.getCause());

    }

    @Test
    void shouldExtendApplicationException() {

        FileStorageException exception =
                new FileStorageException("Error");

        assertInstanceOf(
                ApplicationException.class,
                exception);

    }

    @Test
    void shouldExtendRuntimeException() {

        FileStorageException exception =
                new FileStorageException("Error");

        assertInstanceOf(
                RuntimeException.class,
                exception);

    }

}