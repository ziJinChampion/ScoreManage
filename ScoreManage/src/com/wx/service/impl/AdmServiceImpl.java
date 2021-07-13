package com.wx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.wx.dao.AdminDAO;
import com.wx.po.Admin;
import com.wx.po.Student;
import com.wx.po.Teacher;
import com.wx.service.AdmService;
@Service
@Transactional
public class AdmServiceImpl implements AdmService {
	@Autowired
	private AdminDAO adminDAO;
	
	public Admin findAdminById(Integer admin_id) {
		return this.adminDAO.findAdminById(admin_id);
	}
	public List<Student> findAllStudent(){
		return this.adminDAO.findAllStudent();
	}
	public List<Teacher> findAllTeacher(){
		return this.adminDAO.findAllTeacher();
	}
	public String AddStudent(Integer stu_id,String stu_name,String stu_pwd) {
		this.adminDAO.AddStudent(stu_id,stu_name,stu_pwd);
		return "200";
	}
	public String AddTeacher(Integer teacher_id,String teacher_name,String teacher_pwd,String teacher_subject) {
		this.adminDAO.AddTeacher(teacher_id, teacher_name, teacher_pwd, teacher_subject);
		return "200";
	}
	@Override
	public String DelTea(Integer teacher_id) {
		this.adminDAO.DelTea(teacher_id);
		return "200";
	}
	@Override
	public String DelStu(Integer stu_id) {
		this.adminDAO.DelStu(stu_id);
		return "200";
	}
	@Override
	public String UpdateTea(Integer teacher_id, String teacher_name, String teacher_subject, String teacher_pwd) {
		
		
		this.adminDAO.UpdateTea(teacher_id, teacher_name, teacher_subject, teacher_pwd);
		return "200";
	}
	@Override
	public String UpdateStu(Integer stu_id, String stu_name, String stu_pwd) {
		this.adminDAO.UpdateStu(stu_id, stu_name, stu_pwd);
		return "200";
	}
}
