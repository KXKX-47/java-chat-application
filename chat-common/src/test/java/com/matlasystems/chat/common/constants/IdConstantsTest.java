package com.matlasystems.chat.common.constants;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class IdConstantsTest {

    @Test
    void shouldContainExpectedConstants() {

        assertEquals(36, IdConstants.UUID_LENGTH);
        assertEquals(12, IdConstants.DEFAULT_RANDOM_LENGTH);

        assertEquals("USR", IdConstants.USER_PREFIX);
        assertEquals("MSG", IdConstants.MESSAGE_PREFIX);
        assertEquals("GRP", IdConstants.GROUP_PREFIX);
        assertEquals("SES", IdConstants.SESSION_PREFIX);
        assertEquals("FIL", IdConstants.FILE_PREFIX);
        assertEquals("NTF", IdConstants.NOTIFICATION_PREFIX);
        assertEquals("CON", IdConstants.CONVERSATION_PREFIX);

        assertEquals("-", IdConstants.SEPARATOR);

        assertEquals(
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789",
                IdConstants.ALPHA_NUMERIC);

    }

    @Test
    void shouldHavePrivateConstructor() throws Exception {

        Constructor<IdConstants> constructor =
                IdConstants.class.getDeclaredConstructor();

        assertTrue(Modifier.isPrivate(constructor.getModifiers()));

        constructor.setAccessible(true);

        assertNotNull(constructor.newInstance());

    }

}