package com.boot.example.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.boot.example.domain.BookVO;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class BookTests {

	@Setter(onMethod_ = @Autowired)
	private BookDAO bookDAO;
	
	@Test
	public void testBookList() {	
		log.info("testBookList() 메서드 실행");
		List<BookVO> list =  bookDAO.bookList();
		for(BookVO vo : list) {
			 log.info(vo.toString());
		}
		log.info("레코드수: " + list.size());
	}
	
    @Test
	public void testBookInsert() {
        /* 값은 여러분이 채워주세요. */
		BookVO bookVO = new BookVO();
		bookVO.setTitle("자바의 정석");
		bookVO.setPublisher("도우출판사");
		bookVO.setYear("2025");
		bookVO.setPrice(300000);
		
		log.info("적용된 행의 수: "+bookDAO.bookInsert(bookVO));
	}
}