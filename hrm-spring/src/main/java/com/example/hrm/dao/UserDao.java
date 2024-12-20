package com.example.hrm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.hrm.dto.UserDto;

@Mapper
public interface UserDao {
    @Select("select * from em_info natural join em_rank")
    List<UserDto> findAll();
}
