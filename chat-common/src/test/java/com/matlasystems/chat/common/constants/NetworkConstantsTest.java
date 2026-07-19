package com.matlasystems.chat.common.constants;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class NetworkConstantsTest {

    @Test
    void shouldContainExpectedConstants() {

        assertEquals("localhost",
                NetworkConstants.DEFAULT_HOST);

        assertEquals("127.0.0.1",
                NetworkConstants.LOCALHOST);

        assertEquals(8080,
                NetworkConstants.DEFAULT_PORT);

        assertEquals(30000,
                NetworkConstants.SOCKET_TIMEOUT);

        assertEquals(1,
                NetworkConstants.MIN_PORT);

        assertEquals(65535,
                NetworkConstants.MAX_PORT);

        assertEquals("http",
                NetworkConstants.HTTP);

        assertEquals("https",
                NetworkConstants.HTTPS);

        assertEquals("tcp",
                NetworkConstants.TCP);

        assertEquals("udp",
                NetworkConstants.UDP);

        assertEquals("ws",
                NetworkConstants.WS);

        assertEquals("wss",
                NetworkConstants.WSS);

    }

    @Test
    void shouldHavePrivateConstructor() throws Exception {

        Constructor<NetworkConstants> constructor =
                NetworkConstants.class.getDeclaredConstructor();

        assertTrue(Modifier.isPrivate(constructor.getModifiers()));

        constructor.setAccessible(true);

        assertNotNull(constructor.newInstance());

    }

}