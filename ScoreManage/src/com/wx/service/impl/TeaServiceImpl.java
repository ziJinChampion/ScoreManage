package com.wx.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.wx.dao.TeacherDAO;
import com.wx.po.Student;
import com.wx.po.Teacher;
import com.wx.service.TeaService;
@Service
@Transactional
public class TeaServiceImpl implements TeaService {
	@Autowired
	private TeacherDAO teacherDAO;
	
	public Teacher findTeacherById(int teacher_id) {
		return this.teacherDAO.findTeacherById(teacher_id);
	}
	
	public List<Teacher> findAllTeacher(){
		return this.teacherDAO.findAllTeacher();
	}

}
