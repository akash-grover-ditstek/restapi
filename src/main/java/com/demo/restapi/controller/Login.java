package com.demo.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {

    @GetMapping("/")
    public String EmployeeDetail(){
        return "login";
    }
}
