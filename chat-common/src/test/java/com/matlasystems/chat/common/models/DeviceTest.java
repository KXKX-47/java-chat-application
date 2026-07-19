package com.matlasystems.chat.common.models;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.matlasystems.chat.common.enums.DeviceType;

class DeviceTest {

    @Test
    void shouldCreateEmptyDevice() {

        Device device = new Device();

        assertNotNull(device);

        assertNull(device.getId());
        assertNull(device.getUserId());
        assertNull(device.getDeviceType());
        assertNull(device.getDeviceName());
        assertNull(device.getOperatingSystem());
        assertNull(device.getOperatingSystemVersion());
        assertNull(device.getApplicationVersion());
        assertNull(device.getIpAddress());
        assertNull(device.getMacAddress());
        assertNull(device.getLocation());
        assertFalse(device.isTrusted());
        assertNull(device.getLastLogin());

    }

    @Test
    void shouldCreateDeviceUsingConstructor() {

        LocalDateTime loginTime = LocalDateTime.now();

        Device device = new Device(
                1L,
                100L,
                DeviceType.DESKTOP,
                "Office Laptop",
                "Ubuntu",
                "24.04",
                "1.0.0",
                "192.168.1.10",
                "AA:BB:CC:DD:EE:FF",
                "Pretoria",
                true,
                loginTime
        );

        assertEquals(1L, device.getId());
        assertEquals(100L, device.getUserId());
        assertEquals(DeviceType.DESKTOP, device.getDeviceType());
        assertEquals("Office Laptop", device.getDeviceName());
        assertEquals("Ubuntu", device.getOperatingSystem());
        assertEquals("24.04", device.getOperatingSystemVersion());
        assertEquals("1.0.0", device.getApplicationVersion());
        assertEquals("192.168.1.10", device.getIpAddress());
        assertEquals("AA:BB:CC:DD:EE:FF", device.getMacAddress());
        assertEquals("Pretoria", device.getLocation());
        assertTrue(device.isTrusted());
        assertEquals(loginTime, device.getLastLogin());

    }

    @Test
    void shouldUpdateDeviceProperties() {

        LocalDateTime loginTime = LocalDateTime.now();

        Device device = new Device();

        device.setId(10L);
        device.setUserId(20L);
        device.setDeviceType(DeviceType.MOBILE);
        device.setDeviceName("Samsung S25");
        device.setOperatingSystem("Android");
        device.setOperatingSystemVersion("16");
        device.setApplicationVersion("2.0.1");
        device.setIpAddress("10.0.0.15");
        device.setMacAddress("11:22:33:44:55:66");
        device.setLocation("Johannesburg");
        device.setTrusted(true);
        device.setLastLogin(loginTime);

        assertEquals(10L, device.getId());
        assertEquals(20L, device.getUserId());
        assertEquals(DeviceType.MOBILE, device.getDeviceType());
        assertEquals("Samsung S25", device.getDeviceName());
        assertEquals("Android", device.getOperatingSystem());
        assertEquals("16", device.getOperatingSystemVersion());
        assertEquals("2.0.1", device.getApplicationVersion());
        assertEquals("10.0.0.15", device.getIpAddress());
        assertEquals("11:22:33:44:55:66", device.getMacAddress());
        assertEquals("Johannesburg", device.getLocation());
        assertTrue(device.isTrusted());
        assertEquals(loginTime, device.getLastLogin());

    }

    @Test
    void shouldBeEqualWhenIdsAreEqual() {

        Device first = new Device();
        first.setId(1L);

        Device second = new Device();
        second.setId(1L);

        assertEquals(first, second);
        assertEquals(first.hashCode(), second.hashCode());

    }

    @Test
    void shouldNotBeEqualWhenIdsAreDifferent() {

        Device first = new Device();
        first.setId(1L);

        Device second = new Device();
        second.setId(2L);

        assertNotEquals(first, second);

    }

    @Test
    void shouldNotBeEqualToNull() {

        Device device = new Device();
        device.setId(1L);

        assertNotEquals(null, device);

    }

    @Test
    void shouldNotBeEqualToDifferentObjectType() {

        Device device = new Device();
        device.setId(1L);

        assertNotEquals(device, "Device");

    }

    @Test
    void shouldGenerateHashCode() {

        Device device = new Device();
        device.setId(1L);

        assertEquals(java.util.Objects.hash(1L), device.hashCode());

    }

    @Test
    void shouldGenerateToString() {

        Device device = new Device();

        device.setId(1L);
        device.setUserId(100L);
        device.setDeviceType(DeviceType.DESKTOP);
        device.setDeviceName("Office Laptop");

        String result = device.toString();

        assertNotNull(result);
        assertTrue(result.contains("Device"));
        assertTrue(result.contains("id=1"));
        assertTrue(result.contains("userId=100"));
        assertTrue(result.contains("DESKTOP"));
        assertTrue(result.contains("Office Laptop"));

    }

}