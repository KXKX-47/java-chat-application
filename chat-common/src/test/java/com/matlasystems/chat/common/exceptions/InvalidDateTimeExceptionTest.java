package com.matlasystems.chat.common.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvalidDateTimeExceptionTest {

    @Test
    void shouldCreateExceptionWithMessage() {

        InvalidDateTimeException exception =
                new InvalidDateTimeException(
                        "Invalid date format.");

        assertEquals(
                "Invalid date format.",
                exception.getMessage());

    }

    @Test
    void shouldCreateExceptionWithCause() {

        Throwable cause =
                new RuntimeException("Root Cause");

        InvalidDateTimeException exception =
                new InvalidDateTimeException(
                        "Date parsing failed.",
                        cause);

        assertEquals(
                "Date parsing failed.",
                exception.getMessage());

        assertEquals(
                cause,
                exception.getCause());

    }

    @Test
    void shouldExtendApplicationException() {

        InvalidDateTimeException exception =
                new InvalidDateTimeException("Error");

        assertInstanceOf(
                ApplicationException.class,
                exception);

    }

    @Test
    void shouldExtendRuntimeException() {

        InvalidDateTimeException exception =
                new InvalidDateTimeException("Error");

        assertInstanceOf(
                RuntimeException.class,
                exception);

    }

}