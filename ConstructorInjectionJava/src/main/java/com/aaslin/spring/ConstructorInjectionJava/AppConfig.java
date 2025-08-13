package com.aaslin.spring.ConstructorInjectionJava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Course course() {
        return new Course("Spring Framework", 4);
    }

    @Bean
    public Faculty faculty() {
        return new Faculty("Prof. Murali", course());
    }
}
