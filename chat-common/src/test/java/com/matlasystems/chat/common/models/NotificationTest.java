package com.matlasystems.chat.common.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.matlasystems.chat.common.enums.NotificationType;

class NotificationTest {

    @Test
    void shouldCreateEmptyNotification() {

        Notification notification = new Notification();

        assertNull(notification.getId());
        assertNull(notification.getUserId());
        assertNull(notification.getTitle());
        assertNull(notification.getMessage());
        assertNull(notification.getNotificationType());
        assertFalse(notification.isRead());
        assertNull(notification.getCreatedAt());
        assertNull(notification.getReadAt());

    }

    @Test
    void shouldSetNotificationProperties() {

        Notification notification = new Notification();

        notification.setId(1L);
        notification.setUserId(100L);
        notification.setTitle("New Message");
        notification.setMessage("You have a new message.");
        notification.setNotificationType(NotificationType.MESSAGE);
        notification.setRead(true);

        assertEquals(1L, notification.getId());
        assertEquals(100L, notification.getUserId());
        assertEquals("New Message", notification.getTitle());
        assertEquals("You have a new message.", notification.getMessage());
        assertEquals(NotificationType.MESSAGE,
                     notification.getNotificationType());
        assertTrue(notification.isRead());

    }

}