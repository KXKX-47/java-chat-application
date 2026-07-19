package com.matlasystems.chat.common.constants;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class PaginationConstantsTest {

    @Test
    void shouldContainExpectedConstants() {

        assertEquals(0,
                PaginationConstants.DEFAULT_PAGE);

        assertEquals(20,
                PaginationConstants.DEFAULT_SIZE);

        assertEquals(1,
                PaginationConstants.MIN_PAGE_SIZE);

        assertEquals(100,
                PaginationConstants.MAX_PAGE_SIZE);

        assertEquals(100000,
                PaginationConstants.MAX_PAGE_NUMBER);

    }

    @Test
    void shouldHavePrivateConstructor() throws Exception {

        Constructor<PaginationConstants> constructor =
                PaginationConstants.class.getDeclaredConstructor();

        assertTrue(Modifier.isPrivate(constructor.getModifiers()));

        constructor.setAccessible(true);

        assertNotNull(constructor.newInstance());

    }

}