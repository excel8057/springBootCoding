package com.boot.example.service;

import java.util.List;

import com.boot.example.domain.StudentVO;

public interface StudentService {
	public List<StudentVO> studentList();
	public String studentAutoNumber(String subjectNumber);
	public String studentIdCheck(String studentId);
	public void studentInsert(StudentVO studentVO);
	public void studentUpdate(StudentVO studentVO);
	
}