package com.matlasystems.chat.common.dto.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class UserRequestTest {

    @Test
    void shouldCreateDefaultUserRequest() {

        UserRequest request =
                new UserRequest();

        assertNull(request.getUsername());
        assertNull(request.getFirstName());
        assertNull(request.getLastName());
        assertNull(request.getEmail());
        assertNull(request.getPassword());
        assertNull(request.getConfirmPassword());

    }

    @Test
    void shouldCreateUsingConstructor() {

        UserRequest request =
                new UserRequest(
                        "john",
                        "John",
                        "Doe",
                        "john@test.com",
                        "password",
                        "password");

        assertEquals("john", request.getUsername());
        assertEquals("John", request.getFirstName());
        assertEquals("Doe", request.getLastName());
        assertEquals("john@test.com", request.getEmail());
        assertEquals("password", request.getPassword());
        assertEquals("password", request.getConfirmPassword());

    }

    @Test
    void shouldSetAndGetValues() {

        UserRequest request =
                new UserRequest();

        request.setUsername("mary");
        request.setFirstName("Mary");
        request.setLastName("Smith");
        request.setEmail("mary@test.com");
        request.setPassword("secret");
        request.setConfirmPassword("secret");

        assertEquals("mary", request.getUsername());
        assertEquals("Mary", request.getFirstName());
        assertEquals("Smith", request.getLastName());
        assertEquals("mary@test.com", request.getEmail());
        assertEquals("secret", request.getPassword());
        assertEquals("secret", request.getConfirmPassword());

    }

    @Test
    void shouldBeEqualWhenFieldsMatch() {

        UserRequest first =
                new UserRequest(
                        "john",
                        "John",
                        "Doe",
                        "john@test.com",
                        "password1",
                        "password2");

        UserRequest second =
                new UserRequest(
                        "john",
                        "John",
                        "Doe",
                        "john@test.com",
                        "differentPassword",
                        "anotherPassword");

        assertEquals(first, second);
        assertEquals(first.hashCode(), second.hashCode());

    }

    @Test
    void shouldNotBeEqualWhenUsernameDiffers() {

        UserRequest first =
                new UserRequest(
                        "john",
                        "John",
                        "Doe",
                        "john@test.com",
                        "password",
                        "password");

        UserRequest second =
                new UserRequest(
                        "mary",
                        "John",
                        "Doe",
                        "john@test.com",
                        "password",
                        "password");

        assertNotEquals(first, second);

    }

    @Test
    void shouldReturnUsefulToString() {

        UserRequest request =
                new UserRequest(
                        "john",
                        "John",
                        "Doe",
                        "john@test.com",
                        "password",
                        "password");

        String text = request.toString();

        assertTrue(text.contains("john"));
        assertTrue(text.contains("John"));
        assertTrue(text.contains("Doe"));
        assertTrue(text.contains("john@test.com"));

        assertFalse(text.contains("password"));

    }

}