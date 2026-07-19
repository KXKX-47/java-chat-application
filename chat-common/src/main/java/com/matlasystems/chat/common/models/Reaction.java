/*
Represents a users reaction to a specific message
 */

package com.matlasystems.chat.common.models;

import java.time.LocalDateTime;

/**
 * Represents a user's reaction to a chat message.
 */
public class Reaction {

    private Long id;

    private Long messageId;

    private Long userId;

    private String emoji;

    private LocalDateTime reactedAt;

    public Reaction() {
    }

    public Reaction(Long id,
                    Long messageId,
                    Long userId,
                    String emoji,
                    LocalDateTime reactedAt) {

        this.id = id;
        this.messageId = messageId;
        this.userId = userId;
        this.emoji = emoji;
        this.reactedAt = reactedAt;
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

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public LocalDateTime getReactedAt() {
        return reactedAt;
    }

    public void setReactedAt(LocalDateTime reactedAt) {
        this.reactedAt = reactedAt;
    }

}