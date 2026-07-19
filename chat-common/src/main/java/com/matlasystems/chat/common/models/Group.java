/*
Represents a chat group or community where multiple users can communicate, it stores the groups
it serves as the core business model shared across modules
 */

package com.matlasystems.chat.common.models;

import java.time.LocalDateTime;

import com.matlasystems.chat.common.enums.GroupStatus;
import com.matlasystems.chat.common.enums.GroupType;

public class Group {

    private Long id;

    private String name;

    private String description;

    private Long ownerId;

    private GroupType groupType;

    private GroupStatus status;

    private Integer memberCount;

    private Integer maximumMembers;

    private Boolean joinApprovalRequired;

    private Boolean allowMemberInvites;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public Group() {
    }

    public Group(Long id,
                 String name,
                 String description,
                 Long ownerId,
                 GroupType groupType,
                 GroupStatus status,
                 Integer memberCount,
                 Integer maximumMembers,
                 Boolean joinApprovalRequired,
                 Boolean allowMemberInvites,
                 LocalDateTime createdAt,
                 LocalDateTime updatedAt) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.ownerId = ownerId;
        this.groupType = groupType;
        this.status = status;
        this.memberCount = memberCount;
        this.maximumMembers = maximumMembers;
        this.joinApprovalRequired = joinApprovalRequired;
        this.allowMemberInvites = allowMemberInvites;
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

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public GroupType getGroupType() {
        return groupType;
    }

    public void setGroupType(GroupType groupType) {
        this.groupType = groupType;
    }

    public GroupStatus getStatus() {
        return status;
    }

    public void setStatus(GroupStatus status) {
        this.status = status;
    }

    public Integer getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    public Integer getMaximumMembers() {
        return maximumMembers;
    }

    public void setMaximumMembers(Integer maximumMembers) {
        this.maximumMembers = maximumMembers;
    }

    public Boolean getJoinApprovalRequired() {
        return joinApprovalRequired;
    }

    public void setJoinApprovalRequired(Boolean joinApprovalRequired) {
        this.joinApprovalRequired = joinApprovalRequired;
    }

    public Boolean getAllowMemberInvites() {
        return allowMemberInvites;
    }

    public void setAllowMemberInvites(Boolean allowMemberInvites) {
        this.allowMemberInvites = allowMemberInvites;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ownerId=" + ownerId +
                ", groupType=" + groupType +
                ", status=" + status +
                ", memberCount=" + memberCount +
                '}';
    }

}