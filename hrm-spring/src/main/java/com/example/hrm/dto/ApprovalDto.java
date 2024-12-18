package com.example.hrm.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class ApprovalDto {
    private int em_appnum;
    private String em_userid;
    private Date startdate;
    private Date enddate;
    private String em_attatch;
    private String approval_1;
    private String approval_2;
    private String approval_3;
    private int status_1;
    private int status_2;
    private int status_3;
    private String em_result;
}
