package com.matlasystems.chat.common.dto.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

class RegisterRequestTest {

    @Test
    void shouldCreateEmptyRegisterRequest() {
        RegisterRequest request = new RegisterRequest();

        assertNotNull(request);
    }

    @Test
    void shouldCreateRegisterRequestUsingConstructor() {
        RegisterRequest request = new RegisterRequest(
                "jane",
                "Jane",
                "Doe",
                "jane@example.com",
                "Password123!",
                "Password123!"
        );

        assertEquals("jane", request.getUsername());
        assertEquals("Jane", request.getFirstName());
        assertEquals("Doe", request.getLastName());
        assertEquals("jane@example.com", request.getEmail());
        assertEquals("Password123!", request.getPassword());
        assertEquals("Password123!", request.getConfirmPassword());
    }

    @Test
    void shouldSetRegisterRequestFields() {
        RegisterRequest request = new RegisterRequest();

        request.setUsername("john");
        request.setFirstName("John");
        request.setLastName("Smith");
        request.setEmail("john@example.com");
        request.setPassword("NewPassword123!");
        request.setConfirmPassword("NewPassword123!");

        assertEquals("john", request.getUsername());
        assertEquals("John", request.getFirstName());
        assertEquals("Smith", request.getLastName());
        assertEquals("john@example.com", request.getEmail());
        assertEquals("NewPassword123!", request.getPassword());
        assertEquals("NewPassword123!", request.getConfirmPassword());
    }
}
