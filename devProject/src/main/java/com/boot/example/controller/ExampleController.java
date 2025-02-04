package com.boot.example.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.example.domain.ExampleDTO;
import com.boot.example.domain.SampleDTO;

@Controller
@RequestMapping("/example")
public class ExampleController {
	
	@GetMapping("/exam01")
	public String exam01(Model model) {
		model.addAttribute("data", "??????????????");
		return "/example/exam01";
	}
	@GetMapping("/test")
	public String test(Model model) {
		model.addAttribute("data1", "뷰에 출력할 데이터");
		model.addAttribute("data2", "뷰에 출력할 <strong>데이터</strong>");
		
		model.addAttribute("nullData", null);
	    model.addAttribute("data", "Spring!");
	    
		model.addAttribute("number", 3);
		model.addAttribute("auth", "admin");
		
		ExampleDTO exampleDTO = new ExampleDTO();
		exampleDTO.setName("아엥잉");
		exampleDTO.setAge(38);
		exampleDTO.setEmail("javauser@naver.com");
		model.addAttribute("exampleDTO", exampleDTO);
		
		List<ExampleDTO> list = new ArrayList<>();
		list.add(new ExampleDTO("임시",24,"asdf.asdf"));
		list.add(new ExampleDTO("길똥",88,"ㅂㅈㄷㄱ.채ㅡ"));
		model.addAttribute("list",list);
		
		Map<Integer, ExampleDTO> map = new HashMap<>();
		map.put(1, new ExampleDTO("김미숙", 30, "javauser@naver.com"));
		map.put(2, new ExampleDTO("조한미", 23, "bootuser@naver.com"));
		model.addAttribute("map", map);
		
		return "/example/test";
	}
	
	@GetMapping("/exam03")
	public String exam03(@RequestParam String name, @RequestParam(required=false, defaultValue="0") int age, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		
		return "/example/exam03";
	}
	
	@PostMapping("/exam04")
	public String exam04(@ModelAttribute SampleDTO dto) {

		return "/example/exam04";
	}
	
	@PostMapping("/exam04Bean")
	public String exam02Bean(@RequestParam ArrayList<String> hobby, Model model) {
		return "/example/exam04Bean";
	}
	
	@GetMapping("/exam05")
	@ResponseBody
	public String exam05() {
		return "오늘도 최선을 다해~";
	}
	
}
