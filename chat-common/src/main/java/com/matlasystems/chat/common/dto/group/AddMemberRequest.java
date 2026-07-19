/*
Add a user to to a group
 */

package com.matlasystems.chat.common.dto.group;

public class AddMemberRequest {

    private Long groupId;

    private Long userId;

    public AddMemberRequest() {
    }

    public AddMemberRequest(Long groupId,
                            Long userId) {

        this.groupId = groupId;
        this.userId = userId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}