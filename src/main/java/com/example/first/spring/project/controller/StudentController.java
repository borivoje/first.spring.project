package com.example.first.spring.project.controller;

import com.example.first.spring.project.entity.Student;
import com.example.first.spring.project.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class StudentController {
	
	@Autowired
    private StudentService studentService;

	@RequestMapping(value="/save", method = RequestMethod.POST)
    public void save(@RequestBody Student student) {
    	studentService.saveStudent(student);
    }
	@RequestMapping(value="/update/{id}", method = RequestMethod.PUT)
    public void update(@RequestBody Student student,@PathVariable int id) {
    	studentService.saveStudent(student);
    }
    @RequestMapping(value="/getstudent/{id}")
    public Student get(@PathVariable int id) {
    	return studentService.getStudent(id);
    }
    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id) {
    	studentService.deleteStudent(id);
    }
   @RequestMapping(name="/getstudents")
    public List<Student> getAll(){
    	return studentService.getAllStudents();
    }
}
