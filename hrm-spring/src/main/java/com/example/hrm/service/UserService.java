package com.example.hrm.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrm.dao.UserDao;
import com.example.hrm.dto.RankDto;
import com.example.hrm.dto.UserDto;

@Service
public class UserService {
    @Autowired UserDao uDao;
    public List<UserDto> findAll(){
        return uDao.findAll();
    }

    public List<RankDto> findrank(){
        return uDao.findrank();
    }

    public int insert(UserDto uDto) {
        return uDao.insert(uDto);
    }

    public int editByUserid(UserDto uDto){
        return uDao.editByUserid(uDto);
    }

    public int delete(String em_userid){
        return uDao.delete(em_userid);
    }
}
