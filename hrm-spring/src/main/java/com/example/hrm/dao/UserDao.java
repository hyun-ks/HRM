package com.example.hrm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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

    @Insert("insert into em_info(em_userid, dept_no, dept_name, em_position, ranknum, em_name, em_birth, em_gender, em_pics, em_phone, em_address, em_password, em_location)"
    + "values(#{em_userid}, #{dept_no}, #{dept_name}, #{em_position}, #{ranknum}, #{em_name}, #{em_birth}, #{em_gender}, #{em_pics}, #{em_phone}, #{em_address}, #{em_password}, #{em_location})")
    int insert(UserDto uDto);

    @Update("update em_info set em_name = #{em_name}, em_password = #{em_password}, em_phone = #{em_phone}," + 
     "em_birth = #{em_birth}, ranknum = #{ranknum}, dept_no = #{dept_no}, em_address = #{em_address}, em_location = #{em_location} where em_userid = #{em_userid}")
    int editByUserid(UserDto uDto);

    @Delete({
        "<script>",
        "DELETE FROM em_info WHERE em_userid IN",
        "<foreach item='item' collection='list' open='(' separator=',' close=')'>",
        "#{item}",
        "</foreach>",
        "</script>"
    })
    int delete(@Param("list") List<String> em_userid);
}
