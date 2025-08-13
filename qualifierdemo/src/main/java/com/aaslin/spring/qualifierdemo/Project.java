package com.aaslin.spring.qualifierdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Project {

    private Leader leader;

    @Autowired
    public Project(@Qualifier("teamLead") Leader leader) {
        this.leader = leader;
    }

    public void startProject() {
        System.out.println("Project is starting...");
        leader.lead();
    }
}
