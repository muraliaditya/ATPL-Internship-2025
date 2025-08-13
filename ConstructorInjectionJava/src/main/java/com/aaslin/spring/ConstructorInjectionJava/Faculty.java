package com.aaslin.spring.ConstructorInjectionJava;

public class Faculty {
    private String name;
    private Course course;

    public Faculty(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Teaches: " + course);
    }
}
