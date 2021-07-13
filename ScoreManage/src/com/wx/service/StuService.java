package com.wx.service;
import java.util.List;

import com.wx.po.Student;
public interface StuService {
	
	public Student findStudentById(int stu_id);
	
	public List<Student> findAllStudent();

}
