package com.boot.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.boot.example.domain.BookVO;

@Mapper
public interface BookDAO {
	public List<BookVO> bookList();
	public int bookInsert(BookVO bookVO);
}