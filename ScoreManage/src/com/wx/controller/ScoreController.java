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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wx.po.Score;
import com.wx.po.Student;
import com.wx.po.Teacher;
import com.wx.service.ScoService;

@Controller
public class ScoreController {
	@Autowired
	private ScoService scoService;
	@RequestMapping("/StuQueryScore")
	@ResponseBody
	public List<Score> StuQueryScore(HttpServletRequest request) {
		Integer stu_id = Integer.parseInt(request.getParameter("stu_id"));	 	
		List<Score> Scores = scoService.StuQueryScore(stu_id);
		return Scores;
	}
	
	@RequestMapping("/TeaQueryScore")
	@ResponseBody 
	public List<Score> TeaQueryScore(HttpServletRequest request) {
		Integer teacher_id = Integer.parseInt(request.getParameter("teacher_id"));
		List<Score> Scores = scoService.TeaQueryScore(teacher_id);
		return Scores;
	}
	@RequestMapping("/AddScore")
	public String TeaAddScore(String stu_id,String id_score,HttpSession session) {
		Integer teacher_id = ((Teacher)session.getAttribute("USER_SESSION")).getTeacher_id();
		Integer stu_id1=Integer.parseInt(stu_id);
		double id_score1 = Double.parseDouble(id_score);
		scoService.TeaAddScore(teacher_id,stu_id1, id_score1);
		return "TeaMain";
		
	}
	@RequestMapping("/UpdateScore")
	public String TeaUpdateScore(String stu_id,String id_score,HttpSession session) {
		Integer teacher_id = ((Teacher)session.getAttribute("USER_SESSION")).getTeacher_id();
		Integer stu_id1=Integer.parseInt(stu_id);
		double id_score1 = Double.parseDouble(id_score);
		scoService.TeaUpdateScore(teacher_id,stu_id1, id_score1);
		return "TeaMain";
		
	}
	@RequestMapping("/TeaDeleteScore")
	@ResponseBody
	public String TeaDeleteScore(HttpServletRequest request,HttpSession session) {
		Integer stu_id = Integer.parseInt(request.getParameter("stu_id"));
		Integer teacher_id = ((Teacher)session.getAttribute("USER_SESSION")).getTeacher_id();
		scoService.TeaDeleteScore(stu_id,teacher_id);
		return "yes";
	}
	
	

}
