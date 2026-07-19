package com.matlasystems.chat.common.models;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import com.matlasystems.chat.common.enums.MessageStatus;
import com.matlasystems.chat.common.enums.MessageType;

class MessageTest {

    @Test
    void shouldCreateEmptyMessage() {

        Message message = new Message();

        assertNotNull(message);

    }

    @Test
    void shouldCreateMessageUsingConstructor() {

        LocalDateTime sentAt = LocalDateTime.now();

        LocalDateTime deliveredAt = sentAt.plusSeconds(2);

        LocalDateTime readAt = sentAt.plusSeconds(5);

        LocalDateTime updatedAt = sentAt.plusSeconds(10);

        Message message = new Message(
                1L,                     // id
                10L,                    // conversationId
                100L,                   // senderId
                200L,                   // receiverId
                MessageType.TEXT,
                "Hello World",
                MessageStatus.SENT,
                false,                  // edited
                false,                  // deleted
                sentAt,
                deliveredAt,
                readAt,
                updatedAt
        );

        assertEquals(1L, message.getId());
        assertEquals(10L, message.getConversationId());
        assertEquals(100L, message.getSenderId());
        assertEquals(200L, message.getReceiverId());

        assertEquals(MessageType.TEXT,
                message.getMessageType());

        assertEquals("Hello World",
                message.getContent());

        assertEquals(MessageStatus.SENT,
                message.getStatus());

        assertFalse(message.isEdited());

        assertFalse(message.isDeleted());

        assertEquals(sentAt,
                message.getSentAt());

        assertEquals(deliveredAt,
                message.getDeliveredAt());

        assertEquals(readAt,
                message.getReadAt());

        assertEquals(updatedAt,
                message.getUpdatedAt());

    }

    @Test
    void shouldUpdateMessageProperties() {

        LocalDateTime now = LocalDateTime.now();

        Message message = new Message();

        message.setId(20L);
        message.setSenderId(1L);
        message.setReceiverId(2L);
        message.setMessageType(MessageType.IMAGE);
        message.setContent("Vacation.jpg");
        message.setStatus(MessageStatus.DELIVERED);
        message.setSentAt(now);

        assertEquals(20L, message.getId());
        assertEquals(1L, message.getSenderId());
        assertEquals(2L, message.getReceiverId());
        assertEquals(MessageType.IMAGE, message.getMessageType());
        assertEquals("Vacation.jpg", message.getContent());
        assertEquals(MessageStatus.DELIVERED, message.getStatus());
        assertEquals(now, message.getSentAt());

    }

}