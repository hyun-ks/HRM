package com.example.hrm.service;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrm.dao.UserDao;
import com.example.hrm.dto.UserDto;

@Service
public class UserService {
    @Autowired UserDao uDao;
    public List<UserDto> findAll(){
        return uDao.findAll();
    }
    
    public List<UserDto> findLocation(){
        return uDao.findLocation();
    }

    public int insert(UserDto uDto) {
        return uDao.insert(uDto);
    }

    public int editByUserid(UserDto uDto){
        return uDao.editByUserid(uDto);
    }

    public int delete(List<String> em_userid){
        return uDao.delete(em_userid);
    }

    public Map<String, String> login(UserDto uDto){
        return uDao.login(uDto);
    }
}
