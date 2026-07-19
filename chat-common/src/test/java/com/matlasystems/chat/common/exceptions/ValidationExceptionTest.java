package com.matlasystems.chat.common.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationExceptionTest {

    @Test
    void shouldCreateValidationExceptionWithMessage() {

        ValidationException exception =
                new ValidationException("Invalid email");

        assertEquals(
                "Invalid email",
                exception.getMessage());

    }

    @Test
    void shouldExtendBusinessException() {

        ValidationException exception =
                new ValidationException("Invalid");

        assertInstanceOf(
                BusinessException.class,
                exception);

    }

    @Test
    void shouldAlsoExtendApplicationException() {

        ValidationException exception =
                new ValidationException("Invalid");

        assertInstanceOf(
                ApplicationException.class,
                exception);

    }

}