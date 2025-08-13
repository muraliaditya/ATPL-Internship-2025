package com.aaslin.spring.AutowiringDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeSetterInjection {
    private String name = "Bob";
    private Department department;

    @Autowired
    public void setDepartment(Department department) { 
        this.department = department;
    }

    public void showInfo() {
        System.out.println("Employee: " + name);
        System.out.println("Department: " + department.getName());
    }
}
