package com.boot.example.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.boot.example.domain.StudentVO;
import com.boot.example.domain.SubjectVO;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class StudentTests {
	
	@Setter(onMethod_ = @Autowired)
	private StudentDAO studentDAO;
	
	@Test
	public void studentListTest() {
		log.info("------------------------------");
		log.info("studentList() 메서드 실행");
		List<StudentVO> list =  studentDAO.studentList();
		for(StudentVO vo : list) {
			 log.info(vo.toString());
		}
	}
	
	@Test
	public void studentAutoNumberTest() {
		log.info("------------------------------");
		String number = studentDAO.studentAutoNumber("01");
		log.info(number);
	}
	
	
	@Test
	public void studentInsertTest() {
		log.info("------------------------------");
		log.info("studentInsert() 메서드 실행");
		StudentVO vo = new StudentVO();
		vo.setStudentNumber(studentDAO.studentAutoNumber("01"));
		vo.setStudentName("김지수");
		vo.setStudentId("springuser");
		vo.setStudentPasswd("spring1234");
		vo.setStudentBirth("20000615");
		vo.setStudentPhone("01052058320");
		vo.setStudentAddress("(06181) 서울 강남구 테헤란로98길 12");
		vo.setStudentEmail("springuser@naver.com");
		
		vo.setSubject(new SubjectVO());
		vo.getSubject().setSubjectNumber("01");
		
		int result = studentDAO.studentInsert(vo);
		log.info(String.valueOf(result));
	}
	
}