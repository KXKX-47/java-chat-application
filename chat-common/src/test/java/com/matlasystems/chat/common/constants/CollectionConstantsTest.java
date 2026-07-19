package com.matlasystems.chat.common.constants;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class CollectionConstantsTest {

    @Test
    void shouldContainExpectedConstants() {

        assertEquals(16,
                CollectionConstants.DEFAULT_INITIAL_CAPACITY);

        assertEquals(0.75f,
                CollectionConstants.DEFAULT_LOAD_FACTOR);

        assertEquals(20,
                CollectionConstants.DEFAULT_PAGE_SIZE);

        assertEquals(100,
                CollectionConstants.MAX_PAGE_SIZE);

    }

    @Test
    void shouldHavePrivateConstructor() throws Exception {

        Constructor<CollectionConstants> constructor =
                CollectionConstants.class.getDeclaredConstructor();

        assertTrue(Modifier.isPrivate(constructor.getModifiers()));

        constructor.setAccessible(true);

        assertNotNull(constructor.newInstance());

    }

}