package com.matlasystems.chat.common.util;

import com.matlasystems.chat.common.constants.FileConstants;
import com.matlasystems.chat.common.exceptions.FileStorageException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FileUtilTest {

    @Test
    void shouldReturnFileExtension() {

        assertEquals(
                "txt",
                FileUtil.getExtension("document.txt"));

    }

    @Test
    void shouldReturnBaseName() {

        assertEquals(
                "document",
                FileUtil.getBaseName("document.txt"));

    }

    @Test
    void shouldReturnBaseNameWhenNoExtensionExists() {

        assertEquals(
                "document",
                FileUtil.getBaseName("document"));

    }

    @Test
    void shouldThrowExceptionWhenExtensionMissing() {

        assertThrows(
                FileStorageException.class,
                () -> FileUtil.getExtension("document"));

    }

    @Test
    void shouldThrowExceptionForBlankFilename() {

        assertThrows(
                FileStorageException.class,
                () -> FileUtil.getExtension(""));

    }

    @Test
    void shouldDetectAllowedExtension() {

        assertTrue(
                FileUtil.hasAllowedExtension(
                        "image.png",
                        Set.of("png", "jpg")));

    }

    @Test
    void shouldRejectUnsupportedExtension() {

        assertFalse(
                FileUtil.hasAllowedExtension(
                        "image.gif",
                        Set.of("png", "jpg")));

    }

    @Test
    void shouldValidateImage() {

        assertDoesNotThrow(() ->
                FileUtil.validateImage(
                        "photo.jpg",
                        1024));

    }

    @Test
    void shouldRejectUnsupportedImage() {

        assertThrows(
                FileStorageException.class,
                () -> FileUtil.validateImage(
                        "photo.exe",
                        1024));

    }

    @Test
    void shouldValidateDocument() {

        assertDoesNotThrow(() ->
                FileUtil.validateDocument(
                        "report.pdf",
                        1024));

    }

    @Test
    void shouldValidateVideo() {

        assertDoesNotThrow(() ->
                FileUtil.validateVideo(
                        "movie.mp4",
                        1024));

    }

        @Test
        void shouldRejectZeroByteImage() {

        assertThrows(
                FileStorageException.class,
                () -> FileUtil.validateImage(
                        "photo.jpg",
                        0));

        }

        @Test
        void shouldRejectOversizedImage() {

        assertThrows(
                FileStorageException.class,
                () -> FileUtil.validateImage(
                        "photo.jpg",
                        FileConstants.MAX_IMAGE_SIZE + 1));

        }

        @Test
        void shouldRejectOversizedDocument() {

        assertThrows(
                FileStorageException.class,
                () -> FileUtil.validateDocument(
                        "report.pdf",
                        FileConstants.MAX_DOCUMENT_SIZE + 1));

        }

        @Test
        void shouldRejectOversizedVideo() {

        assertThrows(
                FileStorageException.class,
                () -> FileUtil.validateVideo(
                        "movie.mp4",
                        FileConstants.MAX_VIDEO_SIZE + 1));

        }

        @Test
        void shouldRejectOversizedAudio() {

        assertThrows(
                FileStorageException.class,
                () -> FileUtil.validateAudio(
                        "music.mp3",
                        FileConstants.MAX_AUDIO_SIZE + 1));

        }

    @Test
    void shouldDetectExistingFile() throws IOException {

        Path file = Files.createTempFile("chat", ".txt");

        assertTrue(
                FileUtil.exists(file.toString()));

        Files.deleteIfExists(file);

    }

    @Test
    void shouldReturnFalseForMissingFile() {

        assertFalse(
                FileUtil.exists("missing-file.txt"));

    }

    @Test
    void shouldDetectDirectory() throws IOException {

        Path directory = Files.createTempDirectory("chat");

        assertTrue(
                FileUtil.isDirectory(directory.toString()));

        Files.deleteIfExists(directory);

    }

    @Test
    void shouldReturnFileSize() throws IOException {

        Path file = Files.createTempFile("chat", ".txt");

        Files.writeString(file, "Hello");

        assertEquals(
                5,
                FileUtil.size(file.toString()));

        Files.deleteIfExists(file);

    }

    @Test
    void shouldThrowExceptionWhenFileDoesNotExist() {

        assertThrows(
                FileStorageException.class,
                () -> FileUtil.size("missing.txt"));

    }

}