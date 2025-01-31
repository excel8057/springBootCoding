package com.boot.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectVO {
	private int no;
	private String subjectNumber;
	private String subjectName;
	private String deleteable;
}
