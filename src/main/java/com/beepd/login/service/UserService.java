package com.beepd.login.service;

import com.beepd.login.entity.User;

public interface UserService {

    User getUserByUsername(String username);
}
