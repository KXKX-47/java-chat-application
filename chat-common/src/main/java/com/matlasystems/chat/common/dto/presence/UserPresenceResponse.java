/*
a response returned whenever a client reequests a users current presence information
 */

package com.matlasystems.chat.common.dto.presence;

import java.time.LocalDateTime;

public class UserPresenceResponse {

    private Long userId;

    private String username;

    private String status;

    private LocalDateTime lastSeen;

    private boolean typing;

    private boolean recording;

    private boolean inCall;

    public UserPresenceResponse() {
    }

    public UserPresenceResponse(Long userId,
                                String username,
                                String status,
                                LocalDateTime lastSeen,
                                boolean typing,
                                boolean recording,
                                boolean inCall) {

        this.userId = userId;
        this.username = username;
        this.status = status;
        this.lastSeen = lastSeen;
        this.typing = typing;
        this.recording = recording;
        this.inCall = inCall;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(LocalDateTime lastSeen) {
        this.lastSeen = lastSeen;
    }

    public boolean isTyping() {
        return typing;
    }

    public void setTyping(boolean typing) {
        this.typing = typing;
    }

    public boolean isRecording() {
        return recording;
    }

    public void setRecording(boolean recording) {
        this.recording = recording;
    }

    public boolean isInCall() {
        return inCall;
    }

    public void setInCall(boolean inCall) {
        this.inCall = inCall;
    }

}