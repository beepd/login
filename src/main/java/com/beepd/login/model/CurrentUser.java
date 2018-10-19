package com.beepd.login.model;

import org.springframework.security.core.userdetails.User;

public class CurrentUser extends User {

    private User user;

    CurrentUser(User user){
        super(user.getUsername(), user.getPassword(), user.getAuthorities());
        this.user = user;
    }

    public User getUser() {
        return user;
    }

}
