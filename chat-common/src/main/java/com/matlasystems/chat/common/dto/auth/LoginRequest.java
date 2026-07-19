/*
Carries the users login credentials from the client to the server when signing in

*/


package com.matlasystems.chat.common.dto.auth;

public class LoginRequest {

    private String email;
    private String password;

    public LoginRequest() {

    }

    public LoginRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}