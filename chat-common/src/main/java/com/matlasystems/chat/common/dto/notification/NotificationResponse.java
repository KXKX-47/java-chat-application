/*
Inform users about notifications, it is read only
 */

package com.matlasystems.chat.common.dto.notification;

import java.time.LocalDateTime;

public class NotificationResponse {

    private Long id;

    private Long recipientId;

    private String title;

    private String message;

    private String type;

    private boolean read;

    private LocalDateTime createdAt;

    private String actionUrl;

    public NotificationResponse() {
    }

    public NotificationResponse(Long id,
                                Long recipientId,
                                String title,
                                String message,
                                String type,
                                boolean read,
                                LocalDateTime createdAt,
                                String actionUrl) {

        this.id = id;
        this.recipientId = recipientId;
        this.title = title;
        this.message = message;
        this.type = type;
        this.read = read;
        this.createdAt = createdAt;
        this.actionUrl = actionUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Long recipientId) {
        this.recipientId = recipientId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

}

