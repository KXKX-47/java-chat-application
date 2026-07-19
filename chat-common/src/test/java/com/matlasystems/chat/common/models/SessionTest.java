package com.matlasystems.chat.common.models;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.matlasystems.chat.common.enums.DeviceType;

class SessionTest {

    @Test
    void shouldCreateSession() {

        LocalDateTime loginTime = LocalDateTime.now();
        LocalDateTime lastActivity = loginTime.plusMinutes(5);
        LocalDateTime expiresAt = loginTime.plusHours(1);

        Session session = new Session();

        session.setId(1L);
        session.setUserId(99L);
        session.setSessionId("SESSION-001");
        session.setAccessToken("access-token");
        session.setRefreshToken("refresh-token");
        session.setIpAddress("192.168.1.100");
        session.setDeviceName("Dell Laptop");
        session.setDeviceType(DeviceType.DESKTOP);
        session.setOperatingSystem("Ubuntu 24.04");
        session.setBrowser("Firefox");
        session.setLocation("Pretoria");
        session.setLoginTime(loginTime);
        session.setLastActivity(lastActivity);
        session.setExpiresAt(expiresAt);
        session.setActive(true);

        assertEquals(1L, session.getId());
        assertEquals(99L, session.getUserId());
        assertEquals("SESSION-001", session.getSessionId());
        assertEquals("access-token", session.getAccessToken());
        assertEquals("refresh-token", session.getRefreshToken());
        assertEquals("192.168.1.100", session.getIpAddress());
        assertEquals("Dell Laptop", session.getDeviceName());
        assertEquals(DeviceType.DESKTOP, session.getDeviceType());
        assertEquals("Ubuntu 24.04", session.getOperatingSystem());
        assertEquals("Firefox", session.getBrowser());
        assertEquals("Pretoria", session.getLocation());
        assertEquals(loginTime, session.getLoginTime());
        assertEquals(lastActivity, session.getLastActivity());
        assertEquals(expiresAt, session.getExpiresAt());
        assertTrue(session.isActive());

    }

    @Test
    void shouldUpdateAccessAndRefreshTokens() {

        Session session = new Session();

        session.setAccessToken("old-access");
        session.setRefreshToken("old-refresh");

        assertEquals("old-access", session.getAccessToken());
        assertEquals("old-refresh", session.getRefreshToken());

        session.setAccessToken("new-access");
        session.setRefreshToken("new-refresh");

        assertEquals("new-access", session.getAccessToken());
        assertEquals("new-refresh", session.getRefreshToken());

    }

    @Test
    void shouldUpdateSessionStatus() {

        Session session = new Session();

        assertFalse(session.isActive());

        session.setActive(true);

        assertTrue(session.isActive());

    }

}