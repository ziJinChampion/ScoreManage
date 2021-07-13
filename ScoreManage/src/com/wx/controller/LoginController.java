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
import com.wx.po.User;
import com.wx.service.AdmService;
import com.wx.service.StuService;
import com.wx.service.TeaService;
@Controller
public class LoginController {
	@Autowired
	private StuService stuService;
	@Autowired
	private TeaService teaService;
	@Autowired
	private AdmService admService;
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String toLogin() {
		System.out.println("-------this------");
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String stulogin( String username, String password, String status,Model model,HttpSession session) {
		int user_id = Integer.parseInt(username);
		String user_pwd = password;
		String login_status = status;
System.out.println(username+password+login_status);

		if(login_status.equals("Stu")) {
			Student student = LoginCheckStu(user_id,user_pwd);
			if(student!=null) {
				session.setAttribute("USER_SESSION", (User)student);
				return "redirect:StuMain";
			}else {
				model.addAttribute("msg", "用户名或密码不正确，请重新登录");
	            return "login";
			}
		}else if(login_status.equals("Tea")) {
			Teacher teacher = LoginCheckTea(user_id,user_pwd);
			if(teacher!=null) {
				session.setAttribute("USER_SESSION", (User)teacher);
				return "redirect:TeaMain";
			}else {
				model.addAttribute("msg", "用户名或密码不正确，请重新登录");
	            return "login";
			}	
		}else if(login_status.equals("Adm")) {
			Admin admin = LoginCheckAdm(user_id,user_pwd);
			if(admin!=null) {
				session.setAttribute("USER_SESSION", (User)admin);
				return "redirect:AdmMain";
			}else {
				model.addAttribute("msg", "用户名或密码不正确，请重新登录");
	            return "login";
			}	
			
		}
		return null;
		
	}
	 private Student LoginCheckStu(int stu_id,String stu_pwd){
	        Student student = stuService.findStudentById(stu_id);
	        if(student == null || "".equals(student)){
	            return null;
	        }
	        if(student.getStu_pwd().equals(stu_pwd)){
	            return student;
	        }else{
	            return null;
	        }
	    }
	 private Teacher LoginCheckTea(int teacher_id,String teacher_pwd){
	        Teacher teacher = teaService.findTeacherById(teacher_id);
	        if(teacher == null || "".equals(teacher)){
	            return null;
	        }
	        if(teacher.getTeacher_pwd().equals(teacher_pwd)){
	            return teacher;
	        }else{
	            return null;
	        }
	    }
	 private Admin LoginCheckAdm(int Adm_id,String Adm_pwd){
	        Admin admin = admService.findAdminById(Adm_id);
	        if(admin == null || "".equals(admin)){
	            return null;
	        }
	        if(admin.getAdmin_pwd().equals(Adm_pwd)){
	            return admin;
	        }else{
	            return null;
	        }
	    }
	 /*
		 * 退出登录 三端可用
		 */
		@RequestMapping(value="/logout")
		public String logout(HttpSession session) {
			session.invalidate();
			return "redirect:login";
		}
		@RequestMapping("/StuMain")
		public String toStuMain() {
			return "StuMain";
		}
		
		@RequestMapping("/TeaMain")
		public String toTeaMain() {
			return "TeaMain";
		}
		@RequestMapping("/AdmMain")
		public String toAdmMain() {
			return "AdmMain";
		}
		
		
		
}
