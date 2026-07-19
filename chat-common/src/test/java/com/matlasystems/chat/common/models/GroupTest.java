package com.matlasystems.chat.common.models;

import com.matlasystems.chat.common.enums.GroupStatus;
import com.matlasystems.chat.common.enums.GroupType;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class GroupTest {

    @Test
    void shouldCreateEmptyGroup() {

        Group group = new Group();

        assertNotNull(group);

    }

    @Test
    void shouldCreateGroupUsingConstructor() {

        LocalDateTime createdAt = LocalDateTime.now();
        LocalDateTime updatedAt = createdAt.plusMinutes(5);

        Group group = new Group(
                1L,
                "Developers",
                "Java Development Team",
                50L,
                GroupType.PRIVATE,
                GroupStatus.ACTIVE,
                25,
                100,
                true,
                true,
                createdAt,
                updatedAt
        );

        assertEquals(1L, group.getId());
        assertEquals("Developers", group.getName());
        assertEquals("Java Development Team", group.getDescription());
        assertEquals(50L, group.getOwnerId());

        assertEquals(GroupType.PRIVATE, group.getGroupType());
        assertEquals(GroupStatus.ACTIVE, group.getStatus());

        assertEquals(25, group.getMemberCount());
        assertEquals(100, group.getMaximumMembers());

        assertTrue(group.getJoinApprovalRequired());
        assertTrue(group.getAllowMemberInvites());

        assertEquals(createdAt, group.getCreatedAt());
        assertEquals(updatedAt, group.getUpdatedAt());

    }

    @Test
    void shouldUpdateGroupProperties() {

        LocalDateTime now = LocalDateTime.now();

        Group group = new Group();

        group.setId(10L);
        group.setName("DevOps");
        group.setDescription("Infrastructure Team");
        group.setOwnerId(99L);

        group.setGroupType(GroupType.PUBLIC);
        group.setStatus(GroupStatus.ACTIVE);

        group.setMemberCount(40);
        group.setMaximumMembers(250);

        group.setJoinApprovalRequired(false);
        group.setAllowMemberInvites(true);

        group.setCreatedAt(now);
        group.setUpdatedAt(now.plusMinutes(10));

        assertEquals(10L, group.getId());
        assertEquals("DevOps", group.getName());
        assertEquals("Infrastructure Team", group.getDescription());
        assertEquals(99L, group.getOwnerId());

        assertEquals(GroupType.PUBLIC, group.getGroupType());
        assertEquals(GroupStatus.ACTIVE, group.getStatus());

        assertEquals(40, group.getMemberCount());
        assertEquals(250, group.getMaximumMembers());

        assertFalse(group.getJoinApprovalRequired());
        assertTrue(group.getAllowMemberInvites());

        assertEquals(now, group.getCreatedAt());
        assertEquals(now.plusMinutes(10), group.getUpdatedAt());

    }

}