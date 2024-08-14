package com.dalycode.jwt.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {
    @GetMapping("/test")
    public String home() {
        return "It's works";
    }

    @GetMapping("/try")
    public String test() {
        return "yeshua";
    }
}
