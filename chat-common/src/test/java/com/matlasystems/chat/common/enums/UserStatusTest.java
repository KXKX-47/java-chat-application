package com.matlasystems.chat.common.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class UserStatusTest {

    @Test
    void shouldContainAllUserStatuses() {

        UserStatus[] values = UserStatus.values();

        assertEquals(6, values.length);

        assertEquals(UserStatus.ACTIVE, values[0]);
        assertEquals(UserStatus.INACTIVE, values[1]);
        assertEquals(UserStatus.SUSPENDED, values[2]);
        assertEquals(UserStatus.LOCKED, values[3]);
        assertEquals(UserStatus.PENDING_VERIFICATION, values[4]);
        assertEquals(UserStatus.DELETED, values[5]);

    }

    @Test
    void shouldReturnCorrectValueOf() {

        assertEquals(UserStatus.ACTIVE,
                UserStatus.valueOf("ACTIVE"));

        assertEquals(UserStatus.INACTIVE,
                UserStatus.valueOf("INACTIVE"));

        assertEquals(UserStatus.SUSPENDED,
                UserStatus.valueOf("SUSPENDED"));

        assertEquals(UserStatus.LOCKED,
                UserStatus.valueOf("LOCKED"));

        assertEquals(UserStatus.PENDING_VERIFICATION,
                UserStatus.valueOf("PENDING_VERIFICATION"));

        assertEquals(UserStatus.DELETED,
                UserStatus.valueOf("DELETED"));

    }

    @Test
    void shouldReturnCorrectNames() {

        assertEquals("ACTIVE", UserStatus.ACTIVE.name());
        assertEquals("INACTIVE", UserStatus.INACTIVE.name());
        assertEquals("SUSPENDED", UserStatus.SUSPENDED.name());
        assertEquals("LOCKED", UserStatus.LOCKED.name());
        assertEquals("PENDING_VERIFICATION", UserStatus.PENDING_VERIFICATION.name());
        assertEquals("DELETED", UserStatus.DELETED.name());

    }

}