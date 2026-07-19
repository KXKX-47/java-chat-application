package com.matlasystems.chat.common.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NetworkExceptionTest {

    @Test
    void shouldCreateNetworkExceptionWithMessage() {

        NetworkException exception =
                new NetworkException("Network unavailable");

        assertEquals(
                "Network unavailable",
                exception.getMessage());

    }

    @Test
    void shouldCreateNetworkExceptionWithCause() {

        RuntimeException cause =
                new RuntimeException("Socket timeout");

        NetworkException exception =
                new NetworkException(
                        "Network unavailable",
                        cause);

        assertEquals(
                "Network unavailable",
                exception.getMessage());

        assertEquals(
                cause,
                exception.getCause());

    }

    @Test
    void shouldExtendApplicationException() {

        NetworkException exception =
                new NetworkException("Error");

        assertInstanceOf(
                ApplicationException.class,
                exception);

    }

}