package com.beepd.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value = "welcome", method = RequestMethod.GET)
    public String showLoginPage(Model model) {
        model.addAttribute("title", "Spring security example");
        model.addAttribute("message", "Hello World !");
        return "home";
    }
}
