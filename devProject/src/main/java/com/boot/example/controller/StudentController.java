package com.boot.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.example.domain.StudentVO;
import com.boot.example.domain.SubjectVO;
import com.boot.example.service.StudentService;
import com.boot.example.service.SubjectService;

import lombok.Setter;

@Controller
@RequestMapping("/student/*")
public class StudentController {
		
	@Setter(onMethod_ = @Autowired)
	private StudentService studentService;
	
	@Setter(onMethod_ = @Autowired)
	private SubjectService subjectService;
	
	@GetMapping("/studentList")
	public String studentList(Model model, StudentVO studentVO) {
		List<StudentVO> studentList = studentService.studentList();
		model.addAttribute("studentList", studentList);
		model.addAttribute("studentVO", studentVO);
		
		List<SubjectVO> subjectList = subjectService.subjectList();
		model.addAttribute("subjectList", subjectList);
		
		return "student/studentList";
	}
	
	@GetMapping("/studentAutoNumber")
	@ResponseBody
	public String studentAutoNumber(String subjectNumber) {
		String studentNumber = studentService.studentAutoNumber(subjectNumber);
		return studentNumber;
	}
	
	@PostMapping("/studentIdCheck")
	@ResponseBody
	public String studentIdCheck(@RequestParam String studentId) {
		String result = studentService.studentIdCheck(studentId);
		return result;
	}
	
	@PostMapping("/studentInsert")
	public String studentInsert(StudentVO studentVO) {
		studentService.studentInsert(studentVO);
		return "redirect:/student/studentList";
	}
	
	@PostMapping("/studentUpdate")
	public String studentUpdate(StudentVO studentVO) {
		studentService.studentUpdate(studentVO);
		return "redirect:/student/studentList";
	}
	

}