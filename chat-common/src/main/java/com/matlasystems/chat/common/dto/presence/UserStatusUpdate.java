/*
a request used when a client wants to update its own presence status.
 */

package com.matlasystems.chat.common.dto.presence;

public class UserStatusUpdate {

    private Long userId;

    private String status;

    public UserStatusUpdate() {
    }

    public UserStatusUpdate(Long userId,
                            String status) {

        this.userId = userId;
        this.status = status;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}