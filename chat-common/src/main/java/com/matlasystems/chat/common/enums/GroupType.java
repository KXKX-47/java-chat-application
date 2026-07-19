package com.matlasystems.chat.common.enums;

/**
 * Represents the type of a chat group.
 */
public enum GroupType {

    /**
     * Standard private group.
     */
    PRIVATE,

    /**
     * Public group that anyone can join.
     */
    PUBLIC,

    /**
     * Announcement-only channel.
     */
    CHANNEL,

    /**
     * Community containing multiple channels/groups.
     */
    COMMUNITY

}