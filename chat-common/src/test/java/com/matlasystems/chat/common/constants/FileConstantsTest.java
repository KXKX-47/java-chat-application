package com.matlasystems.chat.common.constants;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class FileConstantsTest {

    @Test
    void shouldContainExpectedFileSizeConstants() {

        assertEquals(1024L, FileConstants.KB);
        assertEquals(1048576L, FileConstants.MB);
        assertEquals(1073741824L, FileConstants.GB);

        assertEquals(10 * FileConstants.MB,
                FileConstants.MAX_IMAGE_SIZE);

        assertEquals(50 * FileConstants.MB,
                FileConstants.MAX_DOCUMENT_SIZE);

        assertEquals(500 * FileConstants.MB,
                FileConstants.MAX_VIDEO_SIZE);

        assertEquals(100 * FileConstants.MB,
                FileConstants.MAX_AUDIO_SIZE);

        assertEquals(5 * FileConstants.MB,
                FileConstants.MAX_AVATAR_SIZE);

    }

    @Test
    void shouldContainExpectedExtensions() {

        assertTrue(FileConstants.IMAGE_EXTENSIONS.contains("jpg"));
        assertTrue(FileConstants.IMAGE_EXTENSIONS.contains("png"));

        assertTrue(FileConstants.DOCUMENT_EXTENSIONS.contains("pdf"));
        assertTrue(FileConstants.DOCUMENT_EXTENSIONS.contains("docx"));

        assertTrue(FileConstants.VIDEO_EXTENSIONS.contains("mp4"));
        assertTrue(FileConstants.VIDEO_EXTENSIONS.contains("mkv"));

        assertTrue(FileConstants.AUDIO_EXTENSIONS.contains("mp3"));
        assertTrue(FileConstants.AUDIO_EXTENSIONS.contains("wav"));

    }

    @Test
    void shouldContainExpectedDirectories() {

        assertEquals("uploads/",
                FileConstants.UPLOAD_DIRECTORY);

        assertEquals("uploads/images/",
                FileConstants.IMAGE_DIRECTORY);

        assertEquals("uploads/documents/",
                FileConstants.DOCUMENT_DIRECTORY);

        assertEquals("uploads/videos/",
                FileConstants.VIDEO_DIRECTORY);

        assertEquals("uploads/audio/",
                FileConstants.AUDIO_DIRECTORY);

        assertEquals("uploads/avatars/",
                FileConstants.AVATAR_DIRECTORY);

    }

    @Test
    void shouldContainExpectedMiscConstants() {

        assertEquals("default-avatar.png",
                FileConstants.DEFAULT_AVATAR);

        assertEquals("temp_",
                FileConstants.TEMP_FILE_PREFIX);

        assertEquals("image/",
                FileConstants.MIME_IMAGE);

        assertEquals("video/",
                FileConstants.MIME_VIDEO);

        assertEquals("audio/",
                FileConstants.MIME_AUDIO);

        assertEquals("application/",
                FileConstants.MIME_APPLICATION);

        assertEquals(255,
                FileConstants.MAX_FILENAME_LENGTH);

        assertEquals("/",
                FileConstants.FILE_SEPARATOR);

    }

    @Test
    void shouldHavePrivateConstructor() throws Exception {

        Constructor<FileConstants> constructor =
                FileConstants.class.getDeclaredConstructor();

        assertTrue(Modifier.isPrivate(constructor.getModifiers()));

        constructor.setAccessible(true);

        assertNotNull(constructor.newInstance());

    }

}