package com.example.hrm.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.hrm.dto.UserDto;
import com.example.hrm.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@CrossOrigin(origins = "http://localhost:5173")//CORS 문제 해결
public class DataController {

    @Autowired UserService uService;

    @GetMapping("/")
    public String home(){
        return "Data preparing";
    }

    @GetMapping("/employee")
    public List<UserDto> showEmployeeListForm() {
        return uService.findAll();
    }
    
    
}