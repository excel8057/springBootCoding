package com.boot.example.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BookVO {
	private int bookId;
	private String title;
	private String publisher;
	private String year; 
	private int price; 
}