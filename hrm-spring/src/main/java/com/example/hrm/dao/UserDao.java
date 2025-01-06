package com.example.hrm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.hrm.dto.UserDto;

@Mapper
public interface UserDao {
    @Select("select * from em_info natural join em_rank natural join em_dept")
    List<UserDto> findAll();

    @Insert("insert into em_info(em_userid, dept_no, ranknum, em_name, em_birth, em_gender, em_pics em_phone, em_address, em_password, em_location)"
    + "values(#{em_userid}, #{dept_no}, #{ranknum}, #{em_name}, #{em_birth}, #{em_gender}, #{em_pics}, #{em_phone}, #{em_address}, #{em_password}, #{em_location})")
    int insert(UserDto user_info);
}
