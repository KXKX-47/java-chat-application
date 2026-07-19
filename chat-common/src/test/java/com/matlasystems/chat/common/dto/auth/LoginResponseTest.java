package com.matlasystems.chat.common.dto.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

class LoginResponseTest {

    @Test
    void shouldCreateEmptyLoginResponse() {

        LoginResponse response = new LoginResponse();

        assertNotNull(response);

    }

    @Test
    void shouldCreateLoginResponseUsingConstructor() {

        LoginResponse response =
                new LoginResponse(
                        "ACCESS_TOKEN",
                        "REFRESH_TOKEN",
                        "Bearer"
                );

        assertEquals(
                "ACCESS_TOKEN",
                response.getAccessToken());

        assertEquals(
                "REFRESH_TOKEN",
                response.getRefreshToken());

        assertEquals(
                "Bearer",
                response.getTokenType());

    }

    @Test
    void shouldSetAccessToken() {

        LoginResponse response = new LoginResponse();

        response.setAccessToken("TOKEN");

        assertEquals(
                "TOKEN",
                response.getAccessToken());

    }

    @Test
    void shouldSetRefreshToken() {

        LoginResponse response = new LoginResponse();

        response.setRefreshToken("REFRESH");

        assertEquals(
                "REFRESH",
                response.getRefreshToken());

    }

    @Test
    void shouldSetTokenType() {

        LoginResponse response = new LoginResponse();

        response.setTokenType("JWT");

        assertEquals(
                "JWT",
                response.getTokenType());

    }

    @Test
    void shouldUseBearerAsDefaultTokenType() {

        LoginResponse response = new LoginResponse();

        assertEquals(
                "Bearer",
                response.getTokenType());

    }

}