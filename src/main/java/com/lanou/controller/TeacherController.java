package com.lanou.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lanou.entity.Teacher;
import com.lanou.service.TeacherService;
@Controller
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	@RequestMapping("/find.do")
	public String finds(Model mode) {
		
		List<Teacher> teachers = teacherService.findTeachers();
		mode.addAttribute("teachers" ,teachers);
		return "index";
	}
	@RequestMapping("/find1.do")
	public String add(Model mode ,String teacherName) {
		
		System.out.println("eqweqe"+teacherName);
		int a = teacherService.addTeachers(teacherName);
		
		System.out.println(a);
		mode.addAttribute("teachers" ,a);
		if (a==1) {
			return "index";
		}
		return "reg";
		
		
		
	}
}
