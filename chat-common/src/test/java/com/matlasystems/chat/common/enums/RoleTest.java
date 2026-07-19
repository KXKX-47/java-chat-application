package com.matlasystems.chat.common.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class RoleTest {

    @Test
    void shouldContainAllRoles() {

        Role[] values = Role.values();

        assertEquals(4, values.length);

        assertEquals(Role.USER, values[0]);
        assertEquals(Role.MODERATOR, values[1]);
        assertEquals(Role.ADMINISTRATOR, values[2]);
        assertEquals(Role.SUPER_ADMIN, values[3]);

    }

    @Test
    void shouldReturnCorrectValueOf() {

        assertEquals(Role.USER,
                Role.valueOf("USER"));

        assertEquals(Role.MODERATOR,
                Role.valueOf("MODERATOR"));

        assertEquals(Role.ADMINISTRATOR,
                Role.valueOf("ADMINISTRATOR"));

        assertEquals(Role.SUPER_ADMIN,
                Role.valueOf("SUPER_ADMIN"));

    }

    @Test
    void shouldReturnCorrectNames() {

        assertEquals("USER", Role.USER.name());
        assertEquals("MODERATOR", Role.MODERATOR.name());
        assertEquals("ADMINISTRATOR", Role.ADMINISTRATOR.name());
        assertEquals("SUPER_ADMIN", Role.SUPER_ADMIN.name());

    }

}