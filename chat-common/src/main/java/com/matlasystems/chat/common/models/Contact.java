/*
 * Represents a relationship between two users.
 */

package com.matlasystems.chat.common.models;

import java.time.LocalDateTime;
import java.util.Objects;

public class Contact {

    private Long id;
    private Long ownerId;
    private Long contactId;
    private String nickname;
    private boolean favourite;
    private boolean blocked;
    private LocalDateTime createdAt;

    /**
     * Default constructor.
     */
    public Contact() {

    }

    /**
     * Minimal constructor.
     *
     * @param ownerId   User who owns the contact
     * @param contactId User added as a contact
     */
    public Contact(Long ownerId,
                   Long contactId) {

        this.ownerId = ownerId;
        this.contactId = contactId;
    }

    /**
     * Full constructor.
     *
     * @param id          Contact ID
     * @param ownerId     Owner of the contact
     * @param contactId   Contact user ID
     * @param nickname    Contact nickname
     * @param favourite   Favourite flag
     * @param blocked     Blocked flag
     * @param createdAt   Date created
     */
    public Contact(Long id,
                   Long ownerId,
                   Long contactId,
                   String nickname,
                   boolean favourite,
                   boolean blocked,
                   LocalDateTime createdAt) {

        this.id = id;
        this.ownerId = ownerId;
        this.contactId = contactId;
        this.nickname = nickname;
        this.favourite = favourite;
        this.blocked = blocked;
        this.createdAt = createdAt;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public Long getOwnerId() {

        return ownerId;
    }

    public void setOwnerId(Long ownerId) {

        this.ownerId = ownerId;
    }

    public Long getContactId() {

        return contactId;
    }

    public void setContactId(Long contactId) {

        this.contactId = contactId;
    }

    public String getNickname() {

        return nickname;
    }

    public void setNickname(String nickname) {

        this.nickname = nickname;
    }

    public boolean isFavourite() {

        return favourite;
    }

    public void setFavourite(boolean favourite) {

        this.favourite = favourite;
    }

    public boolean isBlocked() {

        return blocked;
    }

    public void setBlocked(boolean blocked) {

        this.blocked = blocked;
    }

    public LocalDateTime getCreatedAt() {

        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {

        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object object) {

        if (this == object) {
            return true;
        }

        if (!(object instanceof Contact)) {
            return false;
        }

        Contact contact = (Contact) object;

        return Objects.equals(id, contact.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    @Override
    public String toString() {

        return "Contact{" +
                "id=" + id +
                ", ownerId=" + ownerId +
                ", contactId=" + contactId +
                ", nickname='" + nickname + '\'' +
                ", favourite=" + favourite +
                ", blocked=" + blocked +
                ", createdAt=" + createdAt +
                '}';
    }

}