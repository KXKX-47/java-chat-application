package com.matlasystems.chat.common.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class GroupTypeTest {

    @Test
    void shouldContainAllGroupTypes() {

        GroupType[] values = GroupType.values();

        assertEquals(4, values.length);

        assertEquals(GroupType.PRIVATE, values[0]);
        assertEquals(GroupType.PUBLIC, values[1]);
        assertEquals(GroupType.CHANNEL, values[2]);
        assertEquals(GroupType.COMMUNITY, values[3]);

    }

    @Test
    void shouldReturnCorrectValueOf() {

        assertEquals(GroupType.PRIVATE,
                GroupType.valueOf("PRIVATE"));

        assertEquals(GroupType.PUBLIC,
                GroupType.valueOf("PUBLIC"));

        assertEquals(GroupType.CHANNEL,
                GroupType.valueOf("CHANNEL"));

        assertEquals(GroupType.COMMUNITY,
                GroupType.valueOf("COMMUNITY"));

    }

    @Test
    void shouldReturnCorrectNames() {

        assertEquals("PRIVATE", GroupType.PRIVATE.name());
        assertEquals("PUBLIC", GroupType.PUBLIC.name());
        assertEquals("CHANNEL", GroupType.CHANNEL.name());
        assertEquals("COMMUNITY", GroupType.COMMUNITY.name());

    }

}