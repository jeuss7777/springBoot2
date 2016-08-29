package com.arana.jesus.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arana.jesus.Dao.StudentDao;
import com.arana.jesus.Entity.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;
	
	public Collection<Student> getAllStudents(){
		return this.studentDao.getAllStudents();
	}
	
	public Student getStudentById(int id){
		return this.studentDao.getStudentById(id);
	}

	public void removeStudentById(int id) {
		this.studentDao.removeStudentById(id);
		
	}
	
	public void updateStudent(Student student){
		this.studentDao.updateStudent(student);
	}

	public void insertStudentToDb(Student student) {
		this.studentDao.insertStudentToDb(student);
		
	}
	
/*public static void main(String[] args) {
		
		exemple33();
	}

	private static void exemple33() {
		
		Student myStudent = new Student(10,"Jeuss","Angular");
		System.out.println(myStudent.toString());
		
				
	}*/
	
}
