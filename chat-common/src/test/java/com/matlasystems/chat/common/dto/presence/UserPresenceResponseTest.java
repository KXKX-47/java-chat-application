package com.matlasystems.chat.common.dto.presence;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class UserPresenceResponseTest {

    @Test
    void shouldCreateDefaultUserPresenceResponse() {

        UserPresenceResponse response =
                new UserPresenceResponse();

        assertNull(response.getUserId());
        assertNull(response.getUsername());
        assertNull(response.getStatus());
        assertNull(response.getLastSeen());
        assertFalse(response.isTyping());
        assertFalse(response.isRecording());
        assertFalse(response.isInCall());

    }

    @Test
    void shouldCreateUsingConstructor() {

        LocalDateTime lastSeen = LocalDateTime.now();

        UserPresenceResponse response =
                new UserPresenceResponse(
                        1L,
                        "john",
                        "ONLINE",
                        lastSeen,
                        true,
                        false,
                        true);

        assertEquals(1L, response.getUserId());
        assertEquals("john", response.getUsername());
        assertEquals("ONLINE", response.getStatus());
        assertEquals(lastSeen, response.getLastSeen());
        assertTrue(response.isTyping());
        assertFalse(response.isRecording());
        assertTrue(response.isInCall());

    }

    @Test
    void shouldSetAndGetValues() {

        UserPresenceResponse response =
                new UserPresenceResponse();

        LocalDateTime lastSeen = LocalDateTime.now();

        response.setUserId(20L);
        response.setUsername("mary");
        response.setStatus("AWAY");
        response.setLastSeen(lastSeen);
        response.setTyping(false);
        response.setRecording(true);
        response.setInCall(false);

        assertEquals(20L, response.getUserId());
        assertEquals("mary", response.getUsername());
        assertEquals("AWAY", response.getStatus());
        assertEquals(lastSeen, response.getLastSeen());
        assertFalse(response.isTyping());
        assertTrue(response.isRecording());
        assertFalse(response.isInCall());

    }

}