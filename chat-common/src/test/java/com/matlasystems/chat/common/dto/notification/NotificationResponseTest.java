package com.matlasystems.chat.common.dto.notification;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class NotificationResponseTest {

    @Test
    void shouldCreateDefaultNotificationResponse() {

        NotificationResponse response = new NotificationResponse();

        assertNull(response.getId());
        assertNull(response.getRecipientId());
        assertNull(response.getTitle());
        assertNull(response.getMessage());
        assertNull(response.getType());
        assertFalse(response.isRead());
        assertNull(response.getCreatedAt());
        assertNull(response.getActionUrl());

    }

    @Test
    void shouldCreateNotificationResponseUsingConstructor() {

        LocalDateTime createdAt = LocalDateTime.now();

        NotificationResponse response =
                new NotificationResponse(
                        1L,
                        100L,
                        "New Message",
                        "John sent you a message",
                        "MESSAGE",
                        true,
                        createdAt,
                        "/chat/100");

        assertEquals(1L, response.getId());
        assertEquals(100L, response.getRecipientId());
        assertEquals("New Message", response.getTitle());
        assertEquals("John sent you a message", response.getMessage());
        assertEquals("MESSAGE", response.getType());
        assertTrue(response.isRead());
        assertEquals(createdAt, response.getCreatedAt());
        assertEquals("/chat/100", response.getActionUrl());

    }

    @Test
    void shouldSetAndGetValues() {

        NotificationResponse response = new NotificationResponse();

        LocalDateTime createdAt = LocalDateTime.now();

        response.setId(10L);
        response.setRecipientId(25L);
        response.setTitle("Warning");
        response.setMessage("Password expires soon");
        response.setType("SECURITY");
        response.setRead(false);
        response.setCreatedAt(createdAt);
        response.setActionUrl("/security");

        assertEquals(10L, response.getId());
        assertEquals(25L, response.getRecipientId());
        assertEquals("Warning", response.getTitle());
        assertEquals("Password expires soon", response.getMessage());
        assertEquals("SECURITY", response.getType());
        assertFalse(response.isRead());
        assertEquals(createdAt, response.getCreatedAt());
        assertEquals("/security", response.getActionUrl());

    }

}