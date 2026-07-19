package com.matlasystems.chat.common.models;

import com.matlasystems.chat.common.enums.Role;
import com.matlasystems.chat.common.enums.UserPresence;
import com.matlasystems.chat.common.enums.UserStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void shouldCreateUser() {

        User user = new User();

        user.setId(1L);
        user.setUsername("kutlwano");
        user.setFirstName("Kutlwano");
        user.setLastName("Matlala");
        user.setEmail("kutlwano@test.com");
        user.setStatus(UserStatus.ACTIVE);
        user.setPresence(UserPresence.ONLINE);
        user.setRole(Role.USER);

        assertEquals(1L, user.getId());
        assertEquals("kutlwano", user.getUsername());
        assertEquals("Kutlwano", user.getFirstName());
        assertEquals("Matlala", user.getLastName());
        assertEquals("kutlwano@test.com", user.getEmail());

        assertEquals(UserStatus.ACTIVE,
                user.getStatus());

        assertEquals(UserPresence.ONLINE,
                user.getPresence());

        assertEquals(Role.USER,
                user.getRole());

    }

    @Test
    void shouldUpdatePresence() {

        User user = new User();

        user.setPresence(UserPresence.OFFLINE);

        assertEquals(UserPresence.OFFLINE,
                user.getPresence());

        user.setPresence(UserPresence.ONLINE);

        assertEquals(UserPresence.ONLINE,
                user.getPresence());

    }

    @Test
    void shouldUpdateStatus() {

        User user = new User();

        user.setStatus(UserStatus.PENDING_VERIFICATION);

        assertEquals(UserStatus.PENDING_VERIFICATION,
                user.getStatus());

        user.setStatus(UserStatus.ACTIVE);

        assertEquals(UserStatus.ACTIVE,
                user.getStatus());

    }

    @Test
    void shouldChangeRole() {

        User user = new User();

        user.setRole(Role.USER);

        assertEquals(Role.USER,
                user.getRole());

        user.setRole(Role.ADMINISTRATOR);

        assertEquals(Role.ADMINISTRATOR,
                user.getRole());

    }

}