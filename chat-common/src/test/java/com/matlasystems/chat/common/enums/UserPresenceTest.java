package com.matlasystems.chat.common.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class UserPresenceTest {

    @Test
    void shouldContainAllUserPresenceValues() {

        UserPresence[] values = UserPresence.values();

        assertEquals(6, values.length);

        assertEquals(UserPresence.ONLINE, values[0]);
        assertEquals(UserPresence.OFFLINE, values[1]);
        assertEquals(UserPresence.AWAY, values[2]);
        assertEquals(UserPresence.BUSY, values[3]);
        assertEquals(UserPresence.INVISIBLE, values[4]);
        assertEquals(UserPresence.DO_NOT_DISTURB, values[5]);

    }

    @Test
    void shouldReturnCorrectValueOf() {

        assertEquals(UserPresence.ONLINE,
                UserPresence.valueOf("ONLINE"));

        assertEquals(UserPresence.OFFLINE,
                UserPresence.valueOf("OFFLINE"));

        assertEquals(UserPresence.AWAY,
                UserPresence.valueOf("AWAY"));

        assertEquals(UserPresence.BUSY,
                UserPresence.valueOf("BUSY"));

        assertEquals(UserPresence.INVISIBLE,
                UserPresence.valueOf("INVISIBLE"));

        assertEquals(UserPresence.DO_NOT_DISTURB,
                UserPresence.valueOf("DO_NOT_DISTURB"));

    }

    @Test
    void shouldReturnCorrectNames() {

        assertEquals("ONLINE", UserPresence.ONLINE.name());
        assertEquals("OFFLINE", UserPresence.OFFLINE.name());
        assertEquals("AWAY", UserPresence.AWAY.name());
        assertEquals("BUSY", UserPresence.BUSY.name());
        assertEquals("INVISIBLE", UserPresence.INVISIBLE.name());
        assertEquals("DO_NOT_DISTURB", UserPresence.DO_NOT_DISTURB.name());

    }

}