package com.matlasystems.chat.common.dto.common;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class ErrorResponseTest {

    @Test
    void shouldCreateDefaultErrorResponse() {

        ErrorResponse response = new ErrorResponse();

        assertEquals(0, response.getStatus());
        assertNull(response.getError());
        assertNull(response.getMessage());
        assertNull(response.getPath());
        assertNotNull(response.getTimestamp());

    }

    @Test
    void shouldCreateUsingConstructor() {

        ErrorResponse response =
                new ErrorResponse(
                        404,
                        "Not Found",
                        "User not found",
                        "/users/1");

        assertEquals(404, response.getStatus());
        assertEquals("Not Found", response.getError());
        assertEquals("User not found", response.getMessage());
        assertEquals("/users/1", response.getPath());
        assertNotNull(response.getTimestamp());

    }

    @Test
    void shouldSetValues() {

        ErrorResponse response = new ErrorResponse();

        LocalDateTime now = LocalDateTime.now();

        response.setStatus(500);
        response.setError("Internal Server Error");
        response.setMessage("Unexpected error");
        response.setPath("/api");
        response.setTimestamp(now);

        assertEquals(500, response.getStatus());
        assertEquals("Internal Server Error", response.getError());
        assertEquals("Unexpected error", response.getMessage());
        assertEquals("/api", response.getPath());
        assertEquals(now, response.getTimestamp());

    }

}