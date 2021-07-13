package com.wx.dao;

import java.util.List;

import com.wx.po.Teacher;

public interface TeacherDAO {
	public Teacher findTeacherById(Integer teacher_id);
	public List<Teacher> findAllTeacher();
}
