package com.example.hrm.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class DataController {
    @GetMapping("/")
    public String home(){
        return "Data preparing";
    }
    
}