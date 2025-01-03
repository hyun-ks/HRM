package com.example.hrm.service;

import java.util.Base64;
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
    public String getImageBase64(String em_userid) {
        byte[] imageBytes = uDao.getImageByUserId(em_userid); // DAO 호출
        if (imageBytes != null) {
            // byte[]를 Base64 문자열로 변환
            return Base64.getEncoder().encodeToString(imageBytes);
        }
        return null; // 이미지가 없을 경우 null 반환
    }
}
