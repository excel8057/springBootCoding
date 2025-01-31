package com.boot.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.example.domain.ExampleVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/sample/*")
@Slf4j
public class SampleController {
	@GetMapping(value = "/getText", produces = "text/plain; charset=UTF-8" )
	public String getText() {
		log.info("MIME TYPE: " + MediaType.TEXT_PLAIN_VALUE);
		return "안녕하세요";
	}
	
	@GetMapping(value="/getExample", produces = MediaType.APPLICATION_JSON_VALUE)
	public ExampleVO getSample() {
		return new ExampleVO(1, "홍길동", "010-1234-5678");
	}
	
	@GetMapping(value="/getExample2", produces = MediaType.APPLICATION_XML_VALUE)
	public ExampleVO getSample2() {
		return new ExampleVO(2, "철쑤", "010-5678-1234");
	}
	@GetMapping(value="/getList", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ExampleVO> getlist() {
		List<ExampleVO> list = new ArrayList<>();
		list.add(new ExampleVO(1,"호ㅓㅇ","010-654654"));
		list.add(new ExampleVO(2,"qwret","010-865454"));
		list.add(new ExampleVO(3,"asdf","010-123145"));
		list.add(new ExampleVO(4,"ghfj","010-53164321"));
		return list;
	}
}