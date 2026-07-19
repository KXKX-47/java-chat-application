/*
Represents the lifecycle state of a user account
 */

package com.matlasystems.chat.common.enums;

public enum UserStatus {

    ACTIVE,

    INACTIVE,

    SUSPENDED,

    LOCKED,

    PENDING_VERIFICATION,

    DELETED
}