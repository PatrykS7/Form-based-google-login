package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class WebController {

    @GetMapping("/")
    public String getHomePage(){

        return "index";
    }

    @GetMapping("/sec")
    public String getSecuredPage(Model model, Principal principal){

        model.addAttribute("name", principal.getName());
        return "secured";
    }

    @GetMapping("/login")
    public String login(){

        return "login";
    }
}
