package com.matlasystems.chat.common.constants;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class ApplicationConstantsTest {

    @Test
    void shouldContainExpectedConstants() {

        assertEquals("MATLA Chat Platform",
                ApplicationConstants.APPLICATION_NAME);

        assertEquals("MATLA Systems",
                ApplicationConstants.COMPANY_NAME);

        assertEquals("1.0.0",
                ApplicationConstants.VERION);

        assertEquals("Kutlwano Matlala",
                ApplicationConstants.AUTHOR);

        assertEquals("Africa/Johannesburg",
                ApplicationConstants.DEFAULT_TIMEZONE);

        assertEquals("en",
                ApplicationConstants.DEFAULT_LANGUAGE);

    }

    @Test
    void shouldHavePrivateConstructor() throws Exception {

        Constructor<ApplicationConstants> constructor =
                ApplicationConstants.class.getDeclaredConstructor();

        assertTrue(Modifier.isPrivate(constructor.getModifiers()));

        constructor.setAccessible(true);

        assertNotNull(constructor.newInstance());

    }

}