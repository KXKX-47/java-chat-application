package com.matlasystems.chat.common.constants;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class DatabaseConstantsTest {

    @Test
    void shouldContainExpectedConstants() {

        assertEquals("users",
                DatabaseConstants.USER_TABLE);

        assertEquals("messages",
                DatabaseConstants.MESSAGE_TABLE);

        assertEquals("groups",
                DatabaseConstants.GROUP_TABLE);

        assertEquals("roles",
                DatabaseConstants.ROLE_TABLE);

        assertEquals(20,
                DatabaseConstants.DEFAULT_PAGE_SIZE);

    }

    @Test
    void shouldHavePrivateConstructor() throws Exception {

        Constructor<DatabaseConstants> constructor =
                DatabaseConstants.class.getDeclaredConstructor();

        assertTrue(Modifier.isPrivate(constructor.getModifiers()));

        constructor.setAccessible(true);

        assertNotNull(constructor.newInstance());

    }

}