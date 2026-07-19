package com.matlasystems.chat.common.dto.chat;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

class ConversationResponseTest {

    @Test
    void shouldCreateEmptyConversationResponse() {
        assertNotNull(new ConversationResponse());
    }

    @Test
    void shouldCreateConversationResponseUsingConstructor() {
        List<MessageResponse> messages = Collections.singletonList(new MessageResponse());
        ConversationResponse response = new ConversationResponse(1L, "Project team", "GROUP", messages);

        assertEquals(1L, response.getConversationId());
        assertEquals("Project team", response.getConversationName());
        assertEquals("GROUP", response.getConversationType());
        assertEquals(messages, response.getMessages());
    }

    @Test
    void shouldSetConversationResponseFields() {
        ConversationResponse response = new ConversationResponse();
        List<MessageResponse> messages = Collections.singletonList(new MessageResponse());
        response.setConversationId(2L);
        response.setConversationName("Support");
        response.setConversationType("DIRECT");
        response.setMessages(messages);

        assertEquals(2L, response.getConversationId());
        assertEquals("Support", response.getConversationName());
        assertEquals("DIRECT", response.getConversationType());
        assertEquals(messages, response.getMessages());
    }
}
