package com.matlasystems.chat.common.dto.presence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class UserStatusUpdateTest {

    @Test
    void shouldCreateDefaultUserStatusUpdate() {

        UserStatusUpdate update =
                new UserStatusUpdate();

        assertNull(update.getUserId());
        assertNull(update.getStatus());

    }

    @Test
    void shouldCreateUsingConstructor() {

        UserStatusUpdate update =
                new UserStatusUpdate(
                        10L,
                        "ONLINE");

        assertEquals(10L, update.getUserId());
        assertEquals("ONLINE", update.getStatus());

    }

    @Test
    void shouldSetAndGetValues() {

        UserStatusUpdate update =
                new UserStatusUpdate();

        update.setUserId(50L);
        update.setStatus("OFFLINE");

        assertEquals(50L, update.getUserId());
        assertEquals("OFFLINE", update.getStatus());

    }

}