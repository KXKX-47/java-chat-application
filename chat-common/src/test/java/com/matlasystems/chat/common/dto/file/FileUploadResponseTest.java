package com.matlasystems.chat.common.dto.file;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class FileUploadResponseTest {

    @Test
    void shouldCreateDefaultFileUploadResponse() {

        FileUploadResponse response =
                new FileUploadResponse();

        assertNull(response.getFileId());
        assertNull(response.getFileName());
        assertNull(response.getFileType());
        assertNull(response.getFileSize());
        assertNull(response.getFileUrl());
        assertNull(response.getUploadTime());
        assertFalse(response.isUploaded());

    }

    @Test
    void shouldCreateFileUploadResponseUsingConstructor() {

        FileUploadResponse response =
                new FileUploadResponse(
                        99L,
                        "contract.pdf",
                        "application/pdf",
                        40960L,
                        "/uploads/contract.pdf",
                        "2026-07-17T20:15:00",
                        true);

        assertEquals(99L, response.getFileId());
        assertEquals("contract.pdf", response.getFileName());
        assertEquals("application/pdf", response.getFileType());
        assertEquals(40960L, response.getFileSize());
        assertEquals("/uploads/contract.pdf", response.getFileUrl());
        assertEquals("2026-07-17T20:15:00", response.getUploadTime());
        assertTrue(response.isUploaded());

    }

    @Test
    void shouldSetAndGetFileUploadResponseValues() {

        FileUploadResponse response =
                new FileUploadResponse();

        response.setFileId(500L);
        response.setFileName("video.mp4");
        response.setFileType("video/mp4");
        response.setFileSize(1048576L);
        response.setFileUrl("/media/video.mp4");
        response.setUploadTime("2026-07-17");
        response.setUploaded(true);

        assertEquals(500L, response.getFileId());
        assertEquals("video.mp4", response.getFileName());
        assertEquals("video/mp4", response.getFileType());
        assertEquals(1048576L, response.getFileSize());
        assertEquals("/media/video.mp4", response.getFileUrl());
        assertEquals("2026-07-17", response.getUploadTime());
        assertTrue(response.isUploaded());

    }

}