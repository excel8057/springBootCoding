package com.boot.example.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.boot.example.domain.SubjectVO;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class SubjectTests {
	
	@Setter(onMethod_ = @Autowired)
	private SubjectDAO subjectDAO;
	
	@Test
	public void subjectListTest() {
		log.info("------------------------------------");
		log.info("subjectList() 매서드");
		List<SubjectVO> list = subjectDAO.subjectList();
		/*
		 * for(SubjectVO vo : list) { log.info(vo.toString()); }
		 */
		
		list.stream().forEach((subjectVO) -> log.info(subjectVO.toString()));
	}
	
	@Test
	public void subjectNumberTest() {
		String number = subjectDAO.subjectNumber();
		log.info(number);
	}
}