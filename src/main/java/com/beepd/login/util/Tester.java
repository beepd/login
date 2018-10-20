package com.beepd.login.util;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class Tester {

    public static void main(String args[]) {
        String code = BCrypt.hashpw("pass", BCrypt.gensalt(4));
        System.out.println(code);
    }
}
