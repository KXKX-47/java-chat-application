/*
Sends an existing refresh token to the server to request anew access token when the current one 
expires


*/
package com.matlasystems.chat.common.dto.auth;

public class RefreshTokenRequest {

    private String refreshToken;

    public RefreshTokenRequest() {

    }

    public RefreshTokenRequest(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}