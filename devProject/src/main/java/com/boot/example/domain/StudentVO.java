package com.boot.example.domain;

import lombok.Data;

@Data
public class StudentVO {
    private int no;
    private String studentNumber;
    private String studentName;
    private String studentId;
    private String studentPasswd;
    private String studentBirth;
    private String studentPhone;
    private String studentAddress;
    private String studentEmail;
    private String regDate;
    
    private SubjectVO subject;
}