package com.wx.po;

public class Score {
	private Integer score_id;
	private Integer stu_id;
	private Integer teacher_id;
	private String teacher_subject;
	private String stu_name;
	private double id_score;
	public Integer getScore_id() {
		return score_id;
	}
	public void setScore_id(Integer score_id) {
		this.score_id = score_id;
	}
	public Integer getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(Integer teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_subject() {
		return teacher_subject;
	}
	public void setTeacher_subject(String teacher_subject) {
		this.teacher_subject = teacher_subject;
	}
	public double getId_score() {
		return id_score;
	}
	public void setId_score(double id_score) {
		this.id_score = id_score;
	}
	@Override
	public String toString() {
		return "Score [score_id=" + score_id + ", stu_id=" + stu_id + ", teacher_id=" + teacher_id
				+ ", teacher_subject=" + teacher_subject + ", id_score=" + id_score + "]";
	}
	public Score(Integer score_id, Integer stu_id, Integer teacher_id, String teacher_subject, double id_score) {
		super();
		this.score_id = score_id;
		this.stu_id = stu_id;
		this.teacher_id = teacher_id;
		this.teacher_subject = teacher_subject;
		this.id_score = id_score;
	}
	public Score(Integer score_id, String teacher_subject, double id_score) {
		super();
		this.score_id = score_id;
		this.teacher_subject = teacher_subject;
		this.id_score = id_score;
	}
	public Score(Integer score_id,double id_score,String teacher_subject) {
		super();
		this.score_id = score_id;
		this.teacher_subject = teacher_subject;
		this.id_score = id_score;
	}
	public Score() {
		super();
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public void setStu_id(Integer stu_id) {
		this.stu_id = stu_id;
	}
	public Integer getStu_id() {
		return this.stu_id;
	}
	public Score(Integer score_id,Integer stu_id,String stu_name, double id_score) {
		super();
		this.score_id = score_id;
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.id_score = id_score;
	}
	
	
}
