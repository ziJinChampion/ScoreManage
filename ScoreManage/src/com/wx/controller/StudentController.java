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

import com.wx.po.Student;
import com.wx.po.User;
import com.wx.service.StuService;
@Controller
public class StudentController {
	@Autowired
	private StuService stuService;
	@RequestMapping("/findStudentById")
	@ResponseBody
	public Student findStudentById(@RequestBody int stu_id) {
		Student student = stuService.findStudentById(stu_id);
		return student;
	}
	
	@RequestMapping("/findAllStudent")
	@ResponseBody 
	public List<Student> findAllStudent() {
		List<Student> student = stuService.findAllStudent();
		
		return student;
	}
	
	

}
