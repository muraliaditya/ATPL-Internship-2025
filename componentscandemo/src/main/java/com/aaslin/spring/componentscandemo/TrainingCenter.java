package com.aaslin.spring.componentscandemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrainingCenter {

    @Autowired
    private Trainer trainer;

    public void showTrainerDetails() {
        System.out.println("Trainer Name: " + trainer.getName());
        System.out.println("Expertise: " + trainer.getExpertise());
    }
}
