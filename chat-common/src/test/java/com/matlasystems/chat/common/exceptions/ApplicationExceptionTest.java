package com.matlasystems.chat.common.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationExceptionTest {

    @Test
    void shouldCreateApplicationExceptionWithMessage() {

        String message = "Application error occurred.";

        ApplicationException exception =
                new ApplicationException(message);

        assertEquals(message, exception.getMessage());

    }

    @Test
    void shouldCreateApplicationExceptionWithMessageAndCause() {

        String message = "Application error occurred.";

        RuntimeException cause =
                new RuntimeException("Database unavailable.");

        ApplicationException exception =
                new ApplicationException(message, cause);

        assertEquals(message, exception.getMessage());

        assertEquals(cause, exception.getCause());

    }

    @Test
    void shouldExtendRuntimeException() {

        ApplicationException exception =
                new ApplicationException("Error");

        assertInstanceOf(RuntimeException.class, exception);

    }

}