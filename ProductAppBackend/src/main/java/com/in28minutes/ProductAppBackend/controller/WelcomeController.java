package com.in28minutes.ProductAppBackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeController {

    @GetMapping("/")
    public String welcomeHome(){
        return "wELCOME TO PRODUCT aPP 2 !!";
    }
}
