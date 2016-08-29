package com.arana.jesus.Dao;

import java.util.Collection;

import com.arana.jesus.Entity.Student;

public interface StudentDao {

	public abstract Collection<Student> getAllStudents();

	public abstract Student getStudentById(int id);

	public abstract void removeStudentById(int id);

	public abstract void updateStudent(Student student);

	public abstract void insertStudentToDb(Student student);

}