package com.aaslin.spring.componentscandemo;

import org.springframework.stereotype.Component;

@Component
public class Trainer {
    private String name = "Mr. John Doe";
    private String expertise = "Java Full Stack";

	public String getName() {
		return name;
	}

	public String getExpertise() {
		return expertise;
	}
}
