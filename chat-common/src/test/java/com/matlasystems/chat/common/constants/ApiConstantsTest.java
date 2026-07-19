package com.matlasystems.chat.common.constants;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class ApiConstantsTest {

    @Test
    void shouldContainExpectedConstants() {

        assertEquals("/api/v1", ApiConstants.API_VERSION);
        assertEquals("/users", ApiConstants.USERS);
        assertEquals("/auth", ApiConstants.AUTH);
        assertEquals("/login", ApiConstants.LOGIN);
        assertEquals("/register", ApiConstants.REGISTER);
        assertEquals("/messages", ApiConstants.MESSAGES);
        assertEquals("/groups", ApiConstants.GROUPS);
        assertEquals("/health", ApiConstants.HEALTH);

    }

    @Test
    void shouldHavePrivateConstructor() throws Exception {

        Constructor<ApiConstants> constructor =
                ApiConstants.class.getDeclaredConstructor();

        assertTrue(Modifier.isPrivate(constructor.getModifiers()));

        constructor.setAccessible(true);

        assertNotNull(constructor.newInstance());

    }

}