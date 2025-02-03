package com.boot.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.example.dao.SubjectDAO;
import com.boot.example.domain.SubjectVO;

import lombok.Setter;

@Service
public class SubjectServiceImpl implements SubjectService {

	@Setter(onMethod_ = @Autowired)
	private SubjectDAO subjectDAO;

	@Override
	public List<SubjectVO> subjectList() {
		List<SubjectVO> list = subjectDAO.subjectList();
		return list;
	}

	@Override
	public String subjectNumber() {
		String subjectNumber = subjectDAO.subjectNumber();
		return subjectNumber;
	}
}
