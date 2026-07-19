/*
Represents an entire conversaion , including its metadata and messages

*/


package com.matlasystems.chat.common.dto.chat;

import java.util.List;

public class ConversationResponse {

    private Long conversationId;
    private String conversationName;
    private String conversationType;
    private List<MessageResponse> messages;

    public ConversationResponse() {

    }

    public ConversationResponse(Long conversationId,String conversationName,String conversationType,
    List<MessageResponse> messages) {

        this.conversationId = conversationId;
        this.conversationName = conversationName;
        this.conversationType = conversationType;
        this.messages = messages;
    }

    public Long getConversationId() {

        return conversationId;
    }

    public void setConversationId(Long conversationId) {

        this.conversationId = conversationId;
    }

    public String getConversationName() {

        return conversationName;
    }

    public void setConversationName(String conversationName) {

        this.conversationName = conversationName;
    }

    public String getConversationType() {

        return conversationType;
    }

    public void setConversationType(String conversationType) {

        this.conversationType = conversationType;
    }

    public List<MessageResponse> getMessages() {

        return messages;
    }

    public void setMessages(List<MessageResponse> messages) {

        this.messages = messages;
    }


}