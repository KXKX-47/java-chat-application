package com.matlasystems.chat.common.dto.group;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class GroupResponseTest {

    @Test
    void shouldCreateDefaultGroupResponse() {

        GroupResponse response =
                new GroupResponse();

        assertNull(response.getId());
        assertNull(response.getName());
        assertNull(response.getDescription());
        assertFalse(response.isPrivateGroup());
        assertNull(response.getOwnerId());
        assertEquals(0, response.getMemberCount());
        assertNull(response.getCreatedAt());
        assertNull(response.getUpdatedAt());

    }

    @Test
    void shouldCreateUsingConstructor() {

        GroupResponse response =
                new GroupResponse(
                        1L,
                        "Engineering",
                        "Engineering Team",
                        true,
                        100L,
                        25,
                        "2026-07-17",
                        "2026-07-18");

        assertEquals(1L, response.getId());
        assertEquals("Engineering", response.getName());
        assertEquals("Engineering Team", response.getDescription());
        assertTrue(response.isPrivateGroup());
        assertEquals(100L, response.getOwnerId());
        assertEquals(25, response.getMemberCount());
        assertEquals("2026-07-17", response.getCreatedAt());
        assertEquals("2026-07-18", response.getUpdatedAt());

    }

    @Test
    void shouldSetAndGetValues() {

        GroupResponse response =
                new GroupResponse();

        response.setId(5L);
        response.setName("Support");
        response.setDescription("Support Team");
        response.setPrivateGroup(false);
        response.setOwnerId(20L);
        response.setMemberCount(50);
        response.setCreatedAt("2026-01-01");
        response.setUpdatedAt("2026-07-17");

        assertEquals(5L, response.getId());
        assertEquals("Support", response.getName());
        assertEquals("Support Team", response.getDescription());
        assertFalse(response.isPrivateGroup());
        assertEquals(20L, response.getOwnerId());
        assertEquals(50, response.getMemberCount());
        assertEquals("2026-01-01", response.getCreatedAt());
        assertEquals("2026-07-17", response.getUpdatedAt());

    }

}