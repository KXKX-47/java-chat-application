/*
Return group informayion to clients
 */

package com.matlasystems.chat.common.dto.group;

public class GroupResponse {

    private Long id;

    private String name;

    private String description;

    private boolean privateGroup;

    private Long ownerId;

    private int memberCount;

    private String createdAt;

    private String updatedAt;

    public GroupResponse() {
    }

    public GroupResponse(Long id,
                         String name,
                         String description,
                         boolean privateGroup,
                         Long ownerId,
                         int memberCount,
                         String createdAt,
                         String updatedAt) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.privateGroup = privateGroup;
        this.ownerId = ownerId;
        this.memberCount = memberCount;
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

    public boolean isPrivateGroup() {
        return privateGroup;
    }

    public void setPrivateGroup(boolean privateGroup) {
        this.privateGroup = privateGroup;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}