package com.matlasystems.chat.common.models;

import java.time.LocalDateTime;

import com.matlasystems.chat.common.enums.ConversationType;

/**
 * Represents a conversation within the chat platform.
 *
 * A conversation may represent:
 * - Direct (one-to-one) conversation
 * - Group conversation
 * - Community
 * - Channel
 * - Support conversation
 */
public class Conversation {

    /**
     * Unique identifier.
     */
    private Long id;

    /**
     * Conversation name.
     *
     * For private conversations this may be generated automatically.
     * For groups and channels this is the display name.
     */
    private String name;

    /**
     * Optional description.
     */
    private String description;

    /**
     * Conversation category.
     */
    private ConversationType conversationType;

    /**
     * User that created the conversation.
     */
    private Long ownerId;

    /**
     * Indicates whether the conversation is private.
     */
    private boolean isPrivate;

    /**
     * Indicates whether the conversation is archived.
     */
    private boolean archived;

    /**
     * Date and time the conversation was created.
     */
    private LocalDateTime createdAt;

    /**
     * Date and time the conversation was last updated.
     */
    private LocalDateTime updatedAt;

    /**
     * Default constructor.
     */
    public Conversation() {
    }

    /**
     * Minimal constructor.
     */
    public Conversation(Long id,
                        String name,
                        ConversationType conversationType) {

        this.id = id;
        this.name = name;
        this.conversationType = conversationType;

    }

    /**
     * Full constructor.
     */
    public Conversation(Long id,
                        String name,
                        String description,
                        ConversationType conversationType,
                        Long ownerId,
                        boolean isPrivate,
                        boolean archived,
                        LocalDateTime createdAt,
                        LocalDateTime updatedAt) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.conversationType = conversationType;
        this.ownerId = ownerId;
        this.isPrivate = isPrivate;
        this.archived = archived;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ConversationType getConversationType() {
        return conversationType;
    }

    public void setConversationType(
            ConversationType conversationType) {
        this.conversationType = conversationType;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(
            LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(
            LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {

        return "Conversation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", conversationType=" + conversationType +
                ", ownerId=" + ownerId +
                ", isPrivate=" + isPrivate +
                ", archived=" + archived +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';

    }

}