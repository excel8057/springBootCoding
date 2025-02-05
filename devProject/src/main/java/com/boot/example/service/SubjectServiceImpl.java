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
       public List<SubjectVO> subjectList(SubjectVO subjectVO) {
              List<SubjectVO> list = subjectDAO.subjectList();
              return list;
       }

       @Override
       public String subjectNumber() {
              String number = subjectDAO.subjectNumber();
              return number;
       }

       @Override
       public void subjectInsert(SubjectVO subjectVO) {
              /* 예외를 발생시킬 코드 작성 */
              subjectVO.setNo(0);
              if(subjectVO.getNo() == 0){
                     throw new IllegalArgumentException("0번 글은 등록할 수 없습니다.");
              }

              //subjectDAO.subjectInsert(subjectVO);
       }

		@Override
		public List<SubjectVO> subjectList() {
	        List<SubjectVO> list = subjectDAO.subjectList();
	        return list;
	 }

}