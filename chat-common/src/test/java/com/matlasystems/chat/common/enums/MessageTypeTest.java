package com.matlasystems.chat.common.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MessageTypeTest {

    @Test
    void shouldContainAllMessageTypes() {

        MessageType[] values = MessageType.values();

        assertEquals(8, values.length);

        assertEquals(MessageType.TEXT, values[0]);
        assertEquals(MessageType.IMAGE, values[1]);
        assertEquals(MessageType.VIDEO, values[2]);
        assertEquals(MessageType.AUDIO, values[3]);
        assertEquals(MessageType.DOCUMENT, values[4]);
        assertEquals(MessageType.LOCATION, values[5]);
        assertEquals(MessageType.CONTACT, values[6]);
        assertEquals(MessageType.SYSTEM, values[7]);

    }

    @Test
    void shouldReturnCorrectValueOf() {

        assertEquals(MessageType.TEXT,
                MessageType.valueOf("TEXT"));

        assertEquals(MessageType.IMAGE,
                MessageType.valueOf("IMAGE"));

        assertEquals(MessageType.VIDEO,
                MessageType.valueOf("VIDEO"));

        assertEquals(MessageType.AUDIO,
                MessageType.valueOf("AUDIO"));

        assertEquals(MessageType.DOCUMENT,
                MessageType.valueOf("DOCUMENT"));

        assertEquals(MessageType.LOCATION,
                MessageType.valueOf("LOCATION"));

        assertEquals(MessageType.CONTACT,
                MessageType.valueOf("CONTACT"));

        assertEquals(MessageType.SYSTEM,
                MessageType.valueOf("SYSTEM"));

    }

    @Test
    void shouldReturnCorrectNames() {

        assertEquals("TEXT", MessageType.TEXT.name());
        assertEquals("IMAGE", MessageType.IMAGE.name());
        assertEquals("VIDEO", MessageType.VIDEO.name());
        assertEquals("AUDIO", MessageType.AUDIO.name());
        assertEquals("DOCUMENT", MessageType.DOCUMENT.name());
        assertEquals("LOCATION", MessageType.LOCATION.name());
        assertEquals("CONTACT", MessageType.CONTACT.name());
        assertEquals("SYSTEM", MessageType.SYSTEM.name());

    }

}