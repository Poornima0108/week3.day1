package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("Student name: Poornima");
	}
	
	public void studentDept() {
		System.out.println("Student Dept: IT");
	}
	
	public void studentId() {
		System.out.println("Student ID: 201312345");
	}
	
	public static void main(String[] args) {
		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentDept();
		stud.studentId();

	}

}
