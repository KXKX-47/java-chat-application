/*
Represents a summary or preview of a conversation shown in the chat list
*/


package com.matlasystems.chat.common.dto.chat;

public class ChatSummary {

    private Long conversationId;
    private String conversationName;
    private String lastMessage;
    private String lastMessageTime;
    private int unreadMessages;
    private boolean online;

    public ChatSummary() {
    }

    public ChatSummary(Long conversationId,
                       String conversationName,
                       String lastMessage,
                       String lastMessageTime,
                       int unreadMessages,
                       boolean online) {

        this.conversationId = conversationId;
        this.conversationName = conversationName;
        this.lastMessage = lastMessage;
        this.lastMessageTime = lastMessageTime;
        this.unreadMessages = unreadMessages;
        this.online = online;
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

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getLastMessageTime() {
        return lastMessageTime;
    }

    public void setLastMessageTime(String lastMessageTime) {
        this.lastMessageTime = lastMessageTime;
    }

    public int getUnreadMessages() {
        return unreadMessages;
    }

    public void setUnreadMessages(int unreadMessages) {
        this.unreadMessages = unreadMessages;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

}