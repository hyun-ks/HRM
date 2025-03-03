package com.example.hrm.controller;

import org.springframework.web.bind.annotation.RestController;

// import com.example.hrm.dto.RankDto;
import com.example.hrm.dto.UserDto;
import com.example.hrm.service.UserService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@CrossOrigin(origins = "http://localhost:5173")//CORS 문제 해결
public class DataController {

    @Autowired UserService uService;
    UserDto uDto = new UserDto();

    @GetMapping("/employeeList")
    public List<UserDto> showEmployeeListForm() {
        return uService.findAll();
    }

    @PostMapping("/empinsert")
    public int insertEmp(@RequestBody UserDto uDto) {        
        return uService.insert(uDto);
    }

    @GetMapping("/empinsert")
    public List<UserDto> findDeptRank(){
        return uService.findLocation();
    }

    @PatchMapping("/employee")
    public int editByUserid(@RequestBody UserDto uDto){
        return uService.editByUserid(uDto);
    }
    
    @DeleteMapping("/delete")
    public int delete(@RequestBody List<String> em_userid){
        return uService.delete(em_userid);
    }

    @PostMapping("/")
    public Map<String, String> loginCheck(@RequestBody UserDto uDto) {
        return uService.login(uDto);
    }
    
    
    
    
}