package com.example.hrm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.hrm.dto.RankDto;
import com.example.hrm.dto.UserDto;

@Mapper
public interface UserDao {
    @Select("select * from em_info natural join em_rank natural join em_dept")
    List<UserDto> findAll();

    @Select("select * from em_rank")
    List<RankDto> findrank();

    @Insert("insert into em_info(em_userid, dept_no, ranknum, em_name, em_birth, em_gender, em_pics, em_phone, em_address, em_password, em_location)"
    + "values(#{em_userid}, #{dept_no}, #{ranknum}, #{em_name}, #{em_birth}, #{em_gender}, #{em_pics}, #{em_phone}, #{em_address}, #{em_password}, #{em_location})")
    int insert(UserDto uDto);

    @Update("update em_info set dept_no = #{dept_no}, ranknum = #{ranknum}, em_name = #{em_name}, em_birth = #{em_birth}, em_gender = #{em_gender}, em_phone = #{em_phone},em_address = #{em_address}, em_password = #{em_password} where em_userid = #{em_userid}")
    int editByUserid(UserDto uDto);

    @Delete("delete from em_info where em_userid = #{em_userid}")
    int delete(String em_userid);
}
