package com.aaslin.spring.IocContainerDemonstration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Student student() { 
    	return new Student("Aditya"); 
    	}
    @Bean
    public College college() { 
    	return new College(student()); 
    	}
}
