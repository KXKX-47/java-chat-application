package com.matlasystems.chat.common.dto.common;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class ValidationErrorResponseTest {

    @Test
    void shouldCreateDefaultValidationErrorResponse() {

        ValidationErrorResponse response =
                new ValidationErrorResponse();

        assertEquals(0, response.getStatus());
        assertNull(response.getError());
        assertNull(response.getMessage());

        assertNotNull(response.getTimestamp());
        assertNotNull(response.getFieldErrors());
        assertTrue(response.getFieldErrors().isEmpty());

    }

    @Test
    void shouldCreateUsingConstructor() {

        ValidationErrorResponse response =
                new ValidationErrorResponse(
                        400,
                        "Bad Request",
                        "Validation Failed");

        assertEquals(400, response.getStatus());
        assertEquals("Bad Request", response.getError());
        assertEquals("Validation Failed", response.getMessage());

        assertNotNull(response.getTimestamp());
        assertTrue(response.getFieldErrors().isEmpty());

    }

    @Test
    void shouldAddFieldError() {

        ValidationErrorResponse response =
                new ValidationErrorResponse();

        response.addFieldError(
                "email",
                "Invalid email");

        assertEquals(1,
                response.getFieldErrors().size());

        ValidationErrorResponse.FieldValidationError error =
                response.getFieldErrors().get(0);

        assertEquals("email", error.getField());
        assertEquals("Invalid email", error.getMessage());

    }

    @Test
    void shouldSetValues() {

        ValidationErrorResponse response =
                new ValidationErrorResponse();

        LocalDateTime now =
                LocalDateTime.now();

        response.setStatus(400);
        response.setError("Bad Request");
        response.setMessage("Validation Error");
        response.setTimestamp(now);
        response.setFieldErrors(new ArrayList<>());

        assertEquals(400, response.getStatus());
        assertEquals("Bad Request", response.getError());
        assertEquals("Validation Error", response.getMessage());
        assertEquals(now, response.getTimestamp());
        assertNotNull(response.getFieldErrors());

    }

    @Test
    void shouldCreateFieldValidationError() {

        ValidationErrorResponse.FieldValidationError error =
                new ValidationErrorResponse.FieldValidationError(
                        "username",
                        "Username required");

        assertEquals("username", error.getField());
        assertEquals("Username required", error.getMessage());

    }

    @Test
    void shouldUpdateFieldValidationError() {

        ValidationErrorResponse.FieldValidationError error =
                new ValidationErrorResponse.FieldValidationError();

        error.setField("password");
        error.setMessage("Password required");

        assertEquals("password", error.getField());
        assertEquals("Password required", error.getMessage());

    }

}