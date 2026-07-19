/*
Represents information sent by a client when requesting to upload a file to the chat platfom;
It contains metadata required to identify who is uploading the file where it belongs and 
what the file represents before the backend stores it
 */


package com.matlasystems.chat.common.dto.file;

public class FileUploadRequest {

    private Long senderId;

    private Long chatId;

    private String fileName;

    private String fileType;

    private Long fileSize;

    private String description;

    public FileUploadRequest() {
    }

    public FileUploadRequest(Long senderId,
                             Long chatId,
                             String fileName,
                             String fileType,
                             Long fileSize,
                             String description) {

        this.senderId = senderId;
        this.chatId = chatId;
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileSize = fileSize;
        this.description = description;
    }

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}