/*
Represents an individual message returned from the server

*/



package com.matlasystems.chat.common.dto.chat;

public class MessageResponse {

    private Long id;
    private Long senderId;
    private Long receiverId;
    private Long conversationId;
    private String senderUsername;
    private String message;
    private String messageType;
    private String status;
    private String sentAt;

    public MessageResponse() {
    }

    public MessageResponse(Long id,
                           Long senderId,
                           Long receiverId,
                           Long conversationId,
                           String senderUsername,
                           String message,
                           String messageType,
                           String status,
                           String sentAt) {

        this.id = id;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.conversationId = conversationId;
        this.senderUsername = senderUsername;
        this.message = message;
        this.messageType = messageType;
        this.status = status;
        this.sentAt = sentAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public Long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    public Long getConversationId() {
        return conversationId;
    }

    public void setConversationId(Long conversationId) {
        this.conversationId = conversationId;
    }

    public String getSenderUsername() {
        return senderUsername;
    }

    public void setSenderUsername(String senderUsername) {
        this.senderUsername = senderUsername;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSentAt() {
        return sentAt;
    }

    public void setSentAt(String sentAt) {
        this.sentAt = sentAt;
    }

}