package com.wx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wx.po.Score;

public interface ScoreDAO {
	public List<Score> StuQueryScore(Integer stu_id);
	public List<Score> TeaQueryScore(Integer teacher_id);
	public void TeaAddScore(@Param("teacher_id")Integer teacher_id,@Param("stu_id")Integer stu_id,@Param("id_score")double id_score);
	public void TeaUpdateScore(@Param("teacher_id")Integer teacher_id,@Param("stu_id")Integer stu_id,@Param("id_score")double id_score);
	public void TeaDeleteScore(@Param("stu_id")Integer stu_id,@Param("teacher_id")Integer teacher_id);

	
}
