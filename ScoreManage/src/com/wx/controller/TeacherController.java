package com.wx.controller;
import java.util.List;

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
import com.wx.po.Teacher;
import com.wx.po.User;
import com.wx.service.TeaService;
@Controller
public class TeacherController {
	@Autowired
	private TeaService teaService; 
	
	@RequestMapping("findTeacherById")
	@ResponseBody
	public Teacher findTeacherById(@RequestBody int teacher_id) {
		Teacher teacher = teaService.findTeacherById(teacher_id);
		return teacher;
	}
	
	@RequestMapping("/findAllTeacher")
	@ResponseBody 
	public List<Teacher> findAllTeacher() {
		List<Teacher> teacher = teaService.findAllTeacher();
		
		return teacher;
	}
	//跳转到添加成绩
	@RequestMapping(value="/TeaAddScore")
	public String toAddScore() {
		return  "TeaAdd";
	}
	
	//跳转到修改成绩
	@RequestMapping(value = "TeaUpdateScore")
	public String toUpdateScore(String stu_id,HttpSession session) {
		session.setAttribute("UPDATESID", stu_id);
		return "TeaUpdate";
	}
	
			
	
	
}
