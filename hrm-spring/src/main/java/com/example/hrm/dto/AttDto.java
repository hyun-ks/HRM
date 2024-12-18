package com.example.hrm.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AttDto {
    private int em_att_num;
    private String em_userid;
    private LocalDateTime em_checktime;
    private String em_commute;
}
