package com.example.first.spring.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.first.spring.project.dao.StudentDao;
import com.example.first.spring.project.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	 
	public Student getStudent(int id){
		return studentDao.findOne(id);
	}
	public void saveStudent(Student student){
		studentDao.save(student);	
	}
	public void updateStudent(Student student){
		studentDao.save(student);	
	}
	public void deleteStudent(int id){
		studentDao.delete(id);
	}
	public List<Student> getAllStudents(){
		return (List<Student>)studentDao.findAll();
	}
}
