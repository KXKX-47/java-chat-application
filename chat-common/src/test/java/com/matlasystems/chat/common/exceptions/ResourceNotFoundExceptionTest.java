package com.matlasystems.chat.common.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResourceNotFoundExceptionTest {

    @Test
    void shouldCreateResourceNotFoundException() {

        ResourceNotFoundException exception =
                new ResourceNotFoundException("User not found");

        assertEquals(
                "User not found",
                exception.getMessage());

    }

    @Test
    void shouldExtendApplicationException() {

        ResourceNotFoundException exception =
                new ResourceNotFoundException("Error");

        assertInstanceOf(
                ApplicationException.class,
                exception);

    }

}