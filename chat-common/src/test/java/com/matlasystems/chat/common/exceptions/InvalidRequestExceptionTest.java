package com.matlasystems.chat.common.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvalidRequestExceptionTest {

    @Test
    void shouldCreateExceptionWithMessage() {

        InvalidRequestException exception =
                new InvalidRequestException(
                        "Request is invalid.");

        assertEquals(
                "Request is invalid.",
                exception.getMessage());

    }

    @Test
    void shouldCreateExceptionWithCause() {

        Throwable cause =
                new RuntimeException("Root Cause");

        InvalidRequestException exception =
                new InvalidRequestException(
                        "Malformed request.",
                        cause);

        assertEquals(
                "Malformed request.",
                exception.getMessage());

        assertEquals(
                cause,
                exception.getCause());

    }

    @Test
    void shouldExtendApplicationException() {

        InvalidRequestException exception =
                new InvalidRequestException("Error");

        assertInstanceOf(
                ApplicationException.class,
                exception);

    }

    @Test
    void shouldExtendRuntimeException() {

        InvalidRequestException exception =
                new InvalidRequestException("Error");

        assertInstanceOf(
                RuntimeException.class,
                exception);

    }

}