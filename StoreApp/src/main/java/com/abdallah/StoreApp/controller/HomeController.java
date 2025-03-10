package com.abdallah.StoreApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
    // Get request to check backend
    @GetMapping("hello")
    public String hello(){
        return "You Are Connecting to Abdallah Backend\n Welcome ";
    }
}
