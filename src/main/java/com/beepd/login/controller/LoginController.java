package com.beepd.login.controller;

import com.beepd.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String showHome(Model model) {
        model.addAttribute("title", "Spring security example");
        model.addAttribute("message", "Hello World !");
        return "home";
    }

    @RequestMapping(value = "admin", method = RequestMethod.GET)
    public String showAdminPage(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();

        model.addAttribute("title", "Spring security example");
        model.addAttribute("message", "Logged in as: " + name);
        return "home";
    }

    @RequestMapping(value = "super", method = RequestMethod.GET)
    public String showSuperPage(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();

        model.addAttribute("title", "Spring security example");
        model.addAttribute("message", "Logged in as: " + name);
        return "home";
    }
}
