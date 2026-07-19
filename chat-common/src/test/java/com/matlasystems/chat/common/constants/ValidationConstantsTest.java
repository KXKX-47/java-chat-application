package com.matlasystems.chat.common.constants;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class ValidationConstantsTest {

    @Test
    void shouldContainExpectedConstants() {

        assertEquals(
                3,
                ValidationConstants.MIN_USERNAME_LENGTH);

        assertEquals(
                30,
                ValidationConstants.MAX_USERNAME_LENGTH);

        assertEquals(
                8,
                ValidationConstants.MIN_PASSWORD_LENGTH);

        assertEquals(
                64,
                ValidationConstants.MAX_PASSWORD_LENGTH);

        assertEquals(
                2,
                ValidationConstants.MIN_NAME_LENGTH);

        assertEquals(
                50,
                ValidationConstants.MAX_NAME_LENGTH);

        assertEquals(
                254,
                ValidationConstants.MAX_EMAIL_LENGTH);

        assertEquals(
                2000,
                ValidationConstants.MAX_MESSAGE_LENGTH);

        assertEquals(
                3,
                ValidationConstants.MIN_GROUP_NAME_LENGTH);

        assertEquals(
                100,
                ValidationConstants.MAX_GROUP_NAME_LENGTH);

        assertEquals(
                500,
                ValidationConstants.MAX_GROUP_DESCRIPTION_LENGTH);

        assertEquals(
                10L * 1024 * 1024,
                ValidationConstants.MAX_FILE_SIZE);

    }

    @Test
    void shouldHavePrivateConstructor() throws Exception {

        Constructor<ValidationConstants> constructor =
                ValidationConstants.class.getDeclaredConstructor();

        assertTrue(Modifier.isPrivate(constructor.getModifiers()));

        constructor.setAccessible(true);

        assertNotNull(constructor.newInstance());

    }

}