package com.matlasystems.chat.common.constants;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class WebSocketConstantsTest {

    @Test
    void shouldContainExpectedConstants() {

        assertEquals(
                "/chat",
                WebSocketConstants.WS_ENDPOINT);

        assertEquals(
                "/topic/messages",
                WebSocketConstants.TOPIC_MESSAGES);

        assertEquals(
                "/topic/users",
                WebSocketConstants.TOPIC_USERS);

        assertEquals(
                "/app",
                WebSocketConstants.APP_PREFIX);

    }

    @Test
    void shouldHavePrivateConstructor() throws Exception {

        Constructor<WebSocketConstants> constructor =
                WebSocketConstants.class.getDeclaredConstructor();

        assertTrue(Modifier.isPrivate(constructor.getModifiers()));

        constructor.setAccessible(true);

        assertNotNull(constructor.newInstance());

    }

}