/*
Represents a message exchanged between users within the chat platform. It serves as the core domain
model for all messaging operations and is shared across multiple modules
 */

package com.matlasystems.chat.common.models;

import java.time.LocalDateTime;

import com.matlasystems.chat.common.enums.MessageStatus;
import com.matlasystems.chat.common.enums.MessageType;

public class Message {

    /**
     * Unique identifier for the message.
     */
    private Long id;

    /**
     * Conversation to which this message belongs.
     */
    private Long conversationId;

    /**
     * Sender of the message.
     */
    private Long senderId;

    /**
     * Recipient of the message.
     * Null for group conversations.
     */
    private Long receiverId;

    /**
     * Type of message.
     */
    private MessageType messageType;

    /**
     * Message content.
     */
    private String content;

    /**
     * Current delivery status.
     */
    private MessageStatus status;

    /**
     * Indicates whether the message has been edited.
     */
    private boolean edited;

    /**
     * Indicates whether the message has been deleted.
     */
    private boolean deleted;

    /**
     * Time when the message was created.
     */
    private LocalDateTime sentAt;

    /**
     * Time when the message was delivered.
     */
    private LocalDateTime deliveredAt;

    /**
     * Time when the message was read.
     */
    private LocalDateTime readAt;

    /**
     * Time when the message was last modified.
     */
    private LocalDateTime updatedAt;

    /**
     * Default constructor.
     */
    public Message() {
    }

    /**
     * Full constructor.
     */
    public Message(Long id,
                   Long conversationId,
                   Long senderId,
                   Long receiverId,
                   MessageType messageType,
                   String content,
                   MessageStatus status,
                   boolean edited,
                   boolean deleted,
                   LocalDateTime sentAt,
                   LocalDateTime deliveredAt,
                   LocalDateTime readAt,
                   LocalDateTime updatedAt) {

        this.id = id;
        this.conversationId = conversationId;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.messageType = messageType;
        this.content = content;
        this.status = status;
        this.edited = edited;
        this.deleted = deleted;
        this.sentAt = sentAt;
        this.deliveredAt = deliveredAt;
        this.readAt = readAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getConversationId() {
        return conversationId;
    }

    public void setConversationId(Long conversationId) {
        this.conversationId = conversationId;
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

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MessageStatus getStatus() {
        return status;
    }

    public void setStatus(MessageStatus status) {
        this.status = status;
    }

    public boolean isEdited() {
        return edited;
    }

    public void setEdited(boolean edited) {
        this.edited = edited;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }

    public LocalDateTime getDeliveredAt() {
        return deliveredAt;
    }

    public void setDeliveredAt(LocalDateTime deliveredAt) {
        this.deliveredAt = deliveredAt;
    }

    public LocalDateTime getReadAt() {
        return readAt;
    }

    public void setReadAt(LocalDateTime readAt) {
        this.readAt = readAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", conversationId=" + conversationId +
                ", senderId=" + senderId +
                ", receiverId=" + receiverId +
                ", messageType=" + messageType +
                ", content='" + content + '\'' +
                ", status=" + status +
                ", edited=" + edited +
                ", deleted=" + deleted +
                ", sentAt=" + sentAt +
                ", deliveredAt=" + deliveredAt +
                ", readAt=" + readAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

}