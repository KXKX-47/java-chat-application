package com.matlasystems.chat.common.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusinessExceptionTest {

    @Test
    void shouldCreateBusinessException() {

        BusinessException exception =
                new BusinessException("Business rule violated.");

        assertNotNull(exception);

        assertEquals(
                "Business rule violated.",
                exception.getMessage());

    }

    @Test
    void shouldExtendApplicationException() {

        BusinessException exception =
                new BusinessException("Error");

        assertTrue(
                exception instanceof ApplicationException);

    }

    @Test
    void shouldExtendRuntimeException() {

        BusinessException exception =
                new BusinessException("Error");

        assertTrue(
                exception instanceof RuntimeException);

    }

    @Test
    void shouldNotHaveCauseWhenNotProvided() {

        BusinessException exception =
                new BusinessException("Error");

        assertNull(
                exception.getCause());

    }

}