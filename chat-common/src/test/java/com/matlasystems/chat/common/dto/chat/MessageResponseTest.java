package com.matlasystems.chat.common.dto.chat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

class MessageResponseTest {

    @Test
    void shouldCreateEmptyMessageResponse() {
        assertNotNull(new MessageResponse());
    }

    @Test
    void shouldCreateMessageResponseUsingConstructor() {
        MessageResponse response = new MessageResponse(1L, 2L, 3L, 4L, "jane", "Hello", "TEXT", "SENT", "2026-07-17T10:00:00");

        assertEquals(1L, response.getId());
        assertEquals(2L, response.getSenderId());
        assertEquals(3L, response.getReceiverId());
        assertEquals(4L, response.getConversationId());
        assertEquals("jane", response.getSenderUsername());
        assertEquals("Hello", response.getMessage());
        assertEquals("TEXT", response.getMessageType());
        assertEquals("SENT", response.getStatus());
        assertEquals("2026-07-17T10:00:00", response.getSentAt());
    }

    @Test
    void shouldSetMessageResponseFields() {
        MessageResponse response = new MessageResponse();
        response.setId(5L);
        response.setSenderId(6L);
        response.setReceiverId(7L);
        response.setConversationId(8L);
        response.setSenderUsername("john");
        response.setMessage("Updated message");
        response.setMessageType("IMAGE");
        response.setStatus("DELIVERED");
        response.setSentAt("2026-07-17T11:00:00");

        assertEquals(5L, response.getId());
        assertEquals(6L, response.getSenderId());
        assertEquals(7L, response.getReceiverId());
        assertEquals(8L, response.getConversationId());
        assertEquals("john", response.getSenderUsername());
        assertEquals("Updated message", response.getMessage());
        assertEquals("IMAGE", response.getMessageType());
        assertEquals("DELIVERED", response.getStatus());
        assertEquals("2026-07-17T11:00:00", response.getSentAt());
    }
}
