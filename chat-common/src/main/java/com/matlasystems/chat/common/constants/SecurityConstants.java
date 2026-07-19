/*
Stores security related constants used by the applications security layer
*/


package com.matlasystems.chat.common.constants;

public final class SecurityConstants {

    private SecurityConstants() {

    }

    public static final String TOKEN_PREFIX = "Bearer ";

    public static final String AUTHORIZATION = "Authorization";

    public static final String JWT_SECRET = "CHANGE_THIS_SECRET";

    public static final long ACCESS_TOKEN_EXPIRATION = 3600000L;

    public static final long REFRESH_TOKEN_EXPIRATION = 604800000L;
}