package com.matlasystems.chat.common.dto.group;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class CreateGroupRequestTest {

    @Test
    void shouldCreateDefaultCreateGroupRequest() {

        CreateGroupRequest request =
                new CreateGroupRequest();

        assertNull(request.getName());
        assertNull(request.getDescription());
        assertFalse(request.isPrivateGroup());
        assertNull(request.getOwnerId());

    }

    @Test
    void shouldCreateUsingConstructor() {

        CreateGroupRequest request =
                new CreateGroupRequest(
                        "Developers",
                        "Software Development Team",
                        true,
                        1L);

        assertEquals("Developers", request.getName());
        assertEquals("Software Development Team", request.getDescription());
        assertTrue(request.isPrivateGroup());
        assertEquals(1L, request.getOwnerId());

    }

    @Test
    void shouldSetAndGetValues() {

        CreateGroupRequest request =
                new CreateGroupRequest();

        request.setName("Support");
        request.setDescription("Application Support Team");
        request.setPrivateGroup(false);
        request.setOwnerId(15L);

        assertEquals("Support", request.getName());
        assertEquals("Application Support Team", request.getDescription());
        assertFalse(request.isPrivateGroup());
        assertEquals(15L, request.getOwnerId());

    }

}