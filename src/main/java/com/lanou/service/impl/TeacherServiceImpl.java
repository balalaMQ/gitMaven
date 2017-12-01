package com.lanou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lanou.dao.TeacherMapper;
import com.lanou.entity.Teacher;
import com.lanou.service.TeacherService;
@Service("teacherService")
public class TeacherServiceImpl implements TeacherService{
	@Autowired
	private TeacherMapper teacherMapper;
	
	public List<Teacher> findTeachers() {
		// TODO Auto-generated method stub
		return teacherMapper.findTeachers();
	}
   
	public int addTeachers(String teacherName) {
		Integer a = teacherMapper.addTeachers(teacherName);
		System.out.println("213"+teacherName);
		System.out.println("impl"+a);
		return a;
	}

}
