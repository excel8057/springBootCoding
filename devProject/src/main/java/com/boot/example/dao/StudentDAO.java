package com.boot.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.boot.example.domain.StudentVO;

@Mapper
public interface StudentDAO {
	public List<StudentVO> studentList();
	public String studentAutoNumber(String subjectNumber); 
	public int studentIdCheck(String studentId);
	public int studentInsert(StudentVO studentVO);
	public int studentUpdate(StudentVO studentVO);
}