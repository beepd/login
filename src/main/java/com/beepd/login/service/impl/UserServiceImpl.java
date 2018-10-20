package com.beepd.login.service.impl;

import com.beepd.login.entity.User;
import com.beepd.login.repository.UserRepository;
import com.beepd.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
