package com.boot.example.service;

import java.util.List;

import com.boot.example.domain.SubjectVO;

public interface SubjectService {

	
	public List<SubjectVO> subjectList();
	public String subjectNumber();
	public List<SubjectVO> subjectList(SubjectVO subjectVO);
	public void subjectInsert(SubjectVO subjectVO);
}
