package com.example.hrm.service;
import java.util.List;

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

    public int insert(UserDto user_info) {
        return uDao.insert(user_info);
    }

    public int editByUserid(UserDto uDto){
        return uDao.editByUserid(uDto);
    }

    public int delete(String em_userid){
        return uDao.delete(em_userid);
    }
}
