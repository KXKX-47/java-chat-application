/*
Represents the servers response ater a file has been successfully uploaded. It informs the client
whether the upload succeeded and returns important informatioin about the stored file, such as
its identifier , storage location and metadata
 */


package com.matlasystems.chat.common.dto.file;

public class FileUploadResponse {

    private Long fileId;

    private String fileName;

    private String fileType;

    private Long fileSize;

    private String fileUrl;

    private String uploadTime;

    private boolean uploaded;

    public FileUploadResponse() {
    }

    public FileUploadResponse(Long fileId,
                              String fileName,
                              String fileType,
                              Long fileSize,
                              String fileUrl,
                              String uploadTime,
                              boolean uploaded) {

        this.fileId = fileId;
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileSize = fileSize;
        this.fileUrl = fileUrl;
        this.uploadTime = uploadTime;
        this.uploaded = uploaded;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
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

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }

    public boolean isUploaded() {
        return uploaded;
    }

    public void setUploaded(boolean uploaded) {
        this.uploaded = uploaded;
    }

}