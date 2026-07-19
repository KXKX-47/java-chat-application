package com.matlasystems.chat.common.dto.chat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class ChatSummaryTest {

    @Test
    void shouldCreateEmptyChatSummary() {
        assertNotNull(new ChatSummary());
    }

    @Test
    void shouldCreateChatSummaryUsingConstructor() {
        ChatSummary summary = new ChatSummary(1L, "Project team", "Hello", "2026-07-17T10:00:00", 3, true);

        assertEquals(1L, summary.getConversationId());
        assertEquals("Project team", summary.getConversationName());
        assertEquals("Hello", summary.getLastMessage());
        assertEquals("2026-07-17T10:00:00", summary.getLastMessageTime());
        assertEquals(3, summary.getUnreadMessages());
        assertTrue(summary.isOnline());
    }

    @Test
    void shouldSetChatSummaryFields() {
        ChatSummary summary = new ChatSummary();
        summary.setConversationId(2L);
        summary.setConversationName("Design team");
        summary.setLastMessage("Updated design");
        summary.setLastMessageTime("2026-07-17T11:00:00");
        summary.setUnreadMessages(1);
        summary.setOnline(true);

        assertEquals(2L, summary.getConversationId());
        assertEquals("Design team", summary.getConversationName());
        assertEquals("Updated design", summary.getLastMessage());
        assertEquals("2026-07-17T11:00:00", summary.getLastMessageTime());
        assertEquals(1, summary.getUnreadMessages());
        assertTrue(summary.isOnline());
    }
}
