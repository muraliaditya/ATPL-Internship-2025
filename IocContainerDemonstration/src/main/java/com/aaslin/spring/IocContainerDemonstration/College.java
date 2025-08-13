package com.aaslin.spring.IocContainerDemonstration;


public class College {
private Student student;
public College(Student student) { 
	this.student = student; 
	}
public void show() { 
	student.display(); 
	}
}
