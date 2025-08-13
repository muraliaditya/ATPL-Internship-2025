package com.aaslin.spring.AutowiringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeFieldInjection {
    private String name = "Alice";

    @Autowired
    private Department department;

    public void showInfo() {
        System.out.println("Employee: " + name);
        System.out.println("Department: " + department.getName());
    }
}
