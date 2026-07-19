/*
Update an existing group
 */

package com.matlasystems.chat.common.dto.group;

public class UpdateGroupRequest {

    private Long groupId;

    private String name;

    private String description;

    private boolean privateGroup;

    public UpdateGroupRequest() {
    }

    public UpdateGroupRequest(Long groupId,
                              String name,
                              String description,
                              boolean privateGroup) {

        this.groupId = groupId;
        this.name = name;
        this.description = description;
        this.privateGroup = privateGroup;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
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

}