package com.matlasystems.chat.common.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorizationExceptionTest {

    @Test
    void shouldCreateAuthorizationException() {

        String message = "Access denied.";

        AuthorizationException exception =
                new AuthorizationException(message);

        assertEquals(message, exception.getMessage());

    }

    @Test
    void shouldExtendApplicationException() {

        AuthorizationException exception =
                new AuthorizationException("Not authorized.");

        assertInstanceOf(ApplicationException.class, exception);

    }

    @Test
    void shouldAlsoExtendRuntimeException() {

        AuthorizationException exception =
                new AuthorizationException("Not authorized.");

        assertInstanceOf(RuntimeException.class, exception);

    }

}