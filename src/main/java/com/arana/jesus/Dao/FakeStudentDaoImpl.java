package com.arana.jesus.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.arana.jesus.Entity.Student;

@Repository
public class FakeStudentDaoImpl implements StudentDao {
	
	private static Map<Integer, Student> students;
	
	static {
		
		students = new HashMap<Integer, Student>(){
			{
			put(1,new Student(1,"Molly","Teaching"));
			put(2,new Student(2,"Jesus","Electronics"));
			put(3,new Student(3,"Barney","Study Couch Positions"));
			}
		};
	}
	
	
	/* (non-Javadoc)
	 * @see com.arana.jesus.Dao.StudentDao#getAllStudents()
	 */
	@Override
	public Collection<Student> getAllStudents(){
		return this.students.values();
	}
	
	/* (non-Javadoc)
	 * @see com.arana.jesus.Dao.StudentDao#getStudentById(int)
	 */
	@Override
	public Student getStudentById(int id){
		return this.students.get(id);
	}

	/* (non-Javadoc)
	 * @see com.arana.jesus.Dao.StudentDao#removeStudentById(int)
	 */
	@Override
	public void removeStudentById(int id) {
		this.students.remove(id);
	}
	
	/* (non-Javadoc)
	 * @see com.arana.jesus.Dao.StudentDao#updateStudent(com.arana.jesus.Entity.Student)
	 */
	@Override
	public void updateStudent(Student student){
		Student s = this.students.get(student.getId());
		s.setName(student.getName());
		s.setCourse(student.getCourse());
		students.put(student.getId(), s);
	}

	/* (non-Javadoc)
	 * @see com.arana.jesus.Dao.StudentDao#insertStudentToDb(com.arana.jesus.Entity.Student)
	 */
	@Override
	public void insertStudentToDb(Student student) {
		this.students.put(student.getId(), student);
	}
	
/*	public static void main(String[] args) {
	
	exemple33();
	}

	private static void exemple33() {
		
		
		
		Student myStudent = new Student(10,"Jeuss","Angular");
		System.out.println(myStudent.toString());
		
		Student s = students.get(1);
		System.out.println(s.toString());
		s.setName("Jeusso");
		s.setCourse("Anything");
		students.put(1, s);
		s = students.get(1);
		System.out.println(s.toString());
		
		}*/			
	
}
