package com.beepd.login.service;

import com.beepd.login.entity.User;
import com.beepd.login.model.CurrentUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements UserDetailsService {

    @Autowired
    UserService userService;

    @Override
    public CurrentUser loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userService.getUserByUsername(username);
        return new CurrentUser(user);

        /*if(username.equals("test")) {
            return User.withDefaultPasswordEncoder()
                    .username("test")
                    .password("test")
                    .roles("test")
                    .build();
        } else {
            return null;
        }*/
    }
}
