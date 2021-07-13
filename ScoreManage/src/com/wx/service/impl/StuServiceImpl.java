package com.wx.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.wx.dao.StudentDAO;
import com.wx.po.Student;
import com.wx.service.StuService;
@Service 
@Transactional
public class StuServiceImpl implements StuService{
	@Autowired
	private StudentDAO studentDAO;
	
	public Student findStudentById(int stu_id) {
		return this.studentDAO.findStudentById(stu_id);
	}
	
	public List<Student> findAllStudent(){
		return this.studentDAO.findAllStudent();
	}

}
