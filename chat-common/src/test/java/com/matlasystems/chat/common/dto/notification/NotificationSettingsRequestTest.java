package com.matlasystems.chat.common.dto.notification;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class NotificationSettingsRequestTest {

    @Test
    void shouldCreateDefaultNotificationSettingsRequest() {

        NotificationSettingsRequest request =
                new NotificationSettingsRequest();

        assertNull(request.getUserId());
        assertFalse(request.isEmailNotifications());
        assertFalse(request.isPushNotifications());
        assertFalse(request.isSmsNotifications());
        assertFalse(request.isDesktopNotifications());
        assertFalse(request.isSoundEnabled());
        assertFalse(request.isVibrationEnabled());

    }

    @Test
    void shouldCreateUsingConstructor() {

        NotificationSettingsRequest request =
                new NotificationSettingsRequest(
                        1L,
                        true,
                        true,
                        false,
                        true,
                        true,
                        false);

        assertEquals(1L, request.getUserId());
        assertTrue(request.isEmailNotifications());
        assertTrue(request.isPushNotifications());
        assertFalse(request.isSmsNotifications());
        assertTrue(request.isDesktopNotifications());
        assertTrue(request.isSoundEnabled());
        assertFalse(request.isVibrationEnabled());

    }

    @Test
    void shouldSetAndGetValues() {

        NotificationSettingsRequest request =
                new NotificationSettingsRequest();

        request.setUserId(99L);
        request.setEmailNotifications(true);
        request.setPushNotifications(false);
        request.setSmsNotifications(true);
        request.setDesktopNotifications(true);
        request.setSoundEnabled(false);
        request.setVibrationEnabled(true);

        assertEquals(99L, request.getUserId());
        assertTrue(request.isEmailNotifications());
        assertFalse(request.isPushNotifications());
        assertTrue(request.isSmsNotifications());
        assertTrue(request.isDesktopNotifications());
        assertFalse(request.isSoundEnabled());
        assertTrue(request.isVibrationEnabled());

    }

}