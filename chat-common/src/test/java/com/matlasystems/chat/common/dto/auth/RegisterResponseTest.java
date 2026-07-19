package com.matlasystems.chat.common.dto.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

class RegisterResponseTest {

    @Test
    void shouldCreateEmptyRegisterResponse() {
        RegisterResponse response = new RegisterResponse();

        assertNotNull(response);
    }

    @Test
    void shouldCreateRegisterResponseUsingConstructor() {
        RegisterResponse response = new RegisterResponse(
                1L,
                "jane",
                "Jane",
                "Doe",
                "jane@example.com",
                "ACTIVE",
                "Registration successful"
        );

        assertEquals(1L, response.getId());
        assertEquals("jane", response.getUsername());
        assertEquals("Jane", response.getFirstName());
        assertEquals("Doe", response.getLastName());
        assertEquals("jane@example.com", response.getEmail());
        assertEquals("ACTIVE", response.getStatus());
        assertEquals("Registration successful", response.getMessage());
    }

    @Test
    void shouldSetRegisterResponseFields() {
        RegisterResponse response = new RegisterResponse();

        response.setId(2L);
        response.setUsername("john");
        response.setFirstName("John");
        response.setLastName("Smith");
        response.setEmail("john@example.com");
        response.setStatus("PENDING");
        response.setMessage("Confirmation required");

        assertEquals(2L, response.getId());
        assertEquals("john", response.getUsername());
        assertEquals("John", response.getFirstName());
        assertEquals("Smith", response.getLastName());
        assertEquals("john@example.com", response.getEmail());
        assertEquals("PENDING", response.getStatus());
        assertEquals("Confirmation required", response.getMessage());
    }
}
