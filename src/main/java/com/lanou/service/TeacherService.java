package com.lanou.service;

import java.util.List;

import com.lanou.entity.Teacher;

public interface TeacherService {
	public List<Teacher> findTeachers();
	public int addTeachers(String teacherName);
}
