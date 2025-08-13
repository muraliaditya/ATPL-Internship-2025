package com.aaslin.spring.BeanLifecycle;

public class Teacher {
    public void init() {
    	System.out.println("Teacher bean initialized"); 
    	}
    public void destroy() {
    	System.out.println("Teacher bean destroyed");
    	}
}
