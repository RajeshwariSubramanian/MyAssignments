package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("Student Name:Rajeshwari ");
	}
	public void studentDept()
	{
		System.out.println("Student Department: CSE ");
	}
	public void studentId()
	{
		System.out.println("Student Id: CSE1102 ");
	}

	public static void main(String[] args) {
		College col=new College();
		col.collegeCode();
		col.collegeName();
		col.collegeRank();
		
		Department dept=new Department();
		dept.deptName();
		dept.collegeCode();
		dept.collegeName();
		dept.collegeRank();
				
		Student stu=new Student();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		stu.deptName();
	  			
		
	}

}
