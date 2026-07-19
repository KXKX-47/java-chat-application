package com.matlasystems.chat.common.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ChatTypeTest {

    @Test
    void shouldContainAllChatTypes() {

        ChatType[] values = ChatType.values();

        assertEquals(4, values.length);

        assertEquals(ChatType.PRIVATE, values[0]);
        assertEquals(ChatType.GROUP, values[1]);
        assertEquals(ChatType.CHANNEL, values[2]);
        assertEquals(ChatType.BROADCAST, values[3]);

    }

    @Test
    void shouldReturnCorrectValueOf() {

        assertEquals(ChatType.PRIVATE, ChatType.valueOf("PRIVATE"));
        assertEquals(ChatType.GROUP, ChatType.valueOf("GROUP"));
        assertEquals(ChatType.CHANNEL, ChatType.valueOf("CHANNEL"));
        assertEquals(ChatType.BROADCAST, ChatType.valueOf("BROADCAST"));

    }

    @Test
    void shouldReturnCorrectNames() {

        assertEquals("PRIVATE", ChatType.PRIVATE.name());
        assertEquals("GROUP", ChatType.GROUP.name());
        assertEquals("CHANNEL", ChatType.CHANNEL.name());
        assertEquals("BROADCAST", ChatType.BROADCAST.name());

    }

}