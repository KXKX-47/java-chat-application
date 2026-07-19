package com.matlasystems.chat.common.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordExceptionTest {

    @Test
    void shouldCreatePasswordExceptionWithMessage() {

        PasswordException exception =
                new PasswordException("Weak password");

        assertEquals(
                "Weak password",
                exception.getMessage());

    }

    @Test
    void shouldCreatePasswordExceptionWithCause() {

        RuntimeException cause =
                new RuntimeException("Encryption failed");

        PasswordException exception =
                new PasswordException(
                        "Weak password",
                        cause);

        assertEquals(
                "Weak password",
                exception.getMessage());

        assertEquals(
                cause,
                exception.getCause());

    }

    @Test
    void shouldExtendApplicationException() {

        PasswordException exception =
                new PasswordException("Error");

        assertInstanceOf(
                ApplicationException.class,
                exception);

    }

}