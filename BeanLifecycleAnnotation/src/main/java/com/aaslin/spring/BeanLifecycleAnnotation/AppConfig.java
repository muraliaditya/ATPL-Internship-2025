package com.aaslin.spring.BeanLifecycleAnnotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public TeacherAnno teacherAnno() {
        return new TeacherAnno();
    }
}
