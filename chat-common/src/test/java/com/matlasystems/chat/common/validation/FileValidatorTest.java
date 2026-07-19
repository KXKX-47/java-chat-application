package com.matlasystems.chat.common.validation;

import com.matlasystems.chat.common.constants.FileConstants;
import com.matlasystems.chat.common.enums.FileType;
import com.matlasystems.chat.common.exceptions.ValidationException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class FileValidatorTest {

    @Test
    @DisplayName("Should accept a valid image")
    void shouldAcceptValidImage() {

        assertDoesNotThrow(() ->
                FileValidator.validate(
                        "photo.jpg",
                        1024L,
                        FileType.IMAGE));

    }

    @Test
    @DisplayName("Should accept a valid document")
    void shouldAcceptValidDocument() {

        assertDoesNotThrow(() ->
                FileValidator.validate(
                        "report.pdf",
                        1024L,
                        FileType.DOCUMENT));

    }

    @Test
    @DisplayName("Should accept a valid video")
    void shouldAcceptValidVideo() {

        assertDoesNotThrow(() ->
                FileValidator.validate(
                        "movie.mp4",
                        1024L,
                        FileType.VIDEO));

    }

    @Test
    @DisplayName("Should accept a valid audio")
    void shouldAcceptValidAudio() {

        assertDoesNotThrow(() ->
                FileValidator.validate(
                        "song.mp3",
                        1024L,
                        FileType.AUDIO));

    }

    @Test
    @DisplayName("Should reject null filename")
    void shouldRejectNullFilename() {

        assertThrowsExactly(
                ValidationException.class,
                () -> FileValidator.validate(
                        null,
                        1024L,
                        FileType.IMAGE));

    }

    @Test
    @DisplayName("Should reject blank filename")
    void shouldRejectBlankFilename() {

        assertThrowsExactly(
                ValidationException.class,
                () -> FileValidator.validate(
                        "",
                        1024L,
                        FileType.IMAGE));

    }

    @Test
    @DisplayName("Should reject null file type")
    void shouldRejectNullFileType() {

        assertThrowsExactly(
                ValidationException.class,
                () -> FileValidator.validate(
                        "photo.jpg",
                        1024L,
                        null));

    }

    @Test
    @DisplayName("Should reject oversized image")
    void shouldRejectOversizedImage() {

        assertThrowsExactly(
                ValidationException.class,
                () -> FileValidator.validate(
                        "photo.jpg",
                        FileConstants.MAX_IMAGE_SIZE + 1,
                        FileType.IMAGE));

    }

    @Test
    @DisplayName("Should reject invalid image extension")
    void shouldRejectInvalidImageExtension() {

        assertThrowsExactly(
                ValidationException.class,
                () -> FileValidator.validate(
                        "photo.exe",
                        1024L,
                        FileType.IMAGE));

    }

    @Test
    @DisplayName("Should reject invalid document extension")
    void shouldRejectInvalidDocumentExtension() {

        assertThrowsExactly(
                ValidationException.class,
                () -> FileValidator.validate(
                        "report.exe",
                        1024L,
                        FileType.DOCUMENT));

    }

    @Test
    @DisplayName("Should reject invalid video extension")
    void shouldRejectInvalidVideoExtension() {

        assertThrowsExactly(
                ValidationException.class,
                () -> FileValidator.validate(
                        "movie.exe",
                        1024L,
                        FileType.VIDEO));

    }

    @Test
    @DisplayName("Should reject invalid audio extension")
    void shouldRejectInvalidAudioExtension() {

        assertThrowsExactly(
                ValidationException.class,
                () -> FileValidator.validate(
                        "song.exe",
                        1024L,
                        FileType.AUDIO));

    }

}