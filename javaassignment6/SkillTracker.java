package com.practice;
import java.util.*;

public class SkillTracker {
    public static void main(String[] args) {
        Map<String, Set<String>> skills = new HashMap<>();
        skills.put("Jay", new HashSet<>(Arrays.asList("English", "Science","Social")));
        skills.put("Dev", new HashSet<>(Arrays.asList("Social", "Science","Maths")));

        System.out.print("Employees with Science skill:");
        for (String emp : skills.keySet()) {
            if (skills.get(emp).contains("Science")) {
                System.out.println(emp+" ,");
            }
        }

        Set<String> commonskills = new HashSet<>(skills.get("Jay"));
        commonskills.retainAll(skills.get("Dev"));
        System.out.println("Common skills: " + commonskills);
    }
}
