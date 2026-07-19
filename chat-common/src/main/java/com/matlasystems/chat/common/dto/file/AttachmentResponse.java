/*
Represents a file attachement that is associated with a chat message and returned to clients when
retrieving messages or convrsations
 */

package com.matlasystems.chat.common.dto.file;

public class AttachmentResponse {

    private Long attachmentId;

    private Long messageId;

    private String fileName;

    private String fileType;

    private Long fileSize;

    private String fileUrl;

    private String thumbnailUrl;

    private String uploadedBy;

    private String uploadedAt;

    public AttachmentResponse() {
    }

    public AttachmentResponse(Long attachmentId,
                              Long messageId,
                              String fileName,
                              String fileType,
                              Long fileSize,
                              String fileUrl,
                              String thumbnailUrl,
                              String uploadedBy,
                              String uploadedAt) {

        this.attachmentId = attachmentId;
        this.messageId = messageId;
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileSize = fileSize;
        this.fileUrl = fileUrl;
        this.thumbnailUrl = thumbnailUrl;
        this.uploadedBy = uploadedBy;
        this.uploadedAt = uploadedAt;
    }

    public Long getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(Long attachmentId) {
        this.attachmentId = attachmentId;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getUploadedBy() {
        return uploadedBy;
    }

    public void setUploadedBy(String uploadedBy) {
        this.uploadedBy = uploadedBy;
    }

    public String getUploadedAt() {
        return uploadedAt;
    }

    public void setUploadedAt(String uploadedAt) {
        this.uploadedAt = uploadedAt;
    }

}