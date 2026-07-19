package com.matlasystems.chat.common.constants;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class RegexConstantsTest {

    @Test
    void shouldContainExpectedRegexPatterns() {

        assertEquals(
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$",
                RegexConstants.EMAIL);

        assertEquals(
                "^[A-Za-z0-9_]{3,30}$",
                RegexConstants.USERNAME);

        assertEquals(
                "^\\+?[0-9]{10,15}$",
                RegexConstants.PHONE);

        assertEquals(
                "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,64}$",
                RegexConstants.PASSWORD);

    }

    @Test
    void shouldHavePrivateConstructor() throws Exception {

        Constructor<RegexConstants> constructor =
                RegexConstants.class.getDeclaredConstructor();

        assertTrue(Modifier.isPrivate(constructor.getModifiers()));

        constructor.setAccessible(true);

        assertNotNull(constructor.newInstance());

    }

}