package com.matlasystems.chat.common.dto.chat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

class SendMessageRequestTest {

    @Test
    void shouldCreateEmptySendMessageRequest() {
        assertNotNull(new SendMessageRequest());
    }

    @Test
    void shouldCreateSendMessageRequestUsingConstructor() {
        SendMessageRequest request = new SendMessageRequest(1L, 2L, 3L, "Hello", "TEXT");

        assertEquals(1L, request.getSenderId());
        assertEquals(2L, request.getReceiverId());
        assertEquals(3L, request.getConversationId());
        assertEquals("Hello", request.getMessage());
        assertEquals("TEXT", request.getMessageType());
    }

    @Test
    void shouldSetSendMessageRequestFields() {
        SendMessageRequest request = new SendMessageRequest();
        request.setSenderId(4L);
        request.setReceiverId(5L);
        request.setConversationId(6L);
        request.setMessage("Updated message");
        request.setMessageType("FILE");

        assertEquals(4L, request.getSenderId());
        assertEquals(5L, request.getReceiverId());
        assertEquals(6L, request.getConversationId());
        assertEquals("Updated message", request.getMessage());
        assertEquals("FILE", request.getMessageType());
    }
}
