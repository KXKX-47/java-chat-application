package com.matlasystems.chat.common.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class GroupStatusTest {

    @Test
    void shouldContainAllGroupStatuses() {

        GroupStatus[] values = GroupStatus.values();

        assertEquals(4, values.length);

        assertEquals(GroupStatus.ACTIVE, values[0]);
        assertEquals(GroupStatus.INACTIVE, values[1]);
        assertEquals(GroupStatus.ARCHIVED, values[2]);
        assertEquals(GroupStatus.DELETED, values[3]);

    }

    @Test
    void shouldReturnCorrectValueOf() {

        assertEquals(GroupStatus.ACTIVE,
                GroupStatus.valueOf("ACTIVE"));

        assertEquals(GroupStatus.INACTIVE,
                GroupStatus.valueOf("INACTIVE"));

        assertEquals(GroupStatus.ARCHIVED,
                GroupStatus.valueOf("ARCHIVED"));

        assertEquals(GroupStatus.DELETED,
                GroupStatus.valueOf("DELETED"));

    }

    @Test
    void shouldReturnCorrectNames() {

        assertEquals("ACTIVE", GroupStatus.ACTIVE.name());
        assertEquals("INACTIVE", GroupStatus.INACTIVE.name());
        assertEquals("ARCHIVED", GroupStatus.ARCHIVED.name());
        assertEquals("DELETED", GroupStatus.DELETED.name());

    }

}