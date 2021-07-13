package com.wx.service;
import java.util.List;

import com.wx.po.Teacher;
public interface TeaService {
public Teacher findTeacherById(int teacher_id);
	
	public List<Teacher> findAllTeacher();
}
