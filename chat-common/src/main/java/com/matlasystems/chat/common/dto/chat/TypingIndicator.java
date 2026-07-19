/*
Represents a real time typing event between users

*/



package com.matlasystems.chat.common.dto.chat;

public class TypingIndicator {

    private Long conversationId;
    private Long userId;
    private String username;
    private boolean typing;

    public TypingIndicator() {
    }

    public TypingIndicator(Long conversationId,
                           Long userId,
                           String username,
                           boolean typing) {

        this.conversationId = conversationId;
        this.userId = userId;
        this.username = username;
        this.typing = typing;
    }

    public Long getConversationId() {
        return conversationId;
    }

    public void setConversationId(Long conversationId) {
        this.conversationId = conversationId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isTyping() {
        return typing;
    }

    public void setTyping(boolean typing) {
        this.typing = typing;
    }

}