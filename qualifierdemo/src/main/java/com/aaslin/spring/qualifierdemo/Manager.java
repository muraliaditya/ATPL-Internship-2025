package com.aaslin.spring.qualifierdemo;

import org.springframework.stereotype.Component;

@Component("manager")
public class Manager implements Leader {
    @Override
    public void lead() {
        System.out.println("Manager: Overseeing the entire project.");
    }
}
