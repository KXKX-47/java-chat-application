package com.matlasystems.chat.common.models;

import java.time.LocalDateTime;

/**
 * Represents a read receipt for a chat message.
 */
public class ReadReceipt {

    private Long id;

    private Long messageId;

    private Long userId;

    private LocalDateTime readAt;

    public ReadReceipt() {
    }

    public ReadReceipt(Long id,
                       Long messageId,
                       Long userId,
                       LocalDateTime readAt) {

        this.id = id;
        this.messageId = messageId;
        this.userId = userId;
        this.readAt = readAt;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDateTime getReadAt() {
        return readAt;
    }

    public void setReadAt(LocalDateTime readAt) {
        this.readAt = readAt;
    }

}