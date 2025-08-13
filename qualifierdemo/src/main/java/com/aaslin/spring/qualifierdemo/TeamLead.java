package com.aaslin.spring.qualifierdemo;

import org.springframework.stereotype.Component;

@Component("teamLead")
public class TeamLead implements Leader {
    @Override
    public void lead() {
        System.out.println("Team Lead: Coordinating daily tasks with the team.");
    }
}
