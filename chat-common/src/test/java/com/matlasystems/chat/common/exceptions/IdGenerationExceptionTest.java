package com.matlasystems.chat.common.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdGenerationExceptionTest {

    @Test
    void shouldCreateExceptionWithMessage() {

        String message =
                "Unable to generate unique identifier.";

        IdGenerationException exception =
                new IdGenerationException(message);

        assertEquals(
                message,
                exception.getMessage());

    }

    @Test
    void shouldCreateExceptionWithCause() {

        Throwable cause =
                new RuntimeException("UUID generation failed.");

        IdGenerationException exception =
                new IdGenerationException(
                        "ID generation failed.",
                        cause);

        assertEquals(
                "ID generation failed.",
                exception.getMessage());

        assertEquals(
                cause,
                exception.getCause());

    }

    @Test
    void shouldExtendApplicationException() {

        IdGenerationException exception =
                new IdGenerationException("Error");

        assertInstanceOf(
                ApplicationException.class,
                exception);

    }

    @Test
    void shouldExtendRuntimeException() {

        IdGenerationException exception =
                new IdGenerationException("Error");

        assertInstanceOf(
                RuntimeException.class,
                exception);

    }

}