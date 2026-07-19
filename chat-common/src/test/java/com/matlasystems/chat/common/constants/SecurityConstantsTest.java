package com.matlasystems.chat.common.constants;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class SecurityConstantsTest {

    @Test
    void shouldContainExpectedConstants() {

        assertEquals(
                "Bearer ",
                SecurityConstants.TOKEN_PREFIX);

        assertEquals(
                "Authorization",
                SecurityConstants.AUTHORIZATION);

        assertEquals(
                "CHANGE_THIS_SECRET",
                SecurityConstants.JWT_SECRET);

        assertEquals(
                3600000L,
                SecurityConstants.ACCESS_TOKEN_EXPIRATION);

        assertEquals(
                604800000L,
                SecurityConstants.REFRESH_TOKEN_EXPIRATION);

    }

    @Test
    void shouldHavePrivateConstructor() throws Exception {

        Constructor<SecurityConstants> constructor =
                SecurityConstants.class.getDeclaredConstructor();

        assertTrue(Modifier.isPrivate(constructor.getModifiers()));

        constructor.setAccessible(true);

        assertNotNull(constructor.newInstance());

    }

}