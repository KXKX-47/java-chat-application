package com.matlasystems.chat.common.dto.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class ChangePasswordRequestTest {

    @Test
    void shouldCreateDefaultChangePasswordRequest() {

        ChangePasswordRequest request =
                new ChangePasswordRequest();

        assertNull(request.getCurrentPassword());
        assertNull(request.getNewPassword());
        assertNull(request.getConfirmPassword());

    }

    @Test
    void shouldCreateUsingConstructor() {

        ChangePasswordRequest request =
                new ChangePasswordRequest(
                        "oldPassword",
                        "newPassword",
                        "newPassword");

        assertEquals("oldPassword", request.getCurrentPassword());
        assertEquals("newPassword", request.getNewPassword());
        assertEquals("newPassword", request.getConfirmPassword());

    }

    @Test
    void shouldSetAndGetValues() {

        ChangePasswordRequest request =
                new ChangePasswordRequest();

        request.setCurrentPassword("current123");
        request.setNewPassword("password456");
        request.setConfirmPassword("password456");

        assertEquals("current123", request.getCurrentPassword());
        assertEquals("password456", request.getNewPassword());
        assertEquals("password456", request.getConfirmPassword());

    }

}