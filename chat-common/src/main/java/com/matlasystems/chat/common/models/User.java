/*
Represents a user in the system
 */

package com.matlasystems.chat.common.models;

import com.matlasystems.chat.common.enums.Role;
import com.matlasystems.chat.common.enums.UserPresence;
import com.matlasystems.chat.common.enums.UserStatus;

public class User {

    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private UserStatus status;
    private UserPresence presence;
    private Role role;

    public User() {

    }

    public User(Long id,String username, String firstName, String lastName, String email,
                UserStatus status, UserPresence presence, Role role) {

                    this.id = id;
                    this.username = username;
                    this.firstName = firstName;
                    this.lastName = lastName;
                    this.email = email;
                    this.status = status;
                    this.presence = presence;
                    this.role = role;
                }

    public Long getId () {

        return id;
    }

    public void setId (Long id) {

        this.id = id;
    }

    public String getUsername () {

        return username;
    }

    public void setUsername (String username) {

        this.username = username;
    }


    public String getFirstName () {

        return firstName;
    }

    public void setFirstName (String firstName) {

        this.firstName = firstName;
    }


    public String getLastName () {

        return lastName;
    }

    public void setLastName (String lastName) {

        this.lastName = lastName;
    }

    public String getEmail () {

        return email;
    }

    public void setEmail (String email) {

        this.email = email;
    }


    public UserStatus getStatus () {

        return status;
    }

    public void setStatus (UserStatus status) {

        this.status = status;
    }

    public UserPresence getPresence () {

        return presence;
    }

    public void setPresence (UserPresence presence) {

        this.presence = presence;
    }

    public Role getRole () {

        return role;
    }

    public void setRole (Role role) {

        this.role = role;
    }
}