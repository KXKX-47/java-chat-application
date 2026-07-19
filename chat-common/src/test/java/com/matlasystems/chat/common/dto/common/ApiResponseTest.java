package com.matlasystems.chat.common.dto.common;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class ApiResponseTest {

    @Test
    void shouldCreateDefaultApiResponse() {

        ApiResponse<String> response = new ApiResponse<>();

        assertFalse(response.isSuccess());
        assertNull(response.getMessage());
        assertNull(response.getData());
        assertNotNull(response.getTimestamp());

    }

    @Test
    void shouldCreateApiResponseUsingConstructor() {

        ApiResponse<String> response =
                new ApiResponse<>(true,
                        "Success",
                        "Hello");

        assertTrue(response.isSuccess());
        assertEquals("Success", response.getMessage());
        assertEquals("Hello", response.getData());
        assertNotNull(response.getTimestamp());

    }

    @Test
    void shouldSetAndGetValues() {

        ApiResponse<Integer> response = new ApiResponse<>();

        LocalDateTime time = LocalDateTime.now();

        response.setSuccess(true);
        response.setMessage("Completed");
        response.setData(100);
        response.setTimestamp(time);

        assertTrue(response.isSuccess());
        assertEquals("Completed", response.getMessage());
        assertEquals(100, response.getData());
        assertEquals(time, response.getTimestamp());

    }

}