package com.matlasystems.chat.common.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ConversationTypeTest {

    @Test
    void shouldContainAllConversationTypes() {

        ConversationType[] values =
                ConversationType.values();

        assertEquals(5, values.length);

        assertEquals(ConversationType.DIRECT, values[0]);
        assertEquals(ConversationType.GROUP, values[1]);
        assertEquals(ConversationType.COMMUNITY, values[2]);
        assertEquals(ConversationType.SUPPORT, values[3]);
        assertEquals(ConversationType.SYSTEM, values[4]);

    }

    @Test
    void shouldReturnCorrectValueOf() {

        assertEquals(ConversationType.DIRECT,
                ConversationType.valueOf("DIRECT"));

        assertEquals(ConversationType.GROUP,
                ConversationType.valueOf("GROUP"));

        assertEquals(ConversationType.COMMUNITY,
                ConversationType.valueOf("COMMUNITY"));

        assertEquals(ConversationType.SUPPORT,
                ConversationType.valueOf("SUPPORT"));

        assertEquals(ConversationType.SYSTEM,
                ConversationType.valueOf("SYSTEM"));

    }

    @Test
    void shouldReturnCorrectNames() {

        assertEquals("DIRECT",
                ConversationType.DIRECT.name());

        assertEquals("GROUP",
                ConversationType.GROUP.name());

        assertEquals("COMMUNITY",
                ConversationType.COMMUNITY.name());

        assertEquals("SUPPORT",
                ConversationType.SUPPORT.name());

        assertEquals("SYSTEM",
                ConversationType.SYSTEM.name());

    }

}