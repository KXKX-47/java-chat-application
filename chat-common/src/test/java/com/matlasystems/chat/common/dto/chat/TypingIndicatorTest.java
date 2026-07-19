package com.matlasystems.chat.common.dto.chat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class TypingIndicatorTest {

    @Test
    void shouldCreateEmptyTypingIndicator() {
        assertNotNull(new TypingIndicator());
    }

    @Test
    void shouldCreateTypingIndicatorUsingConstructor() {
        TypingIndicator indicator = new TypingIndicator(1L, 2L, "jane", true);

        assertEquals(1L, indicator.getConversationId());
        assertEquals(2L, indicator.getUserId());
        assertEquals("jane", indicator.getUsername());
        assertTrue(indicator.isTyping());
    }

    @Test
    void shouldSetTypingIndicatorFields() {
        TypingIndicator indicator = new TypingIndicator();
        indicator.setConversationId(3L);
        indicator.setUserId(4L);
        indicator.setUsername("john");
        indicator.setTyping(true);

        assertEquals(3L, indicator.getConversationId());
        assertEquals(4L, indicator.getUserId());
        assertEquals("john", indicator.getUsername());
        assertTrue(indicator.isTyping());
    }
}
