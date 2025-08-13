package com.aaslin.spring.BeanLifecycleAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TeacherAnno {

    public TeacherAnno() {
        System.out.println("TeacherAnno Constructor: Bean instance created");
    }

    @PostConstruct
    public void init() {
        System.out.println("TeacherAnno init(): @PostConstruct called");
    }

    public void teach() {
        System.out.println("TeacherAnno teach(): Teaching in progress...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("TeacherAnno destroy(): @PreDestroy called");
    }
}
