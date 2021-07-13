package com.wx.service;
import java.util.List;
import com.wx.po.Score;
public interface ScoService {
	public List<Score> StuQueryScore(Integer stu_id);
	public List<Score> TeaQueryScore(Integer teacher_id);
	public void TeaAddScore(Integer teacher_id,Integer stu_id,double id_score);
	public void TeaUpdateScore(Integer teacher_id,Integer stu_id,double id_score);
	public void TeaDeleteScore(Integer stu_id,Integer teacher_id);
}
