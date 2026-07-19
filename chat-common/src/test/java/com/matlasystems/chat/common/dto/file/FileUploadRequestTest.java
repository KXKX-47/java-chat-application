package com.matlasystems.chat.common.dto.file;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class FileUploadRequestTest {

    @Test
    void shouldCreateDefaultFileUploadRequest() {

        FileUploadRequest request = new FileUploadRequest();

        assertNull(request.getSenderId());
        assertNull(request.getChatId());
        assertNull(request.getFileName());
        assertNull(request.getFileType());
        assertNull(request.getFileSize());
        assertNull(request.getDescription());

    }

    @Test
    void shouldCreateFileUploadRequestUsingConstructor() {

        FileUploadRequest request =
                new FileUploadRequest(
                        1L,
                        200L,
                        "image.png",
                        "image/png",
                        5120L,
                        "Profile picture");

        assertEquals(1L, request.getSenderId());
        assertEquals(200L, request.getChatId());
        assertEquals("image.png", request.getFileName());
        assertEquals("image/png", request.getFileType());
        assertEquals(5120L, request.getFileSize());
        assertEquals("Profile picture", request.getDescription());

    }

    @Test
    void shouldSetAndGetFileUploadRequestValues() {

        FileUploadRequest request = new FileUploadRequest();

        request.setSenderId(10L);
        request.setChatId(300L);
        request.setFileName("report.pdf");
        request.setFileType("application/pdf");
        request.setFileSize(20480L);
        request.setDescription("Monthly report");

        assertEquals(10L, request.getSenderId());
        assertEquals(300L, request.getChatId());
        assertEquals("report.pdf", request.getFileName());
        assertEquals("application/pdf", request.getFileType());
        assertEquals(20480L, request.getFileSize());
        assertEquals("Monthly report", request.getDescription());

    }

}