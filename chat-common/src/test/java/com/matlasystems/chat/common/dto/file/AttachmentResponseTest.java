package com.matlasystems.chat.common.dto.file;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class AttachmentResponseTest {

    @Test
    void shouldCreateDefaultAttachmentResponse() {

        AttachmentResponse response = new AttachmentResponse();

        assertNull(response.getAttachmentId());
        assertNull(response.getMessageId());
        assertNull(response.getFileName());
        assertNull(response.getFileType());
        assertNull(response.getFileSize());
        assertNull(response.getFileUrl());
        assertNull(response.getThumbnailUrl());
        assertNull(response.getUploadedBy());
        assertNull(response.getUploadedAt());

    }

    @Test
    void shouldCreateAttachmentResponseUsingConstructor() {

        AttachmentResponse response =
                new AttachmentResponse(
                        1L,
                        100L,
                        "photo.jpg",
                        "image/jpeg",
                        2048L,
                        "/uploads/photo.jpg",
                        "/uploads/thumb_photo.jpg",
                        "john",
                        "2026-07-17T18:30:00");

        assertEquals(1L, response.getAttachmentId());
        assertEquals(100L, response.getMessageId());
        assertEquals("photo.jpg", response.getFileName());
        assertEquals("image/jpeg", response.getFileType());
        assertEquals(2048L, response.getFileSize());
        assertEquals("/uploads/photo.jpg", response.getFileUrl());
        assertEquals("/uploads/thumb_photo.jpg", response.getThumbnailUrl());
        assertEquals("john", response.getUploadedBy());
        assertEquals("2026-07-17T18:30:00", response.getUploadedAt());

    }

    @Test
    void shouldSetAndGetAttachmentResponseValues() {

        AttachmentResponse response = new AttachmentResponse();

        response.setAttachmentId(5L);
        response.setMessageId(50L);
        response.setFileName("document.pdf");
        response.setFileType("application/pdf");
        response.setFileSize(10240L);
        response.setFileUrl("/files/document.pdf");
        response.setThumbnailUrl("/files/document-thumb.png");
        response.setUploadedBy("mary");
        response.setUploadedAt("2026-07-17");

        assertEquals(5L, response.getAttachmentId());
        assertEquals(50L, response.getMessageId());
        assertEquals("document.pdf", response.getFileName());
        assertEquals("application/pdf", response.getFileType());
        assertEquals(10240L, response.getFileSize());
        assertEquals("/files/document.pdf", response.getFileUrl());
        assertEquals("/files/document-thumb.png", response.getThumbnailUrl());
        assertEquals("mary", response.getUploadedBy());
        assertEquals("2026-07-17", response.getUploadedAt());

    }

}