package com.matlasystems.chat.common.models;

import com.matlasystems.chat.common.enums.ConversationType;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ConversationTest {

    @Test
    void shouldCreateConversationUsingDefaultConstructor() {

        Conversation conversation = new Conversation();

        assertNotNull(conversation);

    }

    @Test
    void shouldSetConversationProperties() {

        LocalDateTime created = LocalDateTime.now();
        LocalDateTime updated = created.plusMinutes(10);

        Conversation conversation = new Conversation();

        conversation.setId(1L);
        conversation.setName("Development Team");
        conversation.setDescription("Internal developers");
        conversation.setConversationType(
                ConversationType.GROUP);
        conversation.setOwnerId(100L);
        conversation.setPrivate(true);
        conversation.setArchived(false);
        conversation.setCreatedAt(created);
        conversation.setUpdatedAt(updated);

        assertEquals(1L, conversation.getId());
        assertEquals("Development Team",
                conversation.getName());
        assertEquals("Internal developers",
                conversation.getDescription());
        assertEquals(
                ConversationType.GROUP,
                conversation.getConversationType());
        assertEquals(100L,
                conversation.getOwnerId());
        assertTrue(conversation.isPrivate());
        assertFalse(conversation.isArchived());
        assertEquals(created,
                conversation.getCreatedAt());
        assertEquals(updated,
                conversation.getUpdatedAt());

    }

    @Test
    void shouldCreateConversationUsingMinimalConstructor() {

        Conversation conversation =
                new Conversation(
                        99L,
                        "Private Chat",
                        ConversationType.DIRECT
                );

        assertEquals(99L,
                conversation.getId());

        assertEquals(
                "Private Chat",
                conversation.getName());

        assertEquals(
                ConversationType.DIRECT,
                conversation.getConversationType());

    }

    @Test
    void shouldCreateConversationUsingFullConstructor() {

        LocalDateTime created = LocalDateTime.now();
        LocalDateTime updated = created.plusHours(1);

        Conversation conversation =
                new Conversation(
                        10L,
                        "Architecture Team",
                        "Discuss system architecture",
                        ConversationType.GROUP,
                        5L,
                        true,
                        false,
                        created,
                        updated
                );

        assertEquals(10L,
                conversation.getId());

        assertEquals(
                "Architecture Team",
                conversation.getName());

        assertEquals(
                "Discuss system architecture",
                conversation.getDescription());

        assertEquals(
                ConversationType.GROUP,
                conversation.getConversationType());

        assertEquals(5L,
                conversation.getOwnerId());

        assertTrue(conversation.isPrivate());

        assertFalse(conversation.isArchived());

        assertEquals(created,
                conversation.getCreatedAt());

        assertEquals(updated,
                conversation.getUpdatedAt());

    }

}