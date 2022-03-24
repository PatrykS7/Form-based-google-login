package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String getHomePage(){

        return "index";
    }

    @GetMapping("/sec")
    public String getSecuredPage(){

        return "secured";
    }

    @GetMapping("/login")
    public String login(){

        return "login";
    }
}
