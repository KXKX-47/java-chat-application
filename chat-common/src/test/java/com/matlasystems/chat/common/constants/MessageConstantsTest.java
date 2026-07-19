package com.matlasystems.chat.common.constants;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class MessageConstantsTest {

    @Test
    void shouldContainExpectedConstants() {

        assertEquals(
                "User joined the chat.",
                MessageConstants.USER_JOINED);

        assertEquals(
                "User left the chat.",
                MessageConstants.USER_LEFT);

        assertEquals(
                "Login successful.",
                MessageConstants.LOGIN_SUCCESS);

        assertEquals(
                "Invalid username or password.",
                MessageConstants.LOGIN_FAILED);

        assertEquals(
                "User created successfully.",
                MessageConstants.USER_CREATED);

        assertEquals(
                "Message sent successfully.",
                MessageConstants.MESSAGE_SENT);

    }

    @Test
    void shouldHavePrivateConstructor() throws Exception {

        Constructor<MessageConstants> constructor =
                MessageConstants.class.getDeclaredConstructor();

        assertTrue(Modifier.isPrivate(constructor.getModifiers()));

        constructor.setAccessible(true);

        assertNotNull(constructor.newInstance());

    }

}