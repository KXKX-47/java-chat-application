package com.matlasystems.chat.common.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChatExceptionTest {

    @Test
    void shouldCreateChatException() {

        ChatException exception =
                new ChatException("Message delivery failed.");

        assertNotNull(exception);

        assertEquals(
                "Message delivery failed.",
                exception.getMessage());

    }

    @Test
    void shouldExtendBusinessException() {

        ChatException exception =
                new ChatException("Error");

        assertTrue(
                exception instanceof BusinessException);

    }

    @Test
    void shouldExtendApplicationException() {

        ChatException exception =
                new ChatException("Error");

        assertTrue(
                exception instanceof ApplicationException);

    }

    @Test
    void shouldExtendRuntimeException() {

        ChatException exception =
                new ChatException("Error");

        assertTrue(
                exception instanceof RuntimeException);

    }

    @Test
    void shouldNotHaveCauseWhenNotProvided() {

        ChatException exception =
                new ChatException("Error");

        assertNull(
                exception.getCause());

    }

}