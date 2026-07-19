package com.matlasystems.chat.common.dto.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

class RefreshTokenResponseTest {

    @Test
    void shouldCreateEmptyRefreshTokenResponse() {
        RefreshTokenResponse response = new RefreshTokenResponse();

        assertNotNull(response);
    }

    @Test
    void shouldCreateRefreshTokenResponseUsingConstructor() {
        RefreshTokenResponse response = new RefreshTokenResponse(
                "ACCESS_TOKEN",
                "REFRESH_TOKEN",
                "Bearer"
        );

        assertEquals("ACCESS_TOKEN", response.getAccessToken());
        assertEquals("REFRESH_TOKEN", response.getRefreshToken());
        assertEquals("Bearer", response.getTokenType());
    }

    @Test
    void shouldSetRefreshTokenResponseFields() {
        RefreshTokenResponse response = new RefreshTokenResponse();

        response.setAccessToken("NEW_ACCESS_TOKEN");
        response.setRefreshToken("NEW_REFRESH_TOKEN");
        response.setTokenType("Bearer");

        assertEquals("NEW_ACCESS_TOKEN", response.getAccessToken());
        assertEquals("NEW_REFRESH_TOKEN", response.getRefreshToken());
        assertEquals("Bearer", response.getTokenType());
    }
}
