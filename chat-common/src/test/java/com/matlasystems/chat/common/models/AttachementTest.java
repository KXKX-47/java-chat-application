package com.matlasystems.chat.common.models;

import com.matlasystems.chat.common.enums.FileType;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AttachmentTest {

    @Test
    void shouldCreateAttachmentUsingDefaultConstructor() {

        Attachment attachment = new Attachment();

        assertNotNull(attachment);

    }

    @Test
    void shouldSetAndGetAttachmentProperties() {

        LocalDateTime uploadedAt = LocalDateTime.now();

        Attachment attachment = new Attachment();

        attachment.setId(1L);
        attachment.setMessageId(100L);
        attachment.setUploadedBy(10L);

        attachment.setOriginalFileName("image.png");
        attachment.setStoredFileName("8c4d92f1.png");

        attachment.setFileUrl("/uploads/8c4d92f1.png");

        attachment.setMimeType("image/png");

        attachment.setFileType(FileType.IMAGE);

        attachment.setFileSize(2048L);

        attachment.setFileExtension("png");

        attachment.setUploadedAt(uploadedAt);

        assertEquals(1L, attachment.getId());
        assertEquals(100L, attachment.getMessageId());
        assertEquals(10L, attachment.getUploadedBy());

        assertEquals("image.png",
                attachment.getOriginalFileName());

        assertEquals("8c4d92f1.png",
                attachment.getStoredFileName());

        assertEquals("/uploads/8c4d92f1.png",
                attachment.getFileUrl());

        assertEquals("image/png",
                attachment.getMimeType());

        assertEquals(FileType.IMAGE,
                attachment.getFileType());

        assertEquals(2048L,
                attachment.getFileSize());

        assertEquals("png",
                attachment.getFileExtension());

        assertEquals(uploadedAt,
                attachment.getUploadedAt());

    }

    @Test
    void shouldCreateAttachmentUsingConstructor() {

        LocalDateTime uploadedAt = LocalDateTime.now();

        Attachment attachment = new Attachment(

                1L,
                100L,
                10L,
                "image.png",
                "8c4d92f1.png",
                "/uploads/8c4d92f1.png",
                "image/png",
                FileType.IMAGE,
                2048L,
                "png",
                uploadedAt

        );

        assertEquals(1L, attachment.getId());

        assertEquals(100L,
                attachment.getMessageId());

        assertEquals(10L,
                attachment.getUploadedBy());

        assertEquals("image.png",
                attachment.getOriginalFileName());

        assertEquals("8c4d92f1.png",
                attachment.getStoredFileName());

        assertEquals("/uploads/8c4d92f1.png",
                attachment.getFileUrl());

        assertEquals("image/png",
                attachment.getMimeType());

        assertEquals(FileType.IMAGE,
                attachment.getFileType());

        assertEquals(2048L,
                attachment.getFileSize());

        assertEquals("png",
                attachment.getFileExtension());

        assertEquals(uploadedAt,
                attachment.getUploadedAt());

    }

}