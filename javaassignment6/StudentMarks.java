package com.practice;
import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Ram", 90);
        marks.put("Dev", 80);
        marks.put("Baba", 95);
        marks.put("Jay", 60);
        marks.put("Roy", 85);

        Map.Entry<String, Integer> top = Collections.max(marks.entrySet(), Map.Entry.comparingByValue());
        Map.Entry<String, Integer> bottom = Collections.min(marks.entrySet(), Map.Entry.comparingByValue());

        System.out.println("Topper: " + top.getKey());
        System.out.println("Lowest: " + bottom.getKey());
    }
}