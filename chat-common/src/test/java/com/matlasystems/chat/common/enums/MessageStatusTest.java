package com.matlasystems.chat.common.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MessageStatusTest {

    @Test
    void shouldContainAllMessageStatuses() {

        MessageStatus[] values = MessageStatus.values();

        assertEquals(5, values.length);

        assertEquals(MessageStatus.PENDING, values[0]);
        assertEquals(MessageStatus.SENT, values[1]);
        assertEquals(MessageStatus.DELIVERED, values[2]);
        assertEquals(MessageStatus.READ, values[3]);
        assertEquals(MessageStatus.FAILED, values[4]);

    }

    @Test
    void shouldReturnCorrectValueOf() {

        assertEquals(MessageStatus.PENDING,
                MessageStatus.valueOf("PENDING"));

        assertEquals(MessageStatus.SENT,
                MessageStatus.valueOf("SENT"));

        assertEquals(MessageStatus.DELIVERED,
                MessageStatus.valueOf("DELIVERED"));

        assertEquals(MessageStatus.READ,
                MessageStatus.valueOf("READ"));

        assertEquals(MessageStatus.FAILED,
                MessageStatus.valueOf("FAILED"));

    }

    @Test
    void shouldReturnCorrectNames() {

        assertEquals("PENDING", MessageStatus.PENDING.name());
        assertEquals("SENT", MessageStatus.SENT.name());
        assertEquals("DELIVERED", MessageStatus.DELIVERED.name());
        assertEquals("READ", MessageStatus.READ.name());
        assertEquals("FAILED", MessageStatus.FAILED.name());

    }

}