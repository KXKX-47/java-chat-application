package com.matlasystems.chat.common.constants;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class DateConstantsTest {

    @Test
    void shouldContainExpectedConstants() {

        assertEquals("yyyy-MM-dd",
                DateConstants.DATE_PATTERN);

        assertEquals("HH:mm:ss",
                DateConstants.TIME_PATTERN);

        assertEquals("yyyy-MM-dd HH:mm:ss",
                DateConstants.DATE_TIME_PATTERN);

        assertEquals("yyyy-MM-dd",
                DateConstants.ISO_DATE_PATTERN);

        assertEquals("yyyy-MM-dd'T'HH:mm:ss",
                DateConstants.ISO_DATE_TIME_PATTERN);

        assertEquals("yyyy-MM-dd'T'HH:mm:ssXXX",
                DateConstants.ISO_OFFSET_DATE_TIME_PATTERN);

        assertEquals("UTC",
                DateConstants.UTC_ZONE);

        assertEquals("Africa/Johannesburg",
                DateConstants.SOUTH_AFRICA_ZONE);

        assertEquals(7,
                DateConstants.DAYS_PER_WEEK);

        assertEquals(24,
                DateConstants.HOURS_PER_DAY);

        assertEquals(60,
                DateConstants.MINUTES_PER_HOUR);

        assertEquals(60,
                DateConstants.SECONDS_PER_MINUTE);

    }

    @Test
    void shouldHavePrivateConstructor() throws Exception {

        Constructor<DateConstants> constructor =
                DateConstants.class.getDeclaredConstructor();

        assertTrue(Modifier.isPrivate(constructor.getModifiers()));

        constructor.setAccessible(true);

        assertNotNull(constructor.newInstance());

    }

}