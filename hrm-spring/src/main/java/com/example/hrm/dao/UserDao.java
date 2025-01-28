package com.example.hrm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

// import com.example.hrm.dto.RankDto;
import com.example.hrm.dto.UserDto;

@Mapper
public interface UserDao {
    @Select("select * from em_info")
    List<UserDto> findAll();

    @Select("select em_dept.no, em_dept.dept_no, em_dept.dept_name, em_rank.ranknum, em_rank.em_position " +
    "from em_dept left join em_rank on em_dept.no = em_rank.no")
    List<UserDto> findLocation();

    @Insert("insert into em_info(em_userid, dept_no, ranknum, em_name, em_birth, em_gender, em_pics, em_phone, em_address, em_password, em_location)"
    + "values(#{em_userid}, #{dept_no}, #{ranknum}, #{em_name}, #{em_birth}, #{em_gender}, #{em_pics}, #{em_phone}, #{em_address}, #{em_password}, #{em_location})")
    int insert(UserDto uDto);

    @Update("update em_info set dept_no = #{dept_no}, ranknum = #{ranknum}, em_name = #{em_name}, em_birth = #{em_birth}, em_gender = #{em_gender}, em_phone = #{em_phone},em_address = #{em_address}, em_password = #{em_password} where em_userid = #{em_userid}")
    int editByUserid(UserDto uDto);

    @Delete("delete from em_info where em_userid = #{em_userid}")
    int delete(String em_userid);
}
