package com.matlasystems.chat.common.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class NotificationTypeTest {

    @Test
    void shouldContainAllNotificationTypes() {

        NotificationType[] values = NotificationType.values();

        assertEquals(6, values.length);

        assertEquals(NotificationType.MESSAGE, values[0]);
        assertEquals(NotificationType.FRIEND_REQUEST, values[1]);
        assertEquals(NotificationType.GROUP_INVITE, values[2]);
        assertEquals(NotificationType.SYSTEM, values[3]);
        assertEquals(NotificationType.SECURITY, values[4]);
        assertEquals(NotificationType.WARNING, values[5]);

    }

    @Test
    void shouldReturnCorrectValueOf() {

        assertEquals(NotificationType.MESSAGE,
                NotificationType.valueOf("MESSAGE"));

        assertEquals(NotificationType.FRIEND_REQUEST,
                NotificationType.valueOf("FRIEND_REQUEST"));

        assertEquals(NotificationType.GROUP_INVITE,
                NotificationType.valueOf("GROUP_INVITE"));

        assertEquals(NotificationType.SYSTEM,
                NotificationType.valueOf("SYSTEM"));

        assertEquals(NotificationType.SECURITY,
                NotificationType.valueOf("SECURITY"));

        assertEquals(NotificationType.WARNING,
                NotificationType.valueOf("WARNING"));

    }

    @Test
    void shouldReturnCorrectNames() {

        assertEquals("MESSAGE", NotificationType.MESSAGE.name());
        assertEquals("FRIEND_REQUEST", NotificationType.FRIEND_REQUEST.name());
        assertEquals("GROUP_INVITE", NotificationType.GROUP_INVITE.name());
        assertEquals("SYSTEM", NotificationType.SYSTEM.name());
        assertEquals("SECURITY", NotificationType.SECURITY.name());
        assertEquals("WARNING", NotificationType.WARNING.name());

    }

}