package com.boot.example.service;

import java.util.List;

import com.boot.example.domain.BookVO;

public interface BookService {
	public List<BookVO> bookList();
	public int bookInsert(BookVO bookVO);
}