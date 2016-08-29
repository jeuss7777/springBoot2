package com.arana.jesus.Controller;

import java.awt.PageAttributes.MediaType;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arana.jesus.Entity.Student;
import com.arana.jesus.Service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") int id){
		return studentService.getStudentById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void removeStudentById(@PathVariable("id") int id){
		studentService.removeStudentById(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void updateStudent(@RequestBody Student student){
		studentService.updateStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void insertStudentToDb(@RequestBody Student student){
		studentService.insertStudentToDb(student);
	}
	
}
