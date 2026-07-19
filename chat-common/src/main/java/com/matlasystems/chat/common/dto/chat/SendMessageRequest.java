/*
Represents a request sent by a client to create and send a new message
*/


package com.matlasystems.chat.common.dto.chat;

public class SendMessageRequest {

    private Long senderId;
    private Long receiverId;
    private Long conversationId;
    private String message;
    private String messageType;

    public SendMessageRequest() {
    }

    public SendMessageRequest(Long senderId,
                              Long receiverId,
                              Long conversationId,
                              String message,
                              String messageType) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.conversationId = conversationId;
        this.message = message;
        this.messageType = messageType;
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

}