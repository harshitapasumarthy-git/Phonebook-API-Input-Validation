package com.CSE5382SecureProgramming.Assignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class Controller {
    @GetMapping("testAPI")
    public  String testMethod(){
        return "Hello world";
    }

}
