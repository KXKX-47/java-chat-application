package com.matlasystems.chat.common.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaginationExceptionTest {

    @Test
    void shouldCreatePaginationExceptionWithMessage() {

        PaginationException exception =
                new PaginationException("Invalid page number");

        assertEquals(
                "Invalid page number",
                exception.getMessage());

    }

    @Test
    void shouldCreatePaginationExceptionWithCause() {

        RuntimeException cause =
                new RuntimeException("Negative page");

        PaginationException exception =
                new PaginationException(
                        "Invalid page number",
                        cause);

        assertEquals(
                "Invalid page number",
                exception.getMessage());

        assertEquals(
                cause,
                exception.getCause());

    }

    @Test
    void shouldExtendApplicationException() {

        PaginationException exception =
                new PaginationException("Error");

        assertInstanceOf(
                ApplicationException.class,
                exception);

    }

}