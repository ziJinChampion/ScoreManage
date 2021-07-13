package com.wx.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wx.po.Admin;
import com.wx.po.Student;
import com.wx.po.Teacher;
import com.wx.service.AdmService;
import com.wx.service.StuService;
import com.wx.service.TeaService;
@Controller
public class AdminController {
	@Autowired
	private AdmService admService;
	@Autowired
	private TeaService teaService;
	@Autowired
	private StuService stuService;
	@RequestMapping("/findAdminById")
	@ResponseBody
	public Admin findAdminById(@RequestBody int adm_id) {
		Admin Admin = admService.findAdminById(adm_id);
		return Admin;
	}
	@RequestMapping("/AdminQueryStudent")
	@ResponseBody
	public List<Student> findAllStudent(){
		List<Student> students = admService.findAllStudent();
		return students;
	}
	@RequestMapping("/AdminQueryTeacher")
	@ResponseBody
	public List<Teacher> findAllTeacher(){
		List<Teacher> teachers = admService.findAllTeacher();
		return teachers;
	}
	
	//跳转到添加学生
		@RequestMapping(value="/AdminAddStu")
		public String toAddStu() {
			return  "AdminAddStu";
		}
	//跳转到添加教师
		@RequestMapping("/AdminAddTea")
		public String toAddTea() {
			return "AdminAddTea";
		}
	@RequestMapping("/AddStudent")
	public String AdminAddStudent(String stu_id,String stu_name,String stu_pwd) {
		Integer stu_id1=Integer.parseInt(stu_id);
		admService.AddStudent(stu_id1,stu_name, stu_pwd);
		return "AdmMain";
	}
	@RequestMapping("/AddTeacher")
	public String AdminAddTeacher(String teacher_id,String teacher_name,String teacher_pwd,String teacher_subject) {
		Integer teacher_id1=Integer.parseInt(teacher_id);
		admService.AddTeacher(teacher_id1,teacher_name, teacher_pwd,teacher_subject);
		return "AdmMain";
	}
	@RequestMapping("AdminDeleteTea")
	@ResponseBody
	public String AdminDelTea(HttpServletRequest request) {
		Integer teacher_id = Integer.parseInt(request.getParameter("teacher_id"));
		admService.DelTea(teacher_id);
		return "200";
	}
	@RequestMapping("AdminDeleteStu")
	@ResponseBody
	public String AdminDelStu(HttpServletRequest request) {
		Integer stu_id = Integer.parseInt(request.getParameter("stu_id"));
		admService.DelStu(stu_id);
		return "200";
	}
	@RequestMapping("/UpdateTea")
	public String AdminUpdateTea(String teacher_id,String teacher_name,String teacher_subject,String teacher_pwd) {
		Integer teacher_id1 = Integer.parseInt(teacher_id);
		this.admService.UpdateTea(teacher_id1, teacher_name, teacher_subject, teacher_pwd);
		return "AdmMain";
	}
	@RequestMapping("/UpdateStu")
	public String AdminUpdateStu(String stu_id,String stu_name,String stu_pwd) {
		Integer stu_id1 = Integer.parseInt(stu_id);
		this.admService.UpdateStu(stu_id1, stu_name, stu_pwd);
		return "AdmMain";
	}
	@RequestMapping("AdminUpdateTea")
	public String toUpdateTea(String teacher_id , HttpSession session) {
		Integer teacher_id1  = Integer.parseInt(teacher_id);
		Teacher teacher = this.teaService.findTeacherById(teacher_id1);
		session.setAttribute("UPDATE_SESSION", teacher);
		return "AdminUpdateTea";
	}
	@RequestMapping("AdminUpdateStu")
	public String toUpdateStu(String stu_id , HttpSession session) {
		Integer stu_id1  = Integer.parseInt(stu_id);
		Student student= this.stuService.findStudentById(stu_id1);
		session.setAttribute("UPDATE_SESSION", student);
		return "AdminUpdateStu";
	}
	
	
}

