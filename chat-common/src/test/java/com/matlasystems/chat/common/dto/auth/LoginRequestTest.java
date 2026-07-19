package com.matlasystems.chat.common.dto.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

class LoginRequestTest {

    @Test
    void shouldCreateEmptyLoginRequest() {

        LoginRequest request = new LoginRequest();

        assertNotNull(request);

    }

    @Test
    void shouldCreateLoginRequestUsingConstructor() {

        LoginRequest request =
                new LoginRequest(
                        "john@test.com",
                        "Password123!"
                );

        assertEquals(
                "john@test.com",
                request.getEmail());

        assertEquals(
                "Password123!",
                request.getPassword());

    }

    @Test
    void shouldSetEmail() {

        LoginRequest request = new LoginRequest();

        request.setEmail("john@test.com");

        assertEquals(
                "john@test.com",
                request.getEmail());

    }

    @Test
    void shouldSetPassword() {

        LoginRequest request = new LoginRequest();

        request.setPassword("Password123!");

        assertEquals(
                "Password123!",
                request.getPassword());

    }

    @Test
    void shouldUpdateFields() {

        LoginRequest request = new LoginRequest();

        request.setEmail("mary@test.com");
        request.setPassword("Secret123");

        assertEquals(
                "mary@test.com",
                request.getEmail());

        assertEquals(
                "Secret123",
                request.getPassword());

    }

    

    @Test
    void shouldGenerateToString() {

        LoginRequest request =
                new LoginRequest(
                        "john@test.com",
                        "Password123!"
                );

        assertNotNull(request.toString());

    }

}