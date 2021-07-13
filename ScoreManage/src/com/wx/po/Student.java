package com.wx.po;

public class Student  extends User{
	private Integer stu_id;
	private String stu_name;
	private String stu_pwd;

	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getStu_pwd() {
		return stu_pwd;
	}
	public void setStu_pwd(String stu_pwd) {
		this.stu_pwd = stu_pwd;
	}
	

	
	public Student() {
		super();
	}
	public Student(Integer stu_id) {
		super();
		this.stu_id = stu_id;
	}
	public Student(Integer stu_id, String stu_name, String stu_pwd) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.stu_pwd = stu_pwd;
	}
	public Integer getStu_id() {
		return stu_id;
	}
	public void setStu_id(Integer stu_id) {
		this.stu_id = stu_id;
	}
	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + ", stu_name=" + stu_name + ", stu_pwd=" + stu_pwd + "]";
	}
	

}
