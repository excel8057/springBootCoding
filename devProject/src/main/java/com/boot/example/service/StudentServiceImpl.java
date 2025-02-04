package com.boot.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.example.dao.StudentDAO;
import com.boot.example.domain.StudentVO;

import lombok.Setter;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Setter(onMethod_ = @Autowired)
	private StudentDAO studentDAO;

	
	@Override
	public List<StudentVO> studentList() {
		List<StudentVO> studentList = studentDAO.studentList();
		return studentList;
	}
	
	@Override
	public String studentAutoNumber(String subjectNumber) {
		String studentNumber = studentDAO.studentAutoNumber(subjectNumber);
		return studentNumber;
	}

	@Override
	public String studentIdCheck(String studentId) {
		int result = studentDAO.studentIdCheck(studentId);
		return (result == 1)?"사용할 수 없는 아이디입니다":"사용할 수 있는 아이디입니다";
	}


	@Override
	public void studentInsert(StudentVO studentVO) {
		studentDAO.studentInsert(studentVO);
	}
	
	public void studentUpdate(StudentVO studentVO) {
		studentDAO.studentUpdate(studentVO);
	}
}