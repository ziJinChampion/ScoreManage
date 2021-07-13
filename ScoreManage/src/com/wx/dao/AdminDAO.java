package com.wx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wx.po.Admin;
import com.wx.po.Student;
import com.wx.po.Teacher;

public interface AdminDAO {
	public Admin findAdminById(Integer admin_id);
	public List<Student> findAllStudent();
	public List<Teacher> findAllTeacher();
	public void AddStudent(@Param("stu_id")Integer stu_id,@Param("stu_name")String stu_name,@Param("stu_pwd")String stu_pwd);
	public void DelTea(@Param("teacher_id")Integer teacher_id);
	public void DelStu(@Param("stu_id")Integer stu_id);
	public void AddTeacher(@Param("teacher_id")Integer teacher_id,@Param("teacher_name")String teacher_name,@Param("teacher_pwd")String teacher_pwd,@Param("teacher_subject")String teacher_subject);
	public void UpdateTea(@Param("teacher_id")Integer teacher_id,@Param("teacher_name")String teacher_name,@Param("teacher_subject")String teacher_subject,@Param("teacher_pwd")String teacher_pwd);
	public void UpdateStu(@Param("stu_id")Integer stu_id,@Param("stu_name")String stu_name,@Param("stu_pwd")String stu_pwd);
}
