package com.matlasystems.chat.common.constants;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class PasswordConstantsTest {

    @Test
    void shouldContainExpectedConstants() {

        assertEquals(8,
                PasswordConstants.MIN_PASSWORD_LENGTH);

        assertEquals(64,
                PasswordConstants.MAX_PASSWORD_LENGTH);

        assertEquals(1,
                PasswordConstants.MIN_UPPERCASE);

        assertEquals(1,
                PasswordConstants.MIN_LOWERCASE);

        assertEquals(1,
                PasswordConstants.MIN_DIGITS);

        assertEquals(1,
                PasswordConstants.MIN_SPECIAL_CHARACTERS);

        assertEquals(
                "!@#$%^&*()_+-=[]{}|;:,.<>?",
                PasswordConstants.SPECIAL_CHARACTERS);

        assertEquals(90,
                PasswordConstants.PASSWORD_EXPIRY_DAYS);

    }

    @Test
    void shouldHavePrivateConstructor() throws Exception {

        Constructor<PasswordConstants> constructor =
                PasswordConstants.class.getDeclaredConstructor();

        assertTrue(Modifier.isPrivate(constructor.getModifiers()));

        constructor.setAccessible(true);

        assertNotNull(constructor.newInstance());

    }

}