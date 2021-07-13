package com.wx.dao;
import java.util.List;
import com.wx.po.Student;
public interface StudentDAO {
	public List<Student> findAllStudent();
	public Student findStudentById(int stu_id);

}
