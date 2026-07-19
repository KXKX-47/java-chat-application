package com.matlasystems.chat.common.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthenticationExceptionTest {

    @Test
    void shouldCreateAuthenticationException() {

        String message = "Invalid username or password.";

        AuthenticationException exception =
                new AuthenticationException(message);

        assertEquals(message, exception.getMessage());

    }

    @Test
    void shouldExtendApplicationException() {

        AuthenticationException exception =
                new AuthenticationException("Authentication failed.");

        assertInstanceOf(ApplicationException.class, exception);

    }

    @Test
    void shouldAlsoExtendRuntimeException() {

        AuthenticationException exception =
                new AuthenticationException("Authentication failed.");

        assertInstanceOf(RuntimeException.class, exception);

    }

}