package com.wx.po;

public class Teacher extends User {

	private Integer teacher_id;
	private String teacher_name;
	private String teacher_pwd;
	private String teacher_subject;
	public String getTeacher_subject() {
		return teacher_subject;
	}
	public void setTeacher_subject(String teacher_subject) {
		this.teacher_subject = teacher_subject;
	}
	public Integer getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(Integer teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public String getTeacher_pwd() {
		return teacher_pwd;
	}
	public void setTeacher_pwd(String teacher_pwd) {
		this.teacher_pwd = teacher_pwd;
	}
	public Teacher(Integer teacher_id, String teacher_name, String teacher_pwd) {
		super();
		this.teacher_id = teacher_id;
		this.teacher_name = teacher_name;
		this.teacher_pwd = teacher_pwd;
	}
	
	public Teacher(Integer teacher_id) {
		super();
		this.teacher_id = teacher_id;
	}
	@Override
	public String toString() {
		return "Teacher [teacher_id=" + teacher_id + ", teacher_name=" + teacher_name + ", teacher_pwd=" + teacher_pwd
				+ "]";
	}
	public Teacher() {
		super();
	}
	public Teacher(Integer teacher_id, String teacher_name,String teacher_subject, String teacher_pwd ) {
		super();
		this.teacher_id = teacher_id;
		this.teacher_name = teacher_name;
		this.teacher_pwd = teacher_pwd;
		this.teacher_subject = teacher_subject;
	}
	
	
	
}
