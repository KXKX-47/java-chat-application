package com.matlasystems.chat.common.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateResourceExceptionTest {

    @Test
    void shouldCreateExceptionWithMessage() {

        String message = "User already exists.";

        DuplicateResourceException exception =
                new DuplicateResourceException(message);

        assertEquals(message, exception.getMessage());

    }

    @Test
    void shouldExtendBusinessException() {

        DuplicateResourceException exception =
                new DuplicateResourceException("Duplicate.");

        assertInstanceOf(
                BusinessException.class,
                exception);

    }

    @Test
    void shouldExtendApplicationException() {

        DuplicateResourceException exception =
                new DuplicateResourceException("Duplicate.");

        assertInstanceOf(
                ApplicationException.class,
                exception);

    }

    @Test
    void shouldExtendRuntimeException() {

        DuplicateResourceException exception =
                new DuplicateResourceException("Duplicate.");

        assertInstanceOf(
                RuntimeException.class,
                exception);

    }

}