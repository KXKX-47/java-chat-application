package com.matlasystems.chat.common.dto.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

class RefreshTokenRequestTest {

    @Test
    void shouldCreateEmptyRefreshTokenRequest() {

        RefreshTokenRequest request =
                new RefreshTokenRequest();

        assertNotNull(request);

    }

    @Test
    void shouldCreateRefreshTokenRequestUsingConstructor() {

        RefreshTokenRequest request =
                new RefreshTokenRequest(
                        "REFRESH_TOKEN"
                );

        assertEquals(
                "REFRESH_TOKEN",
                request.getRefreshToken());

    }

    @Test
    void shouldSetRefreshToken() {

        RefreshTokenRequest request =
                new RefreshTokenRequest();

        request.setRefreshToken("NEW_REFRESH");

        assertEquals(
                "NEW_REFRESH",
                request.getRefreshToken());

    }

    

}