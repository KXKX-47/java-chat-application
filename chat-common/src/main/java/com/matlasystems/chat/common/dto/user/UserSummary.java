/*
Instead of returning complete user details everywhere, use a summary of basic information required
 */

package com.matlasystems.chat.common.dto.user;

public class UserSummary {

    private Long id;

    private String username;

    private String fullName;

    private String status;

    public UserSummary() {
    }

    public UserSummary(Long id,
                       String username,
                       String fullName,
                       String status) {
        this.id = id;
        this.username = username;
        this.fullName = fullName;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}