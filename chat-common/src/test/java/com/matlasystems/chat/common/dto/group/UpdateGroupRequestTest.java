package com.matlasystems.chat.common.dto.group;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class UpdateGroupRequestTest {

    @Test
    void shouldCreateDefaultUpdateGroupRequest() {

        UpdateGroupRequest request =
                new UpdateGroupRequest();

        assertNull(request.getGroupId());
        assertNull(request.getName());
        assertNull(request.getDescription());
        assertFalse(request.isPrivateGroup());

    }

    @Test
    void shouldCreateUsingConstructor() {

        UpdateGroupRequest request =
                new UpdateGroupRequest(
                        10L,
                        "Architecture",
                        "Enterprise Architecture Team",
                        true);

        assertEquals(10L, request.getGroupId());
        assertEquals("Architecture", request.getName());
        assertEquals("Enterprise Architecture Team", request.getDescription());
        assertTrue(request.isPrivateGroup());

    }

    @Test
    void shouldSetAndGetValues() {

        UpdateGroupRequest request =
                new UpdateGroupRequest();

        request.setGroupId(30L);
        request.setName("Infrastructure");
        request.setDescription("Infrastructure Team");
        request.setPrivateGroup(false);

        assertEquals(30L, request.getGroupId());
        assertEquals("Infrastructure", request.getName());
        assertEquals("Infrastructure Team", request.getDescription());
        assertFalse(request.isPrivateGroup());

    }

}