package com.matlasystems.chat.common.constants;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class JsonConstantsTest {

    @Test
    void shouldContainExpectedConstants() {

        assertEquals("application/json",
                JsonConstants.CONTENT_TYPE);

        assertEquals("{}",
                JsonConstants.EMPTY_JSON_OBJECT);

        assertEquals("[]",
                JsonConstants.EMPTY_JSON_ARRAY);

        assertEquals("UTF-8",
                JsonConstants.UTF8);

        assertTrue(JsonConstants.PRETTY_PRINT);

    }

    @Test
    void shouldHavePrivateConstructor() throws Exception {

        Constructor<JsonConstants> constructor =
                JsonConstants.class.getDeclaredConstructor();

        assertTrue(Modifier.isPrivate(constructor.getModifiers()));

        constructor.setAccessible(true);

        assertNotNull(constructor.newInstance());

    }

}