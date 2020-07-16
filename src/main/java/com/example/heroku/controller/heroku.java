package com.example.heroku.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping
public class heroku {
    @RequestMapping("/")
    public String welcome() {
        return "HelloQoeld";
    }
}
