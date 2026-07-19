package com.matlasystems.chat.common.dto.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class UpdateUserRequestTest {

    @Test
    void shouldCreateDefaultUpdateUserRequest() {

        UpdateUserRequest request =
                new UpdateUserRequest();

        assertNull(request.getFirstName());
        assertNull(request.getLastName());
        assertNull(request.getEmail());

    }

    @Test
    void shouldCreateUsingConstructor() {

        UpdateUserRequest request =
                new UpdateUserRequest(
                        "John",
                        "Doe",
                        "john@test.com");

        assertEquals("John", request.getFirstName());
        assertEquals("Doe", request.getLastName());
        assertEquals("john@test.com", request.getEmail());

    }

    @Test
    void shouldSetAndGetValues() {

        UpdateUserRequest request =
                new UpdateUserRequest();

        request.setFirstName("Jane");
        request.setLastName("Smith");
        request.setEmail("jane@test.com");

        assertEquals("Jane", request.getFirstName());
        assertEquals("Smith", request.getLastName());
        assertEquals("jane@test.com", request.getEmail());

    }

}