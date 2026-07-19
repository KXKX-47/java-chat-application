package com.matlasystems.chat.common.dto.group;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class AddMemberRequestTest {

    @Test
    void shouldCreateDefaultAddMemberRequest() {

        AddMemberRequest request = new AddMemberRequest();

        assertNull(request.getGroupId());
        assertNull(request.getUserId());

    }

    @Test
    void shouldCreateAddMemberRequestUsingConstructor() {

        AddMemberRequest request =
                new AddMemberRequest(100L, 25L);

        assertEquals(100L, request.getGroupId());
        assertEquals(25L, request.getUserId());

    }

    @Test
    void shouldSetAndGetValues() {

        AddMemberRequest request = new AddMemberRequest();

        request.setGroupId(50L);
        request.setUserId(10L);

        assertEquals(50L, request.getGroupId());
        assertEquals(10L, request.getUserId());

    }

}