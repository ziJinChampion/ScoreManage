package com.wx.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.wx.dao.ScoreDAO;
import com.wx.po.Score;
import com.wx.service.ScoService;
@Service 
@Transactional
public class ScoServiceImpl implements ScoService{
	@Autowired
	private ScoreDAO scoreDAO;
	
	public List<Score> StuQueryScore(Integer stu_id){
		return this.scoreDAO.StuQueryScore(stu_id);

	}
	
	public List<Score> TeaQueryScore(Integer teacher_id){
		return this.scoreDAO.TeaQueryScore(teacher_id);
	}
	public void TeaAddScore(Integer teacher_id,Integer stu_id,double id_score) {
		scoreDAO.TeaAddScore(teacher_id,stu_id,id_score);
	}
	public void TeaUpdateScore(Integer teacher_id,Integer stu_id,double id_score) {
		scoreDAO.TeaUpdateScore(teacher_id,stu_id,id_score);
	}
	public void TeaDeleteScore(Integer stu_id,Integer teacher_id) {
		scoreDAO.TeaDeleteScore(stu_id,teacher_id);
	}

}
