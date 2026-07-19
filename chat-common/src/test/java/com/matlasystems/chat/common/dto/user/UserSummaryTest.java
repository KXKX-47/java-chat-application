package com.matlasystems.chat.common.dto.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class UserSummaryTest {

    @Test
    void shouldCreateDefaultUserSummary() {

        UserSummary summary =
                new UserSummary();

        assertNull(summary.getId());
        assertNull(summary.getUsername());
        assertNull(summary.getFullName());
        assertNull(summary.getStatus());

    }

    @Test
    void shouldCreateUsingConstructor() {

        UserSummary summary =
                new UserSummary(
                        1L,
                        "john",
                        "John Doe",
                        "ONLINE");

        assertEquals(1L, summary.getId());
        assertEquals("john", summary.getUsername());
        assertEquals("John Doe", summary.getFullName());
        assertEquals("ONLINE", summary.getStatus());

    }

    @Test
    void shouldSetAndGetValues() {

        UserSummary summary =
                new UserSummary();

        summary.setId(20L);
        summary.setUsername("mary");
        summary.setFullName("Mary Smith");
        summary.setStatus("OFFLINE");

        assertEquals(20L, summary.getId());
        assertEquals("mary", summary.getUsername());
        assertEquals("Mary Smith", summary.getFullName());
        assertEquals("OFFLINE", summary.getStatus());

    }

}