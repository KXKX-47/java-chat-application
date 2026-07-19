package com.matlasystems.chat.common.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonExceptionTest {

    @Test
    void shouldCreateExceptionWithMessage() {

        JsonException exception =
                new JsonException(
                        "JSON serialization failed.");

        assertEquals(
                "JSON serialization failed.",
                exception.getMessage());

    }

    @Test
    void shouldCreateExceptionWithCause() {

        Throwable cause =
                new RuntimeException("Jackson Error");

        JsonException exception =
                new JsonException(
                        "Unable to parse JSON.",
                        cause);

        assertEquals(
                "Unable to parse JSON.",
                exception.getMessage());

        assertEquals(
                cause,
                exception.getCause());

    }

    @Test
    void shouldExtendApplicationException() {

        JsonException exception =
                new JsonException("JSON Error");

        assertInstanceOf(
                ApplicationException.class,
                exception);

    }

    @Test
    void shouldExtendRuntimeException() {

        JsonException exception =
                new JsonException("JSON Error");

        assertInstanceOf(
                RuntimeException.class,
                exception);

    }

}