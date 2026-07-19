package com.matlasystems.chat.common.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseExceptionTest {

    @Test
    void shouldCreateDatabaseException() {

        DatabaseException exception =
                new DatabaseException("Database unavailable.");

        assertNotNull(exception);

        assertEquals(
                "Database unavailable.",
                exception.getMessage());

    }

    @Test
    void shouldCreateDatabaseExceptionWithCause() {

        RuntimeException cause =
                new RuntimeException("Connection refused");

        DatabaseException exception =
                new DatabaseException(
                        "Database unavailable.",
                        cause);

        assertEquals(
                "Database unavailable.",
                exception.getMessage());

        assertEquals(
                cause,
                exception.getCause());

    }

    @Test
    void shouldExtendApplicationException() {

        DatabaseException exception =
                new DatabaseException("Error");

        assertTrue(
                exception instanceof ApplicationException);

    }

    @Test
    void shouldExtendRuntimeException() {

        DatabaseException exception =
                new DatabaseException("Error");

        assertTrue(
                exception instanceof RuntimeException);

    }

    @Test
    void shouldStoreOriginalCause() {

        IllegalStateException cause =
                new IllegalStateException("Database offline");

        DatabaseException exception =
                new DatabaseException(
                        "Unable to connect.",
                        cause);

        assertSame(
                cause,
                exception.getCause());

    }

}