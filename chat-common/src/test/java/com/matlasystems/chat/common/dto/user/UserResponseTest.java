package com.matlasystems.chat.common.dto.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class UserResponseTest {

    @Test
    void shouldCreateDefaultUserResponse() {

        UserResponse response =
                new UserResponse();

        assertNull(response.getId());
        assertNull(response.getUsername());
        assertNull(response.getFirstName());
        assertNull(response.getLastName());
        assertNull(response.getEmail());
        assertNull(response.getStatus());

    }

    @Test
    void shouldCreateUsingConstructor() {

        UserResponse response =
                new UserResponse(
                        1L,
                        "john",
                        "John",
                        "Doe",
                        "john@test.com",
                        "ACTIVE");

        assertEquals(1L, response.getId());
        assertEquals("john", response.getUsername());
        assertEquals("John", response.getFirstName());
        assertEquals("Doe", response.getLastName());
        assertEquals("john@test.com", response.getEmail());
        assertEquals("ACTIVE", response.getStatus());

    }

    @Test
    void shouldSetAndGetValues() {

        UserResponse response =
                new UserResponse();

        response.setId(10L);
        response.setUsername("mary");
        response.setFirstName("Mary");
        response.setLastName("Smith");
        response.setEmail("mary@test.com");
        response.setStatus("ONLINE");

        assertEquals(10L, response.getId());
        assertEquals("mary", response.getUsername());
        assertEquals("Mary", response.getFirstName());
        assertEquals("Smith", response.getLastName());
        assertEquals("mary@test.com", response.getEmail());
        assertEquals("ONLINE", response.getStatus());

    }

}