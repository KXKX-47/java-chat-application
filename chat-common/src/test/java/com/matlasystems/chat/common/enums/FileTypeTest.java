package com.matlasystems.chat.common.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class FileTypeTest {

    @Test
    void shouldContainAllFileTypes() {

        FileType[] values =
                FileType.values();

        assertEquals(6, values.length);

        assertEquals(FileType.IMAGE, values[0]);
        assertEquals(FileType.VIDEO, values[1]);
        assertEquals(FileType.AUDIO, values[2]);
        assertEquals(FileType.DOCUMENT, values[3]);
        assertEquals(FileType.ARCHIVE, values[4]);
        assertEquals(FileType.OTHER, values[5]);

    }

    @Test
    void shouldReturnCorrectValueOf() {

        assertEquals(FileType.IMAGE,
                FileType.valueOf("IMAGE"));

        assertEquals(FileType.VIDEO,
                FileType.valueOf("VIDEO"));

        assertEquals(FileType.AUDIO,
                FileType.valueOf("AUDIO"));

        assertEquals(FileType.DOCUMENT,
                FileType.valueOf("DOCUMENT"));

        assertEquals(FileType.ARCHIVE,
                FileType.valueOf("ARCHIVE"));

        assertEquals(FileType.OTHER,
                FileType.valueOf("OTHER"));

    }

    @Test
    void shouldReturnCorrectNames() {

        assertEquals("IMAGE", FileType.IMAGE.name());
        assertEquals("VIDEO", FileType.VIDEO.name());
        assertEquals("AUDIO", FileType.AUDIO.name());
        assertEquals("DOCUMENT", FileType.DOCUMENT.name());
        assertEquals("ARCHIVE", FileType.ARCHIVE.name());
        assertEquals("OTHER", FileType.OTHER.name());

    }

}