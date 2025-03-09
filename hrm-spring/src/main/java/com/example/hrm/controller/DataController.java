package com.example.hrm.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.hrm.dto.UserDto;
import com.example.hrm.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
public class DataController {

    @Autowired
    UserService uService;
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
    public List<UserDto> findDeptRank() {
        return uService.findLocation();
    }

    @PatchMapping("/employee")
    public int editByUserid(@RequestBody UserDto uDto) {
        return uService.editByUserid(uDto);
    }

    @DeleteMapping("/delete")
    public int delete(@RequestBody List<String> em_userid) {
        return uService.delete(em_userid);
    }

    @PostMapping("/")
    public String loginCheck(@RequestBody UserDto uDto, HttpServletRequest request) {

        String pw = uService.login(uDto.getEm_userid());
        if (pw == null || !pw.equals(uDto.getEm_password())) {
            return "로그인 실패";
        }
        HttpSession session = request.getSession();
        session.setAttribute("user", uDto);
        return "로그인 성공";
    }

}