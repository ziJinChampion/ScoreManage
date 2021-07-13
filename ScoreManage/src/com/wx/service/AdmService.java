package com.wx.service;
import java.util.List;
import com.wx.po.Admin;
import com.wx.po.Student;
import com.wx.po.Teacher;

public interface AdmService {
	public Admin findAdminById(Integer admin_id);
	public List<Student> findAllStudent();
	public List<Teacher> findAllTeacher();
	public String AddStudent(Integer stu_id,String stu_name,String stu_pwd);
	public String AddTeacher(Integer teacher_id,String teacher_name,String teacher_pwd,String teacher_subject);
	public String DelTea(Integer teacher_id);
	public String DelStu(Integer stu_id);
	public String UpdateTea(Integer teacher_id,String teacher_name,String teacher_subject,String teacher_pwd);
	public String UpdateStu(Integer stu_id,String stu_name,String stu_pwd);
}
