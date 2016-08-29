package com.arana.jesus.Entity;

public class Student {

	private int id;
	private String name;
	private String course;
	
	public Student(int id, String name, String course){
		this.id = id;
		this.name = name;
		this.course = course;
	}
	
	public Student(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return this.id + " - " + this.name + " - " + this.course;
	}
	
	/*public static void main(String[] args) {
		
		exemple33();
	}

	private static void exemple33() {
		
		
		
		Student myStudent = new Student(10,"Jeuss","Angular");
		System.out.println(myStudent.toString());
				
	}*/
	
}
