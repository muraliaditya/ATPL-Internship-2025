package com.aaslin.spring.multipledi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        University university = context.getBean("university", University.class);
        university.showDetails();
    }
}
