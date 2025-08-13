package com.aaslin.spring.AutowiringDemo;
import org.springframework.stereotype.Component;

@Component
public class Department {
    private String name = "Computer Science";

	public String getName() {
		return name;
	}
}
