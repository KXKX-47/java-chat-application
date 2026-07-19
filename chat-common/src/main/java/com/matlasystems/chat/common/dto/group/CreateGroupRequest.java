/*
Create a new group
 */

package com.matlasystems.chat.common.dto.group;

public class CreateGroupRequest {

    private String name;

    private String description;

    private boolean privateGroup;

    private Long ownerId;

    public CreateGroupRequest() {
    }

    public CreateGroupRequest(String name,
                              String description,
                              boolean privateGroup,
                              Long ownerId) {

        this.name = name;
        this.description = description;
        this.privateGroup = privateGroup;
        this.ownerId = ownerId;
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

}