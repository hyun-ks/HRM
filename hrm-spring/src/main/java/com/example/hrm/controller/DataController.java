package com.example.hrm.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.hrm.dto.UserDto;
import com.example.hrm.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@CrossOrigin(origins = "http://localhost:5173")//CORS 문제 해결
public class DataController {

    @Autowired UserService uService;
    UserDto uDto = new UserDto();

    @GetMapping("/")
    public String home(){
        return "Data preparing";
    }

    @GetMapping("/employee")
    public List<UserDto> showEmployeeListForm() {
        return uService.findAll();
    }

    @PostMapping("/empinsert")
    public int insertEmp(@RequestBody UserDto uDto) {        
        return uService.insert(uDto);
    }    

    @DeleteMapping("/empdelete")
    public void deleteemp(){
        
    }
    
    
    
    
}