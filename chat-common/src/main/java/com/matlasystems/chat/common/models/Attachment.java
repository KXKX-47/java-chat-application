/*
Represents a file attached to a chat message
 */

package com.matlasystems.chat.common.models;

import java.time.LocalDateTime;

import com.matlasystems.chat.common.enums.FileType;

public class Attachment {

    private Long id;

    private Long messageId;

    private Long uploadedBy;

    private String originalFileName;

    private String storedFileName;

    private String fileUrl;

    private String mimeType;

    private FileType fileType;

    private long fileSize;

    private String fileExtension;

    private LocalDateTime uploadedAt;

    public Attachment() {
    }

    public Attachment(Long id,
                      Long messageId,
                      Long uploadedBy,
                      String originalFileName,
                      String storedFileName,
                      String fileUrl,
                      String mimeType,
                      FileType fileType,
                      long fileSize,
                      String fileExtension,
                      LocalDateTime uploadedAt) {

        this.id = id;
        this.messageId = messageId;
        this.uploadedBy = uploadedBy;
        this.originalFileName = originalFileName;
        this.storedFileName = storedFileName;
        this.fileUrl = fileUrl;
        this.mimeType = mimeType;
        this.fileType = fileType;
        this.fileSize = fileSize;
        this.fileExtension = fileExtension;
        this.uploadedAt = uploadedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public Long getUploadedBy() {
        return uploadedBy;
    }

    public void setUploadedBy(Long uploadedBy) {
        this.uploadedBy = uploadedBy;
    }

    public String getOriginalFileName() {
        return originalFileName;
    }

    public void setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
    }

    public String getStoredFileName() {
        return storedFileName;
    }

    public void setStoredFileName(String storedFileName) {
        this.storedFileName = storedFileName;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public LocalDateTime getUploadedAt() {
        return uploadedAt;
    }

    public void setUploadedAt(LocalDateTime uploadedAt) {
        this.uploadedAt = uploadedAt;
    }

}