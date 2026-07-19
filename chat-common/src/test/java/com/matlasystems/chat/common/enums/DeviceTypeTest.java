package com.matlasystems.chat.common.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class DeviceTypeTest {

    @Test
    void shouldContainAllDeviceTypes() {

        DeviceType[] values =
                DeviceType.values();

        assertEquals(5, values.length);

        assertEquals(DeviceType.DESKTOP, values[0]);
        assertEquals(DeviceType.WEB, values[1]);
        assertEquals(DeviceType.MOBILE, values[2]);
        assertEquals(DeviceType.TABLET, values[3]);
        assertEquals(DeviceType.SERVER, values[4]);

    }

    @Test
    void shouldReturnCorrectValueOf() {

        assertEquals(DeviceType.DESKTOP,
                DeviceType.valueOf("DESKTOP"));

        assertEquals(DeviceType.WEB,
                DeviceType.valueOf("WEB"));

        assertEquals(DeviceType.MOBILE,
                DeviceType.valueOf("MOBILE"));

        assertEquals(DeviceType.TABLET,
                DeviceType.valueOf("TABLET"));

        assertEquals(DeviceType.SERVER,
                DeviceType.valueOf("SERVER"));

    }

    @Test
    void shouldReturnCorrectNames() {

        assertEquals("DESKTOP",
                DeviceType.DESKTOP.name());

        assertEquals("WEB",
                DeviceType.WEB.name());

        assertEquals("MOBILE",
                DeviceType.MOBILE.name());

        assertEquals("TABLET",
                DeviceType.TABLET.name());

        assertEquals("SERVER",
                DeviceType.SERVER.name());

    }

}