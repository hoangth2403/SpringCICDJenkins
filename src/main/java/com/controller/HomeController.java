package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String test(){
        return "abc@xyz";
    }

    @GetMapping("/")
    public String test1(){
        return "XYZ@ABC";
    }
}
