package com.example.hrm.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class UserDto {
   private String em_userid;
   private int dept_no;
   private int ranknum;
   private String em_name;
   private Date em_birth;
   private String em_gender;
   private String em_phone;
   private String em_address;
   private String em_password;
   private String em_position;
   private String dept_name;
   private int no;
   private String em_pics;
   private String em_location;
}
